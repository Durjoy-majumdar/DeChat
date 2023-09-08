package eg1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import cl1.C54951d;
import cm1.C0782u0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8777j5;
import ht1.C8808v4;
import java.util.LinkedList;
import jp3.C9487b;
import ky2.C10432i;
import ls3.C61397g;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p185kq.C10383h;
import p50.C62197e;
import p565ir.C60606n;
import pe3.C89349b;
import qj1.C62898o;
import rx3.C13604l;
import sk1.C63947a;
import te3.C50429mo2;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64623p81;
import te3.C64733to;
import tf0.C13887q1;
import zc1.C66785b;

@C86522b
/* renamed from: eg1.l0 */
public final class C58586l0 extends C86301e implements C61397g {

    /* renamed from: d */
    public final String f167732d = "FinderReplayFeatureService";

    /* renamed from: eg1.l0$a */
    public static final class C58587a implements C60606n.C60609c {

        /* renamed from: a */
        public final /* synthetic */ C58586l0 f167733a;

        /* renamed from: b */
        public final /* synthetic */ String f167734b;

        /* renamed from: c */
        public final /* synthetic */ String f167735c;

        /* renamed from: d */
        public final /* synthetic */ Intent f167736d;

        /* renamed from: e */
        public final /* synthetic */ Context f167737e;

        /* renamed from: f */
        public final /* synthetic */ long f167738f;

        /* renamed from: g */
        public final /* synthetic */ String f167739g;

        /* renamed from: h */
        public final /* synthetic */ String f167740h;

        public C58587a(C58586l0 l0Var, String str, String str2, Intent intent, Context context, long j, String str3, String str4) {
            this.f167733a = l0Var;
            this.f167734b = str;
            this.f167735c = str2;
            this.f167736d = intent;
            this.f167737e = context;
            this.f167738f = j;
            this.f167739g = str3;
            this.f167740h = str4;
        }

        public void onLiveStatusCallback(long j, int i, Object obj) {
            Object obj2 = obj;
            C64273c21 c212 = null;
            C51713vn0 vn02 = obj2 instanceof C51713vn0 ? (C51713vn0) obj2 : null;
            if (vn02 != null) {
                c212 = vn02.f143572d;
            }
            C64273c21 c213 = c212;
            if (!this.f167733a.ah0(this.f167734b, c213)) {
                boolean z = false;
                if (c213 != null && c213.f182394f == 2) {
                    z = true;
                }
                if (!z || !this.f167733a.mo83479QW(3, c213)) {
                    String str = this.f167733a.f167732d;
                    Log.m105920e(str, "enterFinderLiveReplayUI liveInfo:" + C63947a.f181274a.mo88736v(c213));
                    return;
                }
            }
            ((C10383h) C86312j.m106911c(C10383h.class)).mo10697OK(this.f167735c);
            this.f167733a.mo83484bR(c213, this.f167736d, this.f167737e, this.f167738f, j, this.f167734b, this.f167739g, this.f167740h);
        }
    }

    /* renamed from: AP */
    public void mo83473AP(boolean z, long j, String str, int i, int i2) {
        Class cls = C8777j5.class;
        C87412m.m108594g(str, "pageType");
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("object_id", C61926c.m72691p(j));
            jSONObject.put(PatchedFlutterActivity.EXTRA_PAGE_TYPE, str);
            jSONObject.put("object_type", i);
            jSONObject.put("page_sub_type", i2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "this.toString()");
            ((C8777j5) C86312j.m106911c(cls)).hg0("watch_live_expose", jSONObject2);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("object_id", C61926c.m72691p(j));
        jSONObject3.put(PatchedFlutterActivity.EXTRA_PAGE_TYPE, str);
        jSONObject3.put("object_type", i);
        jSONObject3.put("page_sub_type", i2);
        String jSONObject4 = jSONObject3.toString();
        C87412m.m108593f(jSONObject4, "this.toString()");
        ((C8777j5) C86312j.m106911c(cls)).hg0("watch_live_record", jSONObject4);
    }

