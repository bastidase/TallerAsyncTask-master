package com.jonmid.tallerasynctask;

/**
 * Created by erickdavid on 17/04/2017.
 */

public class Post {

        private int id;
        private String title;
        private String body;

        public int getId(){
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
}
