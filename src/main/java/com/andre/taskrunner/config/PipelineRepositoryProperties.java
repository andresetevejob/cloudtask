package com.andre.taskrunner.config;

public class PipelineRepositoryProperties {
    private GitProperties git;
    private ClasspathProperties classpath;

    public GitProperties getGit() {
        return git;
    }

    public void setGit(GitProperties aGit) {
        git = aGit;
    }

    public ClasspathProperties getClasspath() {
        return classpath;
    }

    public void setClasspath(ClasspathProperties aClasspath) {
        classpath = aClasspath;
    }

    public static class ClasspathProperties {

        private boolean enabled = false;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean aEnabled) {
            enabled = aEnabled;
        }

    }
    public static class GitProperties{
        private boolean enabled = false;
        private String url;
        private String[] searchPaths;
        private String branch = "master";
        private String username;
        private String password;

        public String getUrl() {
            return url;
        }

        public void setUrl(String aUrl) {
            url = aUrl;
        }

        public String[] getSearchPaths() {
            return searchPaths;
        }

        public void setSearchPaths(String[] aSearchPaths) {
            searchPaths = aSearchPaths;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean aEnabled) {
            enabled = aEnabled;
        }

        public String getBranch() {
            return branch;
        }

        public void setBranch(String aBranch) {
            branch = aBranch;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String aUsername) {
            username = aUsername;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String aPassword) {
            password = aPassword;
        }

    }

}
