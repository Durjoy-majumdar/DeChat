package com.tencent.mapsdk.core.components.protocol.jce.trafficevent;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;

public final class Basic extends MapJceStruct {
    public float anchor_x;
    public float anchor_y;
    public String brief;
    public int confidence;
    public float coord_lat;
    public float coord_lon;
    public int end_time;
    public String eventid;
    public String icon_highlight;
    public String icon_normal;
    public int max_scale;
    public String message;
    public int min_scale;
    public String roadname;
    public String source;
    public int start_time;
    public int subtype;
    public int type;
    public int update_time;

    public Basic() {
        this.eventid = "";
        this.source = "";
        this.type = 0;
        this.subtype = 0;
        this.coord_lat = 0.0f;
        this.coord_lon = 0.0f;
        this.brief = "";
        this.message = "";
        this.confidence = 0;
        this.start_time = 0;
        this.end_time = 0;
        this.update_time = 0;
        this.roadname = "";
        this.icon_normal = "";
        this.icon_highlight = "";
        this.anchor_x = 0.0f;
        this.anchor_y = 0.0f;
        this.min_scale = 0;
        this.max_scale = 0;
    }

    public final void readFrom(C113953m mVar) {
        this.eventid = mVar.mo172389b(0, true);
        this.source = mVar.mo172389b(1, true);
        this.type = mVar.mo172379a(this.type, 2, true);
        this.subtype = mVar.mo172379a(this.subtype, 3, false);
        this.coord_lat = mVar.mo172378a(this.coord_lat, 4, false);
        this.coord_lon = mVar.mo172378a(this.coord_lon, 5, false);
        this.brief = mVar.mo172389b(6, false);
        this.message = mVar.mo172389b(7, false);
        this.confidence = mVar.mo172379a(this.confidence, 8, true);
        this.start_time = mVar.mo172379a(this.start_time, 9, false);
        this.end_time = mVar.mo172379a(this.end_time, 10, false);
        this.update_time = mVar.mo172379a(this.update_time, 11, false);
        this.roadname = mVar.mo172389b(12, false);
        this.icon_normal = mVar.mo172389b(13, true);
        this.icon_highlight = mVar.mo172389b(14, true);
        this.anchor_x = mVar.mo172378a(this.anchor_x, 15, true);
        this.anchor_y = mVar.mo172378a(this.anchor_y, 16, true);
        this.min_scale = mVar.mo172379a(this.min_scale, 17, true);
        this.max_scale = mVar.mo172379a(this.max_scale, 18, true);
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172517a(this.eventid, 0);
        nVar.mo172517a(this.source, 1);
        nVar.mo172513a(this.type, 2);
        nVar.mo172513a(this.subtype, 3);
        nVar.mo172512a(this.coord_lat, 4);
        nVar.mo172512a(this.coord_lon, 5);
        String str = this.brief;
        if (str != null) {
            nVar.mo172517a(str, 6);
        }
        String str2 = this.message;
        if (str2 != null) {
            nVar.mo172517a(str2, 7);
        }
        nVar.mo172513a(this.confidence, 8);
        nVar.mo172513a(this.start_time, 9);
        nVar.mo172513a(this.end_time, 10);
        nVar.mo172513a(this.update_time, 11);
        String str3 = this.roadname;
        if (str3 != null) {
            nVar.mo172517a(str3, 12);
        }
        nVar.mo172517a(this.icon_normal, 13);
        nVar.mo172517a(this.icon_highlight, 14);
        nVar.mo172512a(this.anchor_x, 15);
        nVar.mo172512a(this.anchor_y, 16);
        nVar.mo172513a(this.min_scale, 17);
        nVar.mo172513a(this.max_scale, 18);
    }

    public Basic(String str, String str2, int i, int i2, float f, float f2, String str3, String str4, int i3, int i4, int i5, int i6, String str5, String str6, String str7, float f3, float f4, int i7, int i8) {
        this.eventid = str;
        this.source = str2;
        this.type = i;
        this.subtype = i2;
        this.coord_lat = f;
        this.coord_lon = f2;
        this.brief = str3;
        this.message = str4;
        this.confidence = i3;
        this.start_time = i4;
        this.end_time = i5;
        this.update_time = i6;
        this.roadname = str5;
        this.icon_normal = str6;
        this.icon_highlight = str7;
        this.anchor_x = f3;
        this.anchor_y = f4;
        this.min_scale = i7;
        this.max_scale = i8;
    }
}
