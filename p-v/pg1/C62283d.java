package pg1;

import al1.C54130j;
import android.os.Bundle;
import c30.C104289g;
import cl1.C39970c;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import eb0.C31543z5;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13604l;
import sk1.C63947a;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C64265bq2;
import te3.C64500kt2;
import te3.C64535lt2;
import te3.C64640px0;
import vo1.C65818s0;
import z04.C119027c;

/* renamed from: pg1.d */
public final class C62283d extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f177049f = "LiveSeiSlice";

    /* renamed from: g */
    public String f177050g = "";

    /* renamed from: h */
    public C65818s0 f177051h;

    /* renamed from: i */
    public boolean f177052i;

    /* renamed from: j */
    public boolean f177053j;

    /* renamed from: pg1.d$a */
    public static final class C62284a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f177054d;

        /* renamed from: e */
        public final /* synthetic */ C64500kt2 f177055e;

        /* renamed from: f */
        public final /* synthetic */ C62283d f177056f;

        /* renamed from: g */
        public final /* synthetic */ LinkedList<C54130j> f177057g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62284a(C8477a0 a0Var, C64500kt2 kt22, C62283d dVar, LinkedList<C54130j> linkedList) {
            super(0);
            this.f177054d = a0Var;
            this.f177055e = kt22;
            this.f177056f = dVar;
            this.f177057g = linkedList;
        }

        public Object invoke() {
            T t;
            Class cls = C54963d0.class;
            if (this.f177054d.f27482d) {
                T t2 = null;
                if (this.f177055e.f183982d.size() == 1) {
                    List<C54130j> list = ((C54963d0) this.f177056f.business(cls)).f154076s;
                    C87412m.m108593f(list, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                    C64500kt2 kt22 = this.f177055e;
                    synchronized (list) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (Util.isEqual(((C54130j) t).f151997a, kt22.f183982d.get(0).f184154d)) {
                                break;
                            }
                        }
                    }
                    C54130j jVar = (C54130j) t;
                    if (jVar != null && jVar.f152004h) {
                        List<C54130j> list2 = ((C54963d0) this.f177056f.business(cls)).f154076s;
                        C87412m.m108593f(list2, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                        C64500kt2 kt23 = this.f177055e;
                        synchronized (list2) {
                            Iterator<T> it4 = list2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                T next = it4.next();
                                if (Util.isEqual(((C54130j) next).f151997a, kt23.f183982d.get(0).f184154d)) {
                                    t2 = next;
                                    break;
                                }
                            }
                        }
                        ((C54963d0) this.f177056f.business(cls)).f154073p = (C54130j) t2;
                        C65818s0 s0Var = this.f177056f.f177051h;
                        if (s0Var != null) {
                            s0Var.mo89830h();
                        }
                    }
                }
                ((C54963d0) this.f177056f.business(cls)).f154074q.clear();
                LinkedList<C54130j> linkedList = this.f177057g;
                C62283d dVar = this.f177056f;
                for (C54130j k4 : linkedList) {
                    ((C54991o) dVar.business(C54991o.class)).mo76009k4(k4);
                }
                C65818s0 s0Var2 = this.f177056f.f177051h;
                if (s0Var2 != null) {
                    s0Var2.mo89834l(true, (C13604l<Integer, Integer>) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62283d(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: Y2 */
    public final void mo87349Y2(int i, Bundle bundle) {
        JSONObject jSONObject;
        T t;
        FinderObject finderObject;
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        FinderObjectDesc finderObjectDesc2;
        C64640px0 px02;
        FinderObjectDesc finderObjectDesc3;
        C64640px0 px03;
        String str;
        T t2;
        int i2 = i;
        Bundle bundle2 = bundle;
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        Class cls3 = C54963d0.class;
        if (i2 == 18) {
            if (((C54963d0) business(cls3)).f154053G) {
                Log.m105924i(mo87350c3(), "EVENT_CDN_SEI_MESSAGE_LINK_MIC: roomPk = true, skip");
                return;
            }
            String string = bundle2 != null ? bundle2.getString("live_cdn_sei_msg") : null;
            if (string != null) {
                C64500kt2 kt22 = new C64500kt2();
                byte[] bytes = string.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                try {
                    kt22.parseFrom(bytes);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                String c3 = mo87350c3();
                StringBuilder sb = new StringBuilder();
                sb.append("EVENT_CDN_SEI_MESSAGE_LINK_MIC micSEIMsg.infos:");
                LinkedList<C64535lt2> linkedList2 = kt22.f183982d;
                if (linkedList2 == null || linkedList2.isEmpty()) {
                    str = "";
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    int i3 = 0;
                    for (T next : linkedList2) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            C64535lt2 lt22 = (C64535lt2) next;
                            sb4.append('[' + i3 + XVFSFile.PATH_SEPARATOR_CHAR + lt22.f184154d + ',' + lt22.f184156f + ',' + lt22.f184155e + ']');
                            i3 = i4;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    str = sb4.toString();
                    C87412m.m108593f(str, "sb.toString()");
                }
                sb.append(str);
                sb.append(" audienceLinkMicUserList:");
                sb.append(C63947a.f181274a.mo88721f(((C54963d0) business(cls3)).f154074q));
                Log.m105924i(c3, sb.toString());
                LinkedList<C64535lt2> linkedList3 = kt22.f183982d;
                if (linkedList3 == null || linkedList3.isEmpty()) {
                    C65818s0 s0Var = this.f177051h;
                    if (s0Var != null) {
                        C65818s0.C65819a.m77533a(s0Var, C58124b.C58125b.FINDER_LIVE_LINK_MIC_REMOVE_BOTTOM_BAR, (Bundle) null, 2, (Object) null);
                        C13598b0 b0Var2 = C13598b0.f38549a;
                        return;
                    }
                    return;
                }
                C65818s0 s0Var2 = this.f177051h;
                if (s0Var2 != null) {
                    C65818s0.C65819a.m77533a(s0Var2, C58124b.C58125b.FINDER_LIVE_LINK_MIC_ADD_BOTTOM_BAR, (Bundle) null, 2, (Object) null);
                    C13598b0 b0Var3 = C13598b0.f38549a;
                }
                CommonKt.uiThread(new C62282c(this));
                C8477a0 a0Var = new C8477a0();
                a0Var.f27482d = true;
                LinkedList linkedList4 = new LinkedList();
                LinkedList<C64535lt2> linkedList5 = kt22.f183982d;
                C87412m.m108593f(linkedList5, "micSEIMsg.infos");
                for (C64535lt2 lt23 : linkedList5) {
                    List<C54130j> list = ((C54963d0) business(cls3)).f154076s;
                    C87412m.m108593f(list, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                    synchronized (list) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            if (Util.isEqual(((C54130j) t2).f151997a, lt23.f184154d)) {
                                break;
                            }
                        }
                    }
                    C54130j jVar = (C54130j) t2;
                    if (jVar == null) {
                        a0Var.f27482d = false;
                    } else {
                        jVar.f152010n = C61926c.m72696u(lt23.f184156f, 1);
                        linkedList4.add(jVar);
                    }
                }
                C61926c.m72668M(new C62284a(a0Var, kt22, this, linkedList4));
                C13598b0 b0Var4 = C13598b0.f38549a;
            }
        } else if (i2 == 20) {
            String string2 = bundle2 != null ? bundle2.getString("live_cdn_sei_msg") : null;
            if (string2 != null) {
                C104289g gVar = new C104289g(string2);
                String optString = gVar.optString("userId");
                if (optString == null) {
                    optString = "";
                }
                int optInt = gVar.optInt("userStatus");
                int optInt2 = gVar.optInt("songId");
                int optInt3 = gVar.optInt("playStatus");
                long optLong = gVar.optLong("st");
                if (Util.isEqual(optString, ((C55001u) business(cls2)).f154419p.f182319n)) {
                    long c = C31543z5.m39453c();
                    long j = c - optLong;
                    ((C54963d0) business(cls3)).f154049C = j < 0 ? 0 : j;
                    Log.m105918d(mo87350c3(), "anchorServerTime:" + optLong + " myServerTime:" + c);
                } else {
                    Log.m105918d(mo87350c3(), "anchorId is invalid, maybe is in pk link mic. " + optString + ' ' + ((C55001u) business(cls2)).f154419p.f182319n);
                }
                String c35 = mo87350c3();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("notityAnchorInfoBySei anchorUserId:");
                sb5.append(optString);
                sb5.append('-');
                sb5.append(((C55001u) business(cls2)).f154419p.f182319n);
                sb5.append(" lastAudioMode:");
                sb5.append(this.f177052i);
                sb5.append(" lastScreenShareMode:");
                sb5.append(this.f177053j);
                sb5.append(" userStatus:");
                sb5.append(optInt);
                sb5.append(" songId:");
                sb5.append(optInt2);
                sb5.append(", playStatus:");
                sb5.append(optInt3);
                sb5.append(" coverUrl:");
                FinderObject finderObject2 = ((C54991o) business(cls)).f154341n;
                sb5.append((finderObject2 == null || (finderObjectDesc3 = finderObject2.objectDesc) == null || (px03 = finderObjectDesc3.liveDesc) == null) ? null : px03.f184911d);
                Log.m105924i(c35, sb5.toString());
                C64265bq2 bq22 = ((C55001u) business(cls2)).f154419p;
                if (Util.isEqual(optString, bq22 != null ? bq22.f182319n : null)) {
                    boolean u = C61926c.m72696u(optInt, 4);
                    if (this.f177053j != u) {
                        mo87352e3(u);
                        if (u) {
                            C65818s0 s0Var3 = this.f177051h;
                            if (s0Var3 != null) {
                                s0Var3.mo89824b(true);
                            }
                            mo87351d3(false);
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
                            C65818s0 s0Var4 = this.f177051h;
                            if (s0Var4 != null) {
                                s0Var4.statusChange(C58124b.C58125b.FINDER_LIVE_MODE_SWITCH, bundle3);
                            }
                        } else {
                            C65818s0 s0Var5 = this.f177051h;
                            if (s0Var5 != null) {
                                s0Var5.mo89824b(false);
                            }
                            mo87351d3(false);
                        }
                        C65818s0 s0Var6 = this.f177051h;
                        if (s0Var6 != null) {
                            s0Var6.mo89831i(this.f177052i, this.f177053j);
                        }
                    }
                    FinderObject finderObject3 = ((C54991o) business(cls)).f154341n;
                    String str2 = (finderObject3 == null || (finderObjectDesc2 = finderObject3.objectDesc) == null || (px02 = finderObjectDesc2.liveDesc) == null) ? null : px02.f184911d;
                    if ((str2 == null || str2.length() == 0) && ((finderObject = ((C54991o) business(cls)).f154341n) == null || (finderObjectDesc = finderObject.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null || (str2 = finderMedia.url) == null)) {
                        str2 = "";
                    }
                    boolean u2 = C61926c.m72696u(optInt, 2);
                    if (this.f177052i != u2) {
                        if (!(str2 == null || str2.length() == 0)) {
                            mo87351d3(u2);
                            boolean u3 = C61926c.m72696u(optInt, 2);
                            if (u3) {
                                C65818s0 s0Var7 = this.f177051h;
                                if (s0Var7 != null) {
                                    s0Var7.mo89828f();
                                }
                            } else {
                                C65818s0 s0Var8 = this.f177051h;
                                if (s0Var8 != null) {
                                    s0Var8.mo89836n();
                                }
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", u3);
                            bundle4.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", this.f177053j);
                            C65818s0 s0Var9 = this.f177051h;
                            if (s0Var9 != null) {
                                s0Var9.statusChange(C58124b.C58125b.FINDER_LIVE_MODE_SWITCH, bundle4);
                            }
                            ((C54963d0) business(cls3)).mo75930m3().f152012p = u3;
                            C65818s0 s0Var10 = this.f177051h;
                            if (s0Var10 != null) {
                                s0Var10.mo89831i(this.f177052i, this.f177053j);
                            }
                        }
                    }
                    C65818s0 s0Var11 = this.f177051h;
                    if (s0Var11 != null) {
                        s0Var11.mo89827e(!C61926c.m72696u(optInt, 1));
                    }
                }
                C54130j jVar2 = ((C54963d0) business(cls3)).f154073p;
                if (jVar2 != null) {
                    if (Util.isEqual(jVar2.f151997a, optString)) {
                        boolean u4 = C61926c.m72696u(optInt, 2);
                        if (jVar2.f152012p != u4) {
                            String str3 = jVar2.f152011o;
                            if (!(str3 == null || str3.length() == 0)) {
                                jVar2.f152012p = u4;
                                C65818s0 s0Var12 = this.f177051h;
                                if (s0Var12 != null) {
                                    s0Var12.mo89835m(jVar2.f151997a);
                                    C13598b0 b0Var5 = C13598b0.f38549a;
                                }
                                C65818s0 s0Var13 = this.f177051h;
                                if (s0Var13 != null) {
                                    s0Var13.mo89826d();
                                    C13598b0 b0Var6 = C13598b0.f38549a;
                                }
                            }
                        }
                        boolean u5 = C61926c.m72696u(optInt, 1);
                        if (jVar2.f152010n != u5) {
                            jVar2.f152010n = u5;
                            C65818s0 s0Var14 = this.f177051h;
                            if (s0Var14 != null) {
                                s0Var14.mo89833k();
                                C13598b0 b0Var7 = C13598b0.f38549a;
                            }
                        }
                    }
                    C13598b0 b0Var8 = C13598b0.f38549a;
                }
                if (optString.equals(((C55001u) business(cls2)).f154419p.f182319n)) {
                    String string3 = bundle2.getString("live_link_mic_info_in_anchor_sei_msg");
                    if (Util.isNullOrNil(string3)) {
                        Log.m105924i(mo87350c3(), "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: linkMicInfo empty, linkMicInfo:" + string3 + ", roomPk:" + ((C54963d0) business(cls3)).f154053G);
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject(string3);
                        } catch (JSONException unused) {
                            jSONObject = new JSONObject();
                        }
                    }
                    Log.m105924i(mo87350c3(), "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: micData:" + jSONObject);
                    C65818s0 s0Var15 = this.f177051h;
                    if (s0Var15 != null) {
                        s0Var15.mo89825c(jSONObject);
                        C13598b0 b0Var9 = C13598b0.f38549a;
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("list");
                    if ((optJSONArray != null ? optJSONArray.length() : 0) == 0) {
                        ((C54963d0) business(cls3)).f154053G = false;
                        ((C54963d0) business(cls3)).f154073p = null;
                        ((C54963d0) business(cls3)).mo75928k3();
                        List<C54130j> list2 = ((C54963d0) business(cls3)).f154074q;
                        C87412m.m108593f(list2, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
                        if (!list2.isEmpty()) {
                            Log.m105924i(mo87350c3(), "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: audienceLinkMicUserList:" + C63947a.f181274a.mo88721f(((C54963d0) business(cls3)).f154074q));
                            C65818s0 s0Var16 = this.f177051h;
                            if (s0Var16 != null) {
                                s0Var16.mo89832j((JSONArray) null);
                                C13598b0 b0Var10 = C13598b0.f38549a;
                            }
                        }
                    } else {
                        ((C54963d0) business(cls3)).f154053G = true;
                        C65818s0 s0Var17 = this.f177051h;
                        if (s0Var17 != null) {
                            C65818s0.C65819a.m77533a(s0Var17, C58124b.C58125b.FINDER_LIVE_LINK_MIC_ADD_BOTTOM_BAR, (Bundle) null, 2, (Object) null);
                            C13598b0 b0Var11 = C13598b0.f38549a;
                        }
                        LinkedList<C54130j> linkedList6 = new LinkedList<>();
                        int length = optJSONArray != null ? optJSONArray.length() : 0;
                        C54130j jVar3 = null;
                        boolean z = true;
                        for (int i5 = 0; i5 < length; i5++) {
                            JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(i5) : null;
                            String optString2 = optJSONObject != null ? optJSONObject.optString(DownloadInfo.UID) : null;
                            List<C54130j> list3 = ((C54963d0) business(cls3)).f154076s;
                            C87412m.m108593f(list3, "business(LiveLinkMicSlic…java).linkMicUserInfoList");
                            synchronized (list3) {
                                Iterator<T> it4 = list3.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it4.next();
                                    if (Util.isEqual(((C54130j) t).f151997a, optString2)) {
                                        break;
                                    }
                                }
                            }
                            C54130j jVar4 = (C54130j) t;
                            if (jVar4 == null) {
                                Log.m105924i(mo87350c3(), "EVENT_CDN_SEI_MESSAGE_ANCHOR_INFO: can't find user info, userId:" + optString2);
                                z = false;
                            } else {
                                int optInt4 = optJSONObject != null ? optJSONObject.optInt("us") : 0;
                                jVar4.f152010n = C61926c.m72696u(optInt4, 1);
                                if (jVar4.f152004h) {
                                    jVar3 = jVar4;
                                } else {
                                    jVar4.f152016t = Boolean.valueOf(C61926c.m72696u(optInt4, 8));
                                    linkedList6.add(jVar4);
                                }
                            }
                        }
                        CommonKt.uiThread(new C62282c(this));
                        if (z) {
                            ((C54963d0) business(cls3)).f154073p = jVar3;
                            ((C54963d0) business(cls3)).f154074q.clear();
                            for (C54130j k4 : linkedList6) {
                                ((C54991o) business(cls)).mo76009k4(k4);
                            }
                        }
                    }
                    C65818s0 s0Var18 = this.f177051h;
                    if (s0Var18 != null) {
                        s0Var18.mo89823a(jSONObject, false, (C13604l<Integer, Integer>) null);
                    }
                }
                C13598b0 b0Var12 = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: c3 */
    public final String mo87350c3() {
        return this.f177049f + this.f177050g;
    }

    /* renamed from: d3 */
    public final void mo87351d3(boolean z) {
        if (this.f177052i != z) {
            String c3 = mo87350c3();
            Log.m105924i(c3, "set lastAudioMode:" + z);
        }
        this.f177052i = z;
    }

    /* renamed from: e3 */
    public final void mo87352e3(boolean z) {
        if (this.f177053j != z) {
            String c3 = mo87350c3();
            Log.m105924i(c3, "set lastScreenShareMode:" + z);
        }
        this.f177053j = z;
    }
}
