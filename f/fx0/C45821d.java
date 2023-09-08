package fx0;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AppMsgRelatedInfoUpdateEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import f40.C86709a0;
import f40.C86718e;
import gy3.C87412m;
import java.util.Map;
import kw0.C46746a;
import s90.C77630j;

/* renamed from: fx0.d */
public final class C45821d {

    /* renamed from: a */
    public static final C45821d f123719a = new C45821d();

    /* renamed from: b */
    public static MultiProcessMMKV f123720b;

    /* renamed from: a */
    public final void mo71283a(String str, int i) {
        C87412m.m108594g(str, "url");
        if (mo71284b(str)) {
            Log.m105918d("MicroMsg.BizPayLogic", "url pay status: already paid url=" + str + ", itemShowType=" + i);
            return;
        }
        Log.m105924i("MicroMsg.BizPayLogic", "appMsgPaySuccess url=" + str + ", itemShowType=" + i);
        C40789z zVar = C40789z.f109640a;
        Log.m105919d("MicroMsg.PreloadLogic", "removePreload %s", str);
        C40789z.f109646g.getClass();
        String k = C40714i.m43962k(str);
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) C40789z.f109643d.findSlot(k);
        if (multiProcessMMKV != null) {
            multiProcessMMKV.removeValueForKey(k);
            multiProcessMMKV.removeValueForKey(C40714i.m43955d(str));
        }
        mo71287e(str, true);
        C40789z.m44093b(str, i, 90, new Object[0]);
        AppMsgRelatedInfoUpdateEvent appMsgRelatedInfoUpdateEvent = new AppMsgRelatedInfoUpdateEvent();
        appMsgRelatedInfoUpdateEvent.f107364d.f107366b = true;
        appMsgRelatedInfoUpdateEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: b */
    public final boolean mo71284b(String str) {
        return str != null && mo71286d().decodeInt(C45834o.f123751a.mo71301b(str), 0) == 1;
    }

    /* renamed from: c */
    public final void mo71285c(Map<String, String> map) {
        C87412m.m108594g(map, "values");
        String str = map.get(".sysmsg.MMBizPaySubscribePayNotify.AppmsgUrl");
        int i = Util.getInt(map.get(".sysmsg.MMBizPaySubscribePayNotify.ItemShowType"), -1);
        Log.m105924i("MicroMsg.BizPayLogic", "onPaySuccessNotify url=" + str + ", itemShowType=" + i);
        if (str != null && i > -1) {
            mo71283a(str, i);
        }
    }

    /* renamed from: d */
    public final MultiProcessMMKV mo71286d() {
        MultiProcessMMKV multiProcessMMKV = f123720b;
        if (multiProcessMMKV != null) {
            C87412m.m108592e(multiProcessMMKV, "null cannot be cast to non-null type com.tencent.mm.sdk.platformtools.MultiProcessMMKV");
            return multiProcessMMKV;
        }
        int g = MMApplicationContext.isMainProcess() ? C86709a0.m107523b().mo121110g() : C86718e.m107549h();
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("appMsgPay_" + g, 2);
        f123720b = mmkv;
        C87412m.m108592e(mmkv, "null cannot be cast to non-null type com.tencent.mm.sdk.platformtools.MultiProcessMMKV");
        return mmkv;
    }

    /* renamed from: e */
    public final void mo71287e(String str, boolean z) {
        C87412m.m108594g(str, "url");
        String b = C45834o.f123751a.mo71301b(str);
        if (z) {
            mo71286d().encode(b, 1);
        } else {
            mo71286d().remove(b);
        }
    }

    /* renamed from: f */
    public final void mo71288f(CharSequence charSequence, MMNeat7extView mMNeat7extView, boolean z, String str, int i) {
        int i2;
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(mMNeat7extView, "titleTv");
        if (z) {
            C46746a aVar = C46746a.f125826a;
            Context context = mMNeat7extView.getContext();
            C87412m.m108593f(context, "titleTv.context");
            String applicationLanguage = LocaleUtil.getApplicationLanguage();
            boolean z2 = C85875k4.m106211z();
            boolean z3 = i == 11 || i == 21 || i == 41;
            if (mo71284b(str)) {
                if (applicationLanguage != null) {
                    int hashCode = applicationLanguage.hashCode();
                    if (hashCode != 115861276) {
                        if (hashCode != 115861428) {
                        }
                        i2 = z2 ? C0966R.C0969drawable.bvw : z3 ? C0966R.C0969drawable.bvt : C0966R.C0969drawable.bvz;
                    } else if (applicationLanguage.equals("zh_CN")) {
                        i2 = z2 ? C0966R.C0969drawable.bvu : z3 ? C0966R.C0969drawable.bvr : C0966R.C0969drawable.bvx;
                    }
                }
                i2 = z2 ? C0966R.C0969drawable.bvv : z3 ? C0966R.C0969drawable.bvs : C0966R.C0969drawable.bvy;
            } else {
                if (applicationLanguage != null) {
                    int hashCode2 = applicationLanguage.hashCode();
                    if (hashCode2 != 115861276) {
                        if (hashCode2 != 115861428) {
                        }
                        i2 = z2 ? C0966R.C0969drawable.f357112bw2 : C0966R.C0969drawable.bw5;
                    } else if (applicationLanguage.equals("zh_CN")) {
                        i2 = z2 ? C0966R.C0969drawable.f357110bw0 : C0966R.C0969drawable.f357113bw3;
                    }
                }
                i2 = z2 ? C0966R.C0969drawable.f357111bw1 : C0966R.C0969drawable.bw4;
            }
            aVar.mo71978l(context, mMNeat7extView, i2, charSequence, i);
            return;
        }
        mMNeat7extView.mo104279b(charSequence);
    }

    /* renamed from: g */
    public final void mo71289g(String str, MMNeat7extView mMNeat7extView, C77630j jVar, int i) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(mMNeat7extView, "titleTv");
        C87412m.m108594g(jVar, "item");
        boolean z = true;
        if (!(jVar.f226333o == 0 && jVar.f226317I == 1)) {
            z = false;
        }
        mo71288f(str, mMNeat7extView, z, jVar.f226326e, i);
        mMNeat7extView.setTag(C0966R.C0970id.aak, Boolean.valueOf(z));
    }
}
