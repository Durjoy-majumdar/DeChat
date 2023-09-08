package com.tencent.midas.download;

public class APMidasPluginDownInfo {
    public String diff_md5 = "";
    public String down_url = "";
    public String full_url = "";
    public int fullsize = 0;
    public boolean is_force = false;
    public boolean is_split = false;
    public String name = "";
    public String new_md5_decode = "";
    public String new_md5_encode = "";
    public String old_md5 = "";
    public int size = 0;
    public String split_download_url;
    public int update_version = 0;

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof APMidasPluginDownInfo)) {
            return this.name.equals(((APMidasPluginDownInfo) obj).name);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
