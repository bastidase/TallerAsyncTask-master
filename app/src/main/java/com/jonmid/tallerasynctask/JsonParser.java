package com.jonmid.tallerasynctask;

/**
 * Created by erickdavid on 17/04/2017.
 */

import com.jonmid.tallerasynctask.Post;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    public static List<Post> parse(String content) throws Exception{
        JSONArray jsonArray = new JSONArray(content);
        List<Post> mysPost = new ArrayList<>();

        for(int i =0; i<jsonArray.length();i++){
            JSONObject jsomItem = jsonArray.getJSONObject(i);

            Post post = new Post();
            post.setId(jsomItem.getInt("id"));
            post.setTitle(jsomItem.getString("title"));
            post.setBody(jsomItem.getString("body"));

            mysPost.add(post);
        }

        return mysPost;
    }



}
