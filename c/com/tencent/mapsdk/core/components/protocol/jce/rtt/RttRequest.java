package com.tencent.mapsdk.core.components.protocol.jce.rtt;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.mapsdk.internal.C113864k;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;
import com.tencent.mapsdk.internal.C114095q;
import com.tencent.mapsdk.internal.C80339cq;
import java.util.ArrayList;

public final class RttRequest extends MapJceStruct implements Cloneable {

    /* renamed from: a */
    public static ArrayList<Integer> f339562a = new ArrayList<>();

    /* renamed from: b */
    public static int f339563b = 0;

    /* renamed from: c */
    public static ArrayList<Long> f339564c = new ArrayList<>();

    /* renamed from: d */
    public static final /* synthetic */ boolean f339565d = true;
    public ArrayList<Integer> bounds;
    public ArrayList<Long> crcs;
    public int type;
    public short zip;
    public short zoom;

    static {
        Class<RttRequest> cls = RttRequest.class;
        f339562a.add(0);
        f339564c.add(0L);
    }

    public RttRequest() {
        this.bounds = null;
        this.zoom = 0;
        this.zip = 0;
        this.type = C80339cq.f235168c.f235177a;
        this.crcs = null;
    }

    public final String className() {
        return "navsns.RttRequest";
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f339565d) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final void display(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172261a(this.bounds, "bounds");
        kVar.mo172264a(this.zoom, V2TXJSAdapterConstants.PUSHER_KEY_ZOOM);
        kVar.mo172264a(this.zip, "zip");
        kVar.mo172253a(this.type, "type");
        kVar.mo172261a(this.crcs, "crcs");
    }

    public final void displaySimple(StringBuilder sb, int i) {
        C113864k kVar = new C113864k(sb, i);
        kVar.mo172262a(this.bounds, true);
        kVar.mo172265a(this.zoom, true);
        kVar.mo172265a(this.zip, true);
        kVar.mo172254a(this.type, true);
        kVar.mo172262a(this.crcs, false);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        RttRequest rttRequest = (RttRequest) obj;
        return C114095q.m158991a((Object) this.bounds, (Object) rttRequest.bounds) && C114095q.m158992a(this.zoom, rttRequest.zoom) && C114095q.m158992a(this.zip, rttRequest.zip) && C114095q.m158989a(this.type, rttRequest.type) && C114095q.m158991a((Object) this.crcs, (Object) rttRequest.crcs);
    }

    public final ArrayList<Integer> getBounds() {
        return this.bounds;
    }

    public final ArrayList<Long> getCrcs() {
        return this.crcs;
    }

    public final int getType() {
        return this.type;
    }

    public final short getZip() {
        return this.zip;
    }

    public final short getZoom() {
        return this.zoom;
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void readFrom(C113953m mVar) {
        this.bounds = (ArrayList) mVar.mo172384a(f339562a, 0, true);
        this.zoom = mVar.mo172386a(this.zoom, 1, true);
        this.zip = mVar.mo172386a(this.zip, 2, true);
        this.type = mVar.mo172379a(this.type, 3, false);
        this.crcs = (ArrayList) mVar.mo172384a(f339564c, 4, false);
    }

    public final void setBounds(ArrayList<Integer> arrayList) {
        this.bounds = arrayList;
    }

    public final void setCrcs(ArrayList<Long> arrayList) {
        this.crcs = arrayList;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setZip(short s) {
        this.zip = s;
    }

    public final void setZoom(short s) {
        this.zoom = s;
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172518a(this.bounds, 0);
        nVar.mo172520a(this.zoom, 1);
        nVar.mo172520a(this.zip, 2);
        nVar.mo172513a(this.type, 3);
        ArrayList<Long> arrayList = this.crcs;
        if (arrayList != null) {
            nVar.mo172518a(arrayList, 4);
        }
    }

    public RttRequest(ArrayList<Integer> arrayList, short s, short s2, int i, ArrayList<Long> arrayList2) {
        this.bounds = null;
        this.zoom = 0;
        this.zip = 0;
        int i2 = C80339cq.f235168c.f235177a;
        this.bounds = arrayList;
        this.zoom = s;
        this.zip = s2;
        this.type = i;
        this.crcs = arrayList2;
    }
}
