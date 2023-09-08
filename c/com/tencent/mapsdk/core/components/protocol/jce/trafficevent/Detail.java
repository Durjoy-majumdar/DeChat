package com.tencent.mapsdk.core.components.protocol.jce.trafficevent;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;
import com.tencent.mapsdk.internal.C114029p;
import java.util.ArrayList;

public final class Detail extends MapJceStruct {

    /* renamed from: a */
    public static Basic f339578a = new Basic();

    /* renamed from: b */
    public static ArrayList<Float> f339579b = new ArrayList<>();
    public Basic basic;
    public ArrayList<Float> coord;

    static {
        f339579b.add(Float.valueOf(0.0f));
    }

    public Detail() {
        this.basic = null;
        this.coord = null;
    }

    public final void readFrom(C113953m mVar) {
        this.basic = (Basic) mVar.mo172383a((C114029p) f339578a, 0, true);
        this.coord = (ArrayList) mVar.mo172384a(f339579b, 1, false);
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172515a((C114029p) this.basic, 0);
        ArrayList<Float> arrayList = this.coord;
        if (arrayList != null) {
            nVar.mo172518a(arrayList, 1);
        }
    }

    public Detail(Basic basic2, ArrayList<Float> arrayList) {
        this.basic = basic2;
        this.coord = arrayList;
    }
}
