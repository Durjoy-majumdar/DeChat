package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.C103834d;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.wxmm.v2helper;
import hp3.C87581a;
import j20.C117292a;
import java.io.IOException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ob0.C89132b;
import org.xmlpull.v1.XmlPullParserException;
import p853i4.C108351m;
import te3.C50584ns;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.s3 */
public class C69684s3 implements C87581a<Object, C89132b.C89134c<C50584ns>> {

    /* renamed from: a */
    public final /* synthetic */ String f201080a;

    /* renamed from: b */
    public final /* synthetic */ int f201081b;

    /* renamed from: c */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI f201082c;

    public C69684s3(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, String str, int i) {
        this.f201082c = luckyMoneyPickEnvelopeUI;
        this.f201080a = str;
        this.f201081b = i;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do doCheckAndUseTimeLimitPromo errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        Dialog dialog = this.f201082c.f200517A;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", Integer.valueOf(((C50584ns) cVar.f256796d).f138741d));
            T t = cVar.f256796d;
            if (t != null && ((C50584ns) t).f138741d == 0) {
                Intent intent = new Intent();
                C77994sf2 H7 = LuckyMoneyPickEnvelopeUI.m81899H7(this.f201082c, this.f201080a);
                if (H7 != null) {
                    try {
                        intent.putExtra("key_envelope_source", H7.toByteArray());
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.LuckyMoneyPickEnvelopeUI", e, "", new Object[0]);
                    }
                    this.f201082c.setResult(-1, intent);
                    if (H7.f228208o == 3) {
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f201082c;
                        int i = this.f201081b;
                        LuckyMoneyPickEnvelopeUI.C69490m mVar = (LuckyMoneyPickEnvelopeUI.C69490m) luckyMoneyPickEnvelopeUI.f200546h.mo17023I0(i);
                        ViewGroup viewGroup = (ViewGroup) luckyMoneyPickEnvelopeUI.f200546h.mo17023I0(i).f44854d;
                        Bitmap createBitmap = Bitmap.createBitmap(mVar.f200590P.getWidth(), mVar.f200590P.getHeight(), Bitmap.Config.ARGB_8888);
                        mVar.f200591Q.draw(new Canvas(createBitmap));
                        mVar.f200590P.setImageBitmap(createBitmap);
                        mVar.f200590P.setVisibility(0);
                        mVar.f200591Q.setVisibility(4);
                        AppCompatActivity context = luckyMoneyPickEnvelopeUI.getContext();
                        C108351m mVar2 = new C108351m(context);
                        XmlResourceParser xml = context.getResources().getXml(C0966R.C0972transition.f8851b);
                        try {
                            Transition b = mVar2.mo158845b(xml, Xml.asAttributeSet(xml), (Transition) null);
                            xml.close();
                            TransitionSet transitionSet = (TransitionSet) b;
                            transitionSet.mo145346S(new C69689t3(luckyMoneyPickEnvelopeUI, mVar));
                            C103834d.m138407a(viewGroup, transitionSet);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mVar.f200590P.getLayoutParams();
                            marginLayoutParams.width = C76577a.m92151b(luckyMoneyPickEnvelopeUI.getContext(), 256);
                            marginLayoutParams.height = C76577a.m92151b(luckyMoneyPickEnvelopeUI.getContext(), v2helper.EMethodSetSpkEnhance);
                            marginLayoutParams.topMargin = C76577a.m92151b(luckyMoneyPickEnvelopeUI.getContext(), 12);
                            mVar.f200590P.setLayoutParams(marginLayoutParams);
                            View findViewById = mVar.f44854d.findViewById(C0966R.C0970id.g1z);
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(4);
                            View view = findViewById;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            mVar.f200592R.setVisibility(8);
                            mVar.f200593S.setVisibility(8);
                            View findViewById2 = mVar.f44854d.findViewById(C0966R.C0970id.g26);
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(0);
                            View view2 = findViewById2;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } catch (XmlPullParserException e2) {
                            throw new InflateException(e2.getMessage(), e2);
                        } catch (IOException e3) {
                            throw new InflateException(xml.getPositionDescription() + ": " + e3.getMessage(), e3);
                        } catch (Throwable th) {
                            xml.close();
                            throw th;
                        }
                    }
                }
            } else if (t != null && !Util.isNullOrNil(((C50584ns) t).f138742e)) {
                C75228t.m90211D(this.f201082c.getContext(), ((C50584ns) cVar.f256796d).f138742e);
            }
        } else {
            C75228t.m90209B(this.f201082c.getContext(), cVar.f256795c);
        }
        return null;
    }
}