    public void Bn0() {
        C62898o oVar;
        C54951d.C54953c b1;
        C62197e e0 = FinderLiveService.f159376d.mo77631e0();
        if (e0 != null) {
            e0.mo87273O0(true);
        }
        C56032b bVar = FinderLiveService.f159379g;
        if (bVar != null && (oVar = (C62898o) bVar.getPlugin(C62898o.class)) != null && (b1 = oVar.mo87843b1()) != null) {
            b1.setMute(true);
        }
    }

    public boolean Da0(C64273c21 c212) {
        if (c212 != null && c212.f182366L == 1) {
            if (!(C63947a.m75194h(C63947a.f181274a, c212, "replayReadyToPlay", false, 2, (Object) null).length() == 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G0 */
    public boolean mo83476G0(C64623p81 p812) {
        C87412m.m108594g(p812, "shareObject");
        C64273c21 T70 = ((C60606n) C86312j.m106911c(C60606n.class)).T70(C61926c.m72671P(p812.f184778d));
        int i = p812.f184759C;
        return i == 4 || i == 6 || ah0(p812.f184779e, T70);
    }

    /* renamed from: Iu */
    public C13604l<Boolean, C64733to> mo83477Iu(int i, C64273c21 c212, int i2) {
        C87412m.m108594g(c212, "liveInfo");
        return C62042e.f176370a.mo87128x0(i, c212, i2);
    }

    public boolean Nj0(String str, View view, View view2, long j) {
        View view3 = view;
        View view4 = view2;
        Class cls = C60606n.class;
        C64273c21 T70 = ((C60606n) C86312j.m106911c(cls)).T70(j);
        if (T70 != null) {
            return jx0(str, T70);
        }
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
        C60606n.C60607a.m70857a((C60606n) c, j, false, (C9487b) null, (C60606n.C60609c) null, 4, (String) null, (C50429mo2) null, 96, (Object) null);
        if (!(view4 instanceof FinderLiveOnliveWidget) || ((FinderLiveOnliveWidget) view4).getVisibility() != 0) {
            if (view3 instanceof FinderLiveOnliveWidget) {
                FinderLiveOnliveWidget finderLiveOnliveWidget = (FinderLiveOnliveWidget) view3;
                if (finderLiveOnliveWidget.getVisibility() == 0) {
                    String text = finderLiveOnliveWidget.getText();
                    String str2 = this.f167732d;
                    Log.m105924i(str2, "routerToReplayUI liveTag visible,text:" + text + '!');
                    return Util.isEqual(text, MMApplicationContext.getContext().getResources().getString(C0966R.string.dj6));
                }
            }
            Log.m105924i(this.f167732d, "routerToReplayUI all tag invisible!");
        } else {
            Log.m105924i(this.f167732d, "routerToReplayUI liveEndTag visible!");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r8.f182388Z;
     */
    /* renamed from: QW */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo83479QW(int r7, te3.C64273c21 r8) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L_0x000a
            te3.e71 r1 = r8.f182388Z
            if (r1 == 0) goto L_0x000a
            te3.f71 r1 = r1.f182933i
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0015
            int r1 = r1.f183090i
            if (r1 != 0) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 == 0) goto L_0x0045
            java.lang.Class<hr.t> r1 = p165hr.C60106t.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            hr.t r1 = (p165hr.C60106t) r1
            hg1.i r1 = r1.Cx0()
            long r4 = r8.f182392d
            int r1 = r1.mo58845Lo(r4)
            rx3.l r7 = r6.mo83477Iu(r7, r8, r1)
            B r7 = r7.f38556e
            te3.to r7 = (te3.C64733to) r7
            if (r7 == 0) goto L_0x0036
            java.lang.String r0 = r7.f185622e
        L_0x0036:
            if (r0 == 0) goto L_0x0041
            int r7 = r0.length()
            if (r7 != 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r7 = 0
            goto L_0x0042
        L_0x0041:
            r7 = 1
        L_0x0042:
            if (r7 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: eg1.C58586l0.mo83479QW(int, te3.c21):boolean");
    }

    /* renamed from: Qg */
    public boolean mo83480Qg(C64273c21 c212) {
        if (c212 != null && c212.f182366L == 3) {
            if (C63947a.m75194h(C63947a.f181274a, c212, "replayAuditing", false, 2, (Object) null).length() == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean X30(long j) {
        return mo83480Qg(((C60606n) C86312j.m106911c(C60606n.class)).T70(j));
    }

    /* renamed from: aR */
    public void mo83482aR(Intent intent, Context context, long j, long j2, String str, String str2, String str3, String str4, boolean z) {
        String str5 = str;
        String str6 = str2;
        String str7 = str4;
        boolean z2 = z;
        Class cls = C10432i.class;
        C87412m.m108594g(str5, "anchorUserName");
        C87412m.m108594g(str6, "nonceId");
        C87412m.m108594g(str7, "contextId");
        String str8 = this.f167732d;
        Log.m105924i(str8, "enterFinderLiveReplayUI objectId:" + j + ",liveId:" + j2 + ",anchorUserName:" + str5 + ",nonceId:" + str6 + ",desc:" + str3 + ",contextId:" + str7 + ",forceCheckTeenMode:" + z2);
        if (!((C10432i) C86312j.m106911c(cls)).mo10750e() || ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9636zX() || !z2) {
            Context context2 = context;
            C7335d c = C86312j.m106911c(C60606n.class);
            C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
            C60606n.C60607a.m70857a((C60606n) c, j2, true, (C9487b) null, new C58587a(this, str, str4, intent, context, j, str2, str3), 4, (String) null, (C50429mo2) null, 100, (Object) null);
            return;
        }
        ((C10432i) C86312j.m106911c(cls)).mo10755m4(context);
    }

    public boolean ah0(String str, C64273c21 c212) {
        if (Da0(c212)) {
            return true;
        }
        if (c212 != null && c212.f182366L == 4) {
            return true;
        }
        if (c212 != null && c212.f182366L == 2) {
            return true;
        }
        if (c212 != null && c212.f182366L == 6) {
            return true;
        }
        if (c212 != null && c212.f182366L == 5) {
            if (!(str == null || str.length() == 0) && C87412m.m108589b(str, C66785b.f191882e.mo90662O5())) {
                if (!(C63947a.m75194h(C63947a.f181274a, c212, "showReplay", false, 2, (Object) null).length() == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: bR */
    public void mo83484bR(C64273c21 c212, Intent intent, Context context, long j, long j2, String str, String str2, String str3) {
        C87412m.m108594g(str, "anchorUserName");
        C87412m.m108594g(str2, "nonceId");
        if (intent == null) {
            intent = new Intent();
        }
        C0782u0.C0783a aVar = C0782u0.f1832e;
        LinkedList linkedList = new LinkedList();
        Long valueOf = Long.valueOf(j2);
        FinderObject finderObject = new FinderObject();
        if (c212 == null) {
            c212 = new C64273c21();
            c212.f182392d = valueOf != null ? valueOf.longValue() : 0;
        }
        finderObject.liveInfo = c212;
        finderObject.objectNonceId = str2;
        finderObject.f164794id = j;
        finderObject.username = str;
        FinderObjectDesc finderObjectDesc = new FinderObjectDesc();
        finderObjectDesc.description = str3;
        LinkedList<FinderMedia> linkedList2 = new LinkedList<>();
        finderObjectDesc.mediaType = 9;
        finderObjectDesc.media = linkedList2;
        finderObject.objectDesc = finderObjectDesc;
        linkedList.add(new C0782u0(finderObject));
        intent.putExtra("KEY_PARAMS_KEY_VALUE", aVar.mo728a(linkedList, (C89349b) null, 0, 0).toByteArray());
        C7335d c = C86312j.m106911c(C13887q1.class);
        C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
        C13887q1 q1Var = (C13887q1) c;
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        Context context2 = context;
        C87412m.m108593f(context2, "context ?: MMApplicationContext.getContext()");
        C13887q1.C13888a.m13308d(q1Var, context2, intent, false, 4, (Object) null);
    }

    public boolean jx0(String str, C64273c21 c212) {
        if (c212 != null) {
            boolean ah02 = ah0(str, c212);
            boolean z = c212.f182394f == 2;
            boolean QW = mo83479QW(4, c212);
            String str2 = this.f167732d;
            Log.m105924i(str2, "routerToReplayUI liveId:" + c212.f182392d + " is replay:" + ah02 + ",liveEnd:" + z + ", isReplayTransition:" + QW);
            if (!ah02) {
                return z && QW;
            }
            return true;
        }
    }
}
