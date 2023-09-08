package com.tencent.mapsdk.core.components.protocol.jce.trafficevent;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;
import java.util.ArrayList;

public final class Response extends MapJceStruct {

    /* renamed from: a */
    public static ArrayList<Detail> f339580a = new ArrayList<>();
    public ArrayList<Detail> detail;
    public short error;
    public String msg;

    static {
        f339580a.add(new Detail());
    }

    public Response() {
        this.error = 0;
        this.msg = "";
        this.detail = null;
    }

    public final void readFrom(C113953m mVar) {
        this.error = mVar.mo172386a(this.error, 0, true);
        this.msg = mVar.mo172389b(1, false);
        this.detail = (ArrayList) mVar.mo172384a(f339580a, 2, false);
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172520a(this.error, 0);
        String str = this.msg;
        if (str != null) {
            nVar.mo172517a(str, 1);
        }
        ArrayList<Detail> arrayList = this.detail;
        if (arrayList != null) {
            nVar.mo172518a(arrayList, 2);
        }
    }

    public Response(short s, String str, ArrayList<Detail> arrayList) {
        this.error = s;
        this.msg = str;
        this.detail = arrayList;
    }
}
