package com.tencent.map.lib.models;

public class MapTileID {
    private int dataSource;
    private int priority;
    private int tileTag;
    private String url;

    /* renamed from: x */
    private int f339548x;

    /* renamed from: y */
    private int f339549y;

    /* renamed from: z */
    private int f339550z;

    public DataSource getDataSource() {
        return DataSource.get(this.dataSource);
    }

    public DownloadPriority getPriority() {
        return DownloadPriority.get(this.priority);
    }

    public int getTileTag() {
        return this.tileTag;
    }

    public String getUrl() {
        return this.url;
    }

    public int getX() {
        return this.f339548x;
    }

    public int getY() {
        return this.f339549y;
    }

    public int getZ() {
        return this.f339550z;
    }

    public String toString() {
        return "MapTileID{x=" + this.f339548x + ", y=" + this.f339549y + ", z=" + this.f339550z + ", url='" + this.url + '\'' + ", priority=" + this.priority + ", dataSource=" + this.dataSource + ", tileTag=" + this.tileTag + '}';
    }
}
