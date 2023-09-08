package wj1;

import a14.C0000n0;
import a14.C53934p0;
import al1.C0080f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import cl1.C0657g1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import d60.C58124b;
import er1.C7846n5;
import er1.C7851o5;
import er1.C7859p5;
import f40.C86709a0;
import fh1.C8083t2;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import ke3.C88144b;
import kj1.C10125e1;
import kj1.C10187l2;
import kotlin.ResultKt;
import nk1.C11207i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qj1.C62660c;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49658h43;
import te3.C49712hj1;
import te3.C51068r71;
import te3.C52062y31;
import te3.C52173yv0;
import wx3.C15601d;
import wx3.C66212f;
import xj1.C15712a;
import yj1.C16019a;
import yj1.C16023b;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

/* renamed from: wj1.a */
public final class C15410a extends C62660c implements C16019a.C16020a, C15712a {

    /* renamed from: p */
    public final C58124b f41806p;

    /* renamed from: q */
    public C16019a f41807q;

    /* renamed from: r */
    public boolean f41808r;

    /* renamed from: wj1.a$b */
    public static final class C15411b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C15410a f41809d;

        public C15411b(C15410a aVar) {
            this.f41809d = aVar;
        }

        public void onChanged(Object obj) {
            ArrayList arrayList;
            Long l;
            Long l2 = (Long) obj;
            Class cls = C0657g1.class;
            C51068r71 r712 = ((C0657g1) this.f41809d.mo87696x0(cls)).f1556h;
            Log.m105924i("FinderLiveRestrictConsumePlugin", "receive consume dialog it: " + l2);
            if (l2 != null && r712 != null) {
                C15410a aVar = this.f41809d;
                if (aVar.f41807q == null) {
                    Context context = aVar.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    aVar.f41807q = new C16019a(context, aVar);
                }
                C16019a aVar2 = aVar.f41807q;
                if (aVar2 != null) {
                    long longValue = l2.longValue();
                    C0080f fVar = ((C0657g1) this.f41809d.mo87696x0(cls)).f1557i;
                    C7851o5 o5Var = C7851o5.NORMAL_TYPE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("showPanel ");
                    sb.append(longValue);
                    sb.append(" balanceData: ");
                    sb.append(fVar);
                    sb.append(" info: ");
                    C52173yv0 yv02 = r712.f140743f;
                    sb.append(yv02 != null ? Long.valueOf(yv02.f145533e) : null);
                    Log.m105924i("RestrictConsumeDialogWidget", sb.toString());
                    aVar2.f43097q = longValue;
                    aVar2.f43098r = fVar;
                    LinkedList<C49658h43> linkedList = r712.f140742e;
                    if (linkedList != null) {
                        arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                        for (C49658h43 h432 : linkedList) {
                            arrayList.add(Long.valueOf(h432.f134442d));
                        }
                    } else {
                        arrayList = null;
                    }
                    aVar2.f43099s = longValue >= ((arrayList == null || (l = (Long) C110818d0.m150927Y(arrayList)) == null) ? 50000 : l.longValue()) ? C7851o5.FACE_TYPE : o5Var;
                    String str = fVar != null ? fVar.f505c : null;
                    if (str == null || str.length() == 0) {
                        Log.m105920e("RestrictConsumeDialogWidget", "showPanel verifyUrl is null or empty, change to normal mode");
                        aVar2.f43099s = o5Var;
                    }
                    int ordinal = aVar2.f43099s.ordinal();
                    if (ordinal == 0) {
                        TextView textView = aVar2.f43093j;
                        if (textView != null) {
                            textView.setText(aVar2.f28306d.getString(C0966R.string.mwd, new Object[]{Long.valueOf(longValue)}));
                            TextView textView2 = aVar2.f43096p;
                            if (textView2 != null) {
                                textView2.setText(aVar2.f28306d.getString(C0966R.string.mwe));
                            } else {
                                C87412m.m108603p("rightBtn");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("contentText");
                            throw null;
                        }
                    } else if (ordinal == 1) {
                        TextView textView3 = aVar2.f43093j;
                        if (textView3 != null) {
                            textView3.setText(aVar2.f28306d.getString(C0966R.string.mwb, new Object[]{Long.valueOf(longValue)}));
                            TextView textView4 = aVar2.f43096p;
                            if (textView4 != null) {
                                textView4.setText(aVar2.f28306d.getString(C0966R.string.mwm));
                            } else {
                                C87412m.m108603p("rightBtn");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("contentText");
                            throw null;
                        }
                    }
                    C15419c.f41825a.mo14214a(C7859p5.QUOTA_EXPOSE, longValue);
                    TextView textView5 = aVar2.f43094n;
                    if (textView5 != null) {
                        String string = textView5.getContext().getResources().getString(C0966R.string.mwc);
                        C87412m.m108593f(string, "tv.context.resources.get…_consume_content_manager)");
                        String string2 = textView5.getContext().getResources().getString(C0966R.string.mwa);
                        C87412m.m108593f(string2, "tv.context.resources.get…t_consume_content_change)");
                        String format = String.format(string2, Arrays.copyOf(new Object[]{string}, 1));
                        C87412m.m108593f(format, "format(format, *args)");
                        int E = C112550d0.m153769E(format, string, 0, false, 6, (Object) null);
                        SpannableString spannableString = new SpannableString(format);
                        spannableString.setSpan(new C16023b(aVar2), E, string.length() + E, 33);
                        textView5.setHighlightColor(textView5.getContext().getResources().getColor(17170445));
                        textView5.setMovementMethod(LinkMovementMethod.getInstance());
                        textView5.setText(spannableString);
                        aVar2.mo3431p();
                        return;
                    }
                    C87412m.m108603p("consumeText");
                    throw null;
                }
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.quota.FinderLiveRestrictConsumePlugin$updateQuotaMoneySetting$1", mo125469f = "FinderLiveRestrictConsumePlugin.kt", mo125470l = {186, 199, 206}, mo125471m = "invokeSuspend")
    /* renamed from: wj1.a$c */
    public static final class C15412c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f41810d;

        /* renamed from: e */
        public int f41811e;

        /* renamed from: f */
        public final /* synthetic */ C52173yv0 f41812f;

        /* renamed from: g */
        public final /* synthetic */ boolean f41813g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.quota.FinderLiveRestrictConsumePlugin$updateQuotaMoneySetting$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveRestrictConsumePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: wj1.a$c$a */
        public static final class C15413a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0287e f41814d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15413a(C0287e eVar, C15601d dVar) {
                super(2, dVar);
                this.f41814d = eVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C15413a(this.f41814d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C15413a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.m105920e("FinderLiveRestrictConsumePlugin", "updateQuotaMoneySetting fail " + ((C0280a) ((C0281b) this.f41814d).f843b));
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.quota.FinderLiveRestrictConsumePlugin$updateQuotaMoneySetting$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveRestrictConsumePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: wj1.a$c$b */
        public static final class C15414b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0287e f41815d;

            /* renamed from: e */
            public final /* synthetic */ boolean f41816e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15414b(C0287e eVar, C15601d dVar, boolean z) {
                super(2, dVar);
                this.f41815d = eVar;
                this.f41816e = z;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C15414b(this.f41815d, dVar, this.f41816e);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C15414b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C52062y31 y312 = (C52062y31) ((C0288f) this.f41815d).f855b;
                Log.m105920e("FinderLiveRestrictConsumePlugin", "updateQuotaMoneySetting success " + this.f41816e);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15412c(C52173yv0 yv02, boolean z, C15601d<? super C15412c> dVar) {
            super(2, dVar);
            this.f41812f = yv02;
            this.f41813g = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C15412c(this.f41812f, this.f41813g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15412c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r9.f41811e
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x002d
                if (r1 == r5) goto L_0x0029
                if (r1 == r4) goto L_0x0021
                if (r1 != r3) goto L_0x0019
                java.lang.Object r0 = r9.f41810d
                bi1.e r0 = (bi1.C0287e) r0
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x00bb
            L_0x0019:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0021:
                java.lang.Object r1 = r9.f41810d
                bi1.e r1 = (bi1.C0287e) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x009f
            L_0x0029:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x007e
            L_0x002d:
                kotlin.ResultKt.throwOnFailure(r10)
                te3.x31 r10 = new te3.x31
                r10.<init>()
                te3.yv0 r1 = r9.f41812f
                r10.f144423e = r5
                te3.yv0 r6 = new te3.yv0
                r6.<init>()
                int r7 = r1.f145532d
                r6.f145532d = r7
                long r7 = r1.f145533e
                r6.f145533e = r7
                r10.f144424f = r6
                ob0.c$b r1 = new ob0.c$b
                r1.<init>()
                r6 = 10352(0x2870, float:1.4506E-41)
                r1.f127069d = r6
                java.lang.String r6 = "/cgi-bin/micromsg-bin/finderlivemodconsumptionquota"
                r1.f127068c = r6
                r1.f127066a = r10
                te3.y31 r10 = new te3.y31
                r10.<init>()
                r1.f127067b = r10
                ob0.c r10 = r1.mo72403a()
                java.lang.Class<ht1.s1> r1 = ht1.C8802s1.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                ht1.s1 r1 = (ht1.C8802s1) r1
                ob0.b r1 = r1.mo9632ui()
                r1.mo123453j(r10)
                a14.h0 r10 = a14.C53872d1.f151117a
                a14.k2 r10 = f14.C58901s.f168555a
                r9.f41811e = r5
                java.lang.Object r10 = bi1.C0283d.m243a(r1, r10, r9)
                if (r10 != r0) goto L_0x007e
                return r0
            L_0x007e:
                r1 = r10
                bi1.e r1 = (bi1.C0287e) r1
                boolean r10 = r9.f41813g
                boolean r5 = r1 instanceof bi1.C0288f
                if (r5 == 0) goto L_0x009f
                wx3.f r5 = r1.f854a
                if (r5 != 0) goto L_0x008f
                wx3.f r5 = r9.getContext()
            L_0x008f:
                wj1.a$c$b r6 = new wj1.a$c$b
                r6.<init>(r1, r2, r10)
                r9.f41810d = r1
                r9.f41811e = r4
                java.lang.Object r10 = a14.C53895h.m60469g(r5, r6, r9)
                if (r10 != r0) goto L_0x009f
                return r0
            L_0x009f:
                boolean r10 = r1 instanceof bi1.C0281b
                if (r10 == 0) goto L_0x00bb
                wx3.f r10 = r1.f854a
                if (r10 != 0) goto L_0x00ab
                wx3.f r10 = r9.getContext()
            L_0x00ab:
                wj1.a$c$a r4 = new wj1.a$c$a
                r4.<init>(r1, r2)
                r9.f41810d = r1
                r9.f41811e = r3
                java.lang.Object r10 = a14.C53895h.m60469g(r10, r4, r9)
                if (r10 != r0) goto L_0x00bb
                return r0
            L_0x00bb:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: wj1.C15410a.C15412c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: wj1.a$a */
    public /* synthetic */ class C15415a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41817a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[28] = 1;
            f41817a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15410a(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f41806p = bVar;
    }

    /* renamed from: E */
    public void mo14207E(int i) {
        C8083t2 t2Var;
        C10125e1 e1Var;
        C51068r71 r712 = ((C0657g1) mo87696x0(C0657g1.class)).f1556h;
        Log.m105924i("FinderLiveRestrictConsumePlugin", "showConsumeManagerWidget restrictConsumeDialogData: " + r712);
        if (r712 != null && (t2Var = (C8083t2) mo87685B0(C8083t2.class)) != null && (e1Var = t2Var.f26907q) != null) {
            new C10187l2(e1Var, 2).mo10560v(false);
        }
    }

    /* renamed from: N */
    public void mo14208N(C52173yv0 yv02, boolean z) {
        C87412m.m108594g(yv02, "quotaData");
        Log.m105920e("FinderLiveRestrictConsumePlugin", "updateQuotaMoneySetting amount " + yv02.f145533e + " enable: " + yv02.f145532d);
        C11207i.m11072h(this, (C66212f) null, (C53934p0) null, new C15412c(yv02, z, (C15601d<? super C15412c>) null), 3, (Object) null);
    }

    /* renamed from: N0 */
    public void mo12123N0(float f) {
    }

    /* renamed from: U0 */
    public void mo12048U0() {
        ((C0657g1) mo87696x0(C0657g1.class)).f1554f.observe(this, new C15411b(this));
    }

    /* renamed from: Z */
    public void mo14209Z() {
        Object obj;
        boolean z;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_QUOTA_CONSUME_SHOW_STRING_SYNC;
        Class cls = C0657g1.class;
        Long value = ((C0657g1) mo87696x0(cls)).f1554f.getValue();
        if (value == null) {
            value = 0L;
        }
        long longValue = value.longValue();
        Log.m105924i("FinderLiveRestrictConsumePlugin", "continueSend: " + longValue);
        LinkedList<C7846n5> linkedList = new LinkedList<>();
        try {
            JSONArray jSONArray = new JSONArray(C86709a0.m107535s().mo121142i().mo119675I(aVar, ""));
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                JSONArray jSONArray2 = jSONArray;
                linkedList.add(new C7846n5(optJSONObject.optLong("noticeAmount"), optJSONObject.optLong("curTime")));
                i++;
                jSONArray = jSONArray2;
            }
        } catch (JSONException unused) {
        }
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C7846n5) obj).f26420a == longValue) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C7846n5 n5Var = (C7846n5) obj;
        if (n5Var != null) {
            n5Var.f26420a = longValue;
            n5Var.f26421b = System.currentTimeMillis();
        } else {
            linkedList.add(new C7846n5(longValue, System.currentTimeMillis()));
        }
        JSONArray jSONArray3 = new JSONArray();
        for (C7846n5 n5Var2 : linkedList) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("noticeAmount", n5Var2.f26420a);
            jSONObject.put("curTime", n5Var2.f26421b);
            jSONArray3.put(jSONObject);
        }
        Log.m105924i("QuotaUtil", "updateQuotaToastConfig noticeAmount: " + longValue + " config: " + jSONArray3);
        C86709a0.m107535s().mo121142i().mo119677K(aVar, jSONArray3.toString());
        ((C0657g1) mo87696x0(cls)).f1558j.postValue(C0657g1.C0658a.f1559a);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: d */
    public C16019a.C16020a mo14210d() {
        return this;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
        if (i == 194735 && this.f41808r) {
            C11207i.m11072h(this, (C66212f) null, (C53934p0) null, new C15416b(this, (C15601d<? super C15416b>) null), 3, (Object) null);
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    public void onCancel() {
        ((C0657g1) mo87696x0(C0657g1.class)).f1558j.postValue(C0657g1.C0659b.f1560a);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C16019a aVar;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        if (C15415a.f41817a[bVar.ordinal()] == 1 && (aVar = this.f41807q) != null) {
            aVar.mo9763a();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        C16019a aVar = this.f41807q;
        if (aVar != null) {
            aVar.mo9763a();
        }
    }

    /* renamed from: x */
    public void mo14212x() {
        ((C0657g1) mo87696x0(C0657g1.class)).f1558j.postValue(C0657g1.C0659b.f1560a);
    }

    /* renamed from: z */
    public void mo14213z(String str) {
        C87412m.m108594g(str, "url");
        this.f41808r = true;
        Intent intent = new Intent();
        intent.putExtra("open_custom_style_url", true);
        intent.putExtra("forceHideShare", true);
        intent.putExtra("show_native_web_view", true);
        intent.putExtra("rawUrl", str);
        intent.putExtra("screen_orientation", 1);
        C88144b.m109795m(this.f166287d.getContext(), "webview", ".ui.tools.WebViewUI", intent, 194735);
    }
}
