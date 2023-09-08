package wr0;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.C115279g;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.C115280h;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.C115281i;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.C115286n;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.C115287o;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.C115289q;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import gt0.C87362k;
import hk0.C76200a;
import hk0.C76215b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import nj3.C76879j;
import ob0.C47350c;
import pe3.C47465a;
import qo3.C89779i0;
import te3.C49244e8;
import te3.C50093k8;
import te3.C50386md3;
import te3.C50733ou1;
import te3.C64360f8;
import te3.y44;
import zq0.C91919w;
import zt3.C119157j;

public final /* synthetic */ class b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C115279g f355335d;

    /* renamed from: e */
    public final /* synthetic */ int f355336e;

    /* renamed from: f */
    public final /* synthetic */ int f355337f;

    /* renamed from: g */
    public final /* synthetic */ C47350c f355338g;

    /* renamed from: h */
    public final /* synthetic */ String f355339h;

    public /* synthetic */ b$$a(C115279g gVar, int i, int i2, C47350c cVar, String str) {
        this.f355335d = gVar;
        this.f355336e = i;
        this.f355337f = i2;
        this.f355338g = cVar;
        this.f355339h = str;
    }

    public final void run() {
        C47465a aVar;
        C87362k kVar;
        C87362k kVar2;
        C115279g gVar = this.f355335d;
        int i = this.f355336e;
        int i2 = this.f355337f;
        C47350c cVar = this.f355338g;
        String str = this.f355339h;
        C89779i0 i0Var = AppBrandIDCardUI.this.f345460z;
        if (i0Var != null && i0Var.isShowing()) {
            AppBrandIDCardUI.this.f345460z.dismiss();
        }
        boolean z = false;
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            y44 y44 = (y44) aVar;
            C64360f8 f8Var = y44.f354562d;
            if (f8Var == null) {
                Log.m105920e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is err");
                Intent intent = new Intent();
                intent.putExtra("intent_err_code", CodecError.DEQUEUEINPUTBUFFER_ILLEGAL);
                intent.putExtra("intent_err_msg", "network err");
                AppBrandIDCardUI.this.setResult(1, intent);
                AppBrandIDCardUI.this.finish();
                return;
            }
            Log.m105921e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response.err_code is %d", Integer.valueOf(f8Var.f183091d));
            Log.m105925i("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.show_status:%d", Integer.valueOf(y44.f354563e));
            int i3 = y44.f354563e;
            if (i3 != 0) {
                if (i3 != 1) {
                    Log.m105920e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.show_status error");
                    return;
                }
                Log.m105925i("MicroMsg.AppBrandIDCardUI", "showAlert errCode:%d, errMsg:%s", Integer.valueOf(y44.f354562d.f183091d), y44.f354562d.f183092e);
                AppBrandIDCardUI.C115267a aVar2 = gVar.f345489a;
                C64360f8 f8Var2 = y44.f354562d;
                int i4 = f8Var2.f183091d;
                String str2 = f8Var2.f183092e;
                AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
                C49244e8 e8Var = y44.f354564f;
                C76879j.m92717K(appBrandIDCardUI, false, e8Var.f132772e, e8Var.f132771d, appBrandIDCardUI.getString(C0966R.string.f7714p3), "", new C115280h(aVar2, i4, str2), new C115281i(aVar2));
            } else if (y44.f354562d.f183091d != 0) {
                Log.m105920e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is not ok");
                Intent intent2 = new Intent();
                intent2.putExtra("intent_err_code", y44.f354562d.f183091d);
                intent2.putExtra("intent_err_msg", y44.f354562d.f183092e);
                AppBrandIDCardUI.this.setResult(1, intent2);
                AppBrandIDCardUI.this.finish();
            } else {
                AppBrandIDCardUI appBrandIDCardUI2 = AppBrandIDCardUI.this;
                appBrandIDCardUI2.f345449o = y44;
                int i5 = appBrandIDCardUI2.f345456v;
                if (i5 == 0) {
                    Log.m105924i("MicroMsg.AppBrandIDCardUI", "switchToShowFragment");
                    ((C119157j) C119157j.f356862d).mo183895z(new C115287o(appBrandIDCardUI2));
                    return;
                }
                String str3 = "";
                if (i5 == 1) {
                    C76200a aVar3 = appBrandIDCardUI2.f345459y;
                    if (!(aVar3 == null || (kVar2 = appBrandIDCardUI2.f345458x) == null)) {
                        kVar2.mo121777a(aVar3);
                    }
                    y44 y442 = appBrandIDCardUI2.f345449o;
                    if (y442 == null) {
                        Log.m105920e("MicroMsg.AppBrandIDCardUI", "lost idcard show info");
                        appBrandIDCardUI2.setResult(0);
                        appBrandIDCardUI2.finish();
                    } else if (y442.f354578w == null) {
                        Log.m105920e("MicroMsg.AppBrandIDCardUI", "lost idcard info");
                        appBrandIDCardUI2.setResult(0);
                        appBrandIDCardUI2.finish();
                    } else {
                        C76200a aVar4 = new C76200a(appBrandIDCardUI2.getContext());
                        appBrandIDCardUI2.f345459y = aVar4;
                        aVar4.f223240G = new C118780p(appBrandIDCardUI2);
                        aVar4.f223239F = new C118781q(appBrandIDCardUI2);
                        aVar4.f223235B = new C115289q(appBrandIDCardUI2);
                        aVar4.f223236C = new C118782r(appBrandIDCardUI2);
                        aVar4.f223237D = new C118770f(appBrandIDCardUI2);
                        aVar4.f223241H = new C118771g(appBrandIDCardUI2);
                        aVar4.f223242I = new C118772h(appBrandIDCardUI2);
                        C76200a aVar5 = appBrandIDCardUI2.f345459y;
                        String str4 = appBrandIDCardUI2.f345449o.f354566h;
                        aVar5.getClass();
                        String str5 = C88394b.f255384g;
                        C88394b.C88418q.f255427a.mo122786b(aVar5.f223244e, str4, C88393a.m110230a(), C88431k.f255437d);
                        if (TextUtils.isEmpty(appBrandIDCardUI2.f345455u)) {
                            appBrandIDCardUI2.f345455u = appBrandIDCardUI2.f345449o.f354567i;
                        }
                        C76200a aVar6 = appBrandIDCardUI2.f345459y;
                        String str6 = appBrandIDCardUI2.f345455u;
                        TextView textView = aVar6.f223245f;
                        if (str6 == null) {
                            str6 = str3;
                        }
                        textView.setText(str6);
                        C76200a aVar7 = appBrandIDCardUI2.f345459y;
                        String str7 = appBrandIDCardUI2.f345449o.f354578w.f132173f;
                        TextView textView2 = aVar7.f223246g;
                        if (str7 == null) {
                            str7 = str3;
                        }
                        textView2.setText(str7);
                        C76200a aVar8 = appBrandIDCardUI2.f345459y;
                        String str8 = appBrandIDCardUI2.f345449o.f354578w.f132174g;
                        TextView textView3 = aVar8.f223249j;
                        if (str8 == null) {
                            str8 = str3;
                        }
                        textView3.setText(str8);
                        C76200a aVar9 = appBrandIDCardUI2.f345459y;
                        String str9 = appBrandIDCardUI2.f345449o.f354578w.f132175h;
                        TextView textView4 = aVar9.f223252p;
                        if (str9 != null) {
                            str3 = str9;
                        }
                        textView4.setText(str3);
                        C76200a aVar10 = appBrandIDCardUI2.f345459y;
                        Boolean valueOf = Boolean.valueOf(appBrandIDCardUI2.f345449o.f354576u);
                        aVar10.f223256t.setChecked(valueOf != null ? valueOf.booleanValue() : false);
                        Button button = aVar10.f223259w;
                        if (valueOf != null) {
                            z = valueOf.booleanValue();
                        }
                        button.setEnabled(z);
                        C76200a aVar11 = appBrandIDCardUI2.f345459y;
                        String str10 = appBrandIDCardUI2.f345449o.f354571p;
                        Button button2 = aVar11.f223259w;
                        boolean isNullOrNil = Util.isNullOrNil(str10);
                        CharSequence charSequence = str10;
                        if (isNullOrNil) {
                            charSequence = aVar11.getContext().getText(C0966R.string.f7715p4);
                        }
                        button2.setText(charSequence);
                        C76200a aVar12 = appBrandIDCardUI2.f345459y;
                        String str11 = appBrandIDCardUI2.f345449o.f354577v;
                        CheckBox checkBox = aVar12.f223256t;
                        boolean isNullOrNil2 = Util.isNullOrNil(str11);
                        CharSequence charSequence2 = str11;
                        if (isNullOrNil2) {
                            charSequence2 = aVar12.getContext().getText(C0966R.string.f7716p5);
                        }
                        checkBox.setText(charSequence2);
                        C50093k8 k8Var = appBrandIDCardUI2.f345449o.f354578w.f132177j;
                        if (k8Var != null) {
                            C76200a aVar13 = appBrandIDCardUI2.f345459y;
                            String str12 = k8Var.f136603d;
                            if (str12 != null) {
                                aVar13.f223257u.setText(str12);
                                aVar13.f223257u.setOnClickListener(new C76215b(aVar13));
                            } else {
                                aVar13.getClass();
                            }
                        }
                        if (appBrandIDCardUI2.f345449o.f354578w.f132171d != null) {
                            C76200a aVar14 = appBrandIDCardUI2.f345459y;
                            aVar14.mo106465c(appBrandIDCardUI2.f345449o.f354578w.f132171d.f131566d + " " + appBrandIDCardUI2.f345449o.f354578w.f132171d.f131567e);
                        } else {
                            Log.m105924i("MicroMsg.AppBrandIDCardUI", "no id card info");
                        }
                        ArrayList arrayList = new ArrayList();
                        C50733ou1 ou12 = appBrandIDCardUI2.f345449o.f354578w.f132172e;
                        if (ou12 != null) {
                            C50386md3 md32 = ou12.f139366d;
                            if (md32 != null) {
                                arrayList.add(new PhoneItem(Util.nullAsNil(md32.f137960d), Util.nullAsNil(md32.f137961e), Util.nullAsNil(md32.f137964h), Util.nullAsNil(md32.f137965i), Util.nullAsNil(md32.f137966j), md32.f137962f, md32.f137963g, true, false, ""));
                            }
                            LinkedList<C50386md3> linkedList = appBrandIDCardUI2.f345449o.f354578w.f132172e.f139367e;
                            if (linkedList != null) {
                                Iterator<C50386md3> it = linkedList.iterator();
                                while (it.hasNext()) {
                                    C50386md3 next = it.next();
                                    PhoneItem phoneItem = r5;
                                    PhoneItem phoneItem2 = new PhoneItem(Util.nullAsNil(next.f137960d), Util.nullAsNil(next.f137961e), Util.nullAsNil(next.f137964h), Util.nullAsNil(next.f137965i), Util.nullAsNil(next.f137966j), next.f137962f, next.f137963g, false, false, "");
                                    arrayList.add(phoneItem);
                                }
                            }
                        }
                        C91919w wVar = C91919w.f263170a;
                        List<PhoneItem> c = wVar.mo125748c(arrayList, wVar.mo125747b());
                        appBrandIDCardUI2.f345459y.mo106466d(c == null ? new ArrayList() : (ArrayList) c);
                        wVar.mo125749d(c);
                        C87362k kVar3 = appBrandIDCardUI2.f345458x;
                        if (kVar3 != null) {
                            kVar3.mo121778b(appBrandIDCardUI2.f345459y);
                        }
                    }
                } else if (i5 == 2) {
                    C76200a aVar15 = appBrandIDCardUI2.f345459y;
                    if (!(aVar15 == null || (kVar = appBrandIDCardUI2.f345458x) == null)) {
                        kVar.mo121777a(aVar15);
                    }
                    y44 y443 = appBrandIDCardUI2.f345449o;
                    if (y443 == null) {
                        Log.m105920e("MicroMsg.AppBrandIDCardUI", "wecoin lost idcard show info");
                        appBrandIDCardUI2.setResult(0);
                        appBrandIDCardUI2.finish();
                    } else if (y443.f354578w == null) {
                        Log.m105920e("MicroMsg.AppBrandIDCardUI", "wecoin lost idcard info");
                        appBrandIDCardUI2.setResult(0);
                        appBrandIDCardUI2.finish();
                    } else {
                        C76200a aVar16 = new C76200a(appBrandIDCardUI2.getContext());
                        appBrandIDCardUI2.f345459y = aVar16;
                        aVar16.f223244e.setVisibility(8);
                        aVar16.f223247h.setVisibility(8);
                        appBrandIDCardUI2.f345459y.f223243d.setBackgroundResource(C0966R.C0969drawable.az_);
                        C76200a aVar17 = appBrandIDCardUI2.f345459y;
                        C118773i iVar = new C118773i(appBrandIDCardUI2);
                        aVar17.getClass();
                        aVar17.f223239F = iVar;
                        C76200a aVar18 = appBrandIDCardUI2.f345459y;
                        C115286n nVar = new C115286n(appBrandIDCardUI2);
                        aVar18.getClass();
                        aVar18.f223235B = nVar;
                        C76200a aVar19 = appBrandIDCardUI2.f345459y;
                        C118774j jVar = new C118774j(appBrandIDCardUI2);
                        aVar19.getClass();
                        aVar19.f223236C = jVar;
                        C76200a aVar20 = appBrandIDCardUI2.f345459y;
                        C118775k kVar4 = new C118775k(appBrandIDCardUI2);
                        aVar20.getClass();
                        aVar20.f223238E = kVar4;
                        C76200a aVar21 = appBrandIDCardUI2.f345459y;
                        C118776l lVar = new C118776l(appBrandIDCardUI2);
                        aVar21.getClass();
                        aVar21.f223237D = lVar;
                        C76200a aVar22 = appBrandIDCardUI2.f345459y;
                        C118777m mVar = new C118777m(appBrandIDCardUI2);
                        aVar22.getClass();
                        aVar22.f223241H = mVar;
                        C76200a aVar23 = appBrandIDCardUI2.f345459y;
                        C118778n nVar2 = new C118778n(appBrandIDCardUI2);
                        aVar23.getClass();
                        aVar23.f223242I = nVar2;
                        C76200a aVar24 = appBrandIDCardUI2.f345459y;
                        String str13 = appBrandIDCardUI2.f345449o.f354566h;
                        aVar24.getClass();
                        String str14 = C88394b.f255384g;
                        C88394b.C88418q.f255427a.mo122786b(aVar24.f223244e, str13, C88393a.m110230a(), C88431k.f255437d);
                        C76200a aVar25 = appBrandIDCardUI2.f345459y;
                        String str15 = appBrandIDCardUI2.f345444g;
                        TextView textView5 = aVar25.f223245f;
                        if (str15 == null) {
                            str15 = str3;
                        }
                        textView5.setText(str15);
                        C76200a aVar26 = appBrandIDCardUI2.f345459y;
                        String str16 = appBrandIDCardUI2.f345449o.f354578w.f132173f;
                        TextView textView6 = aVar26.f223246g;
                        if (str16 == null) {
                            str16 = str3;
                        }
                        textView6.setText(str16);
                        if (!Util.isNullOrNil(appBrandIDCardUI2.f345445h)) {
                            C76200a aVar27 = appBrandIDCardUI2.f345459y;
                            String str17 = appBrandIDCardUI2.f345445h;
                            TextView textView7 = aVar27.f223249j;
                            if (str17 == null) {
                                str17 = str3;
                            }
                            textView7.setText(str17);
                        } else {
                            C76200a aVar28 = appBrandIDCardUI2.f345459y;
                            String str18 = appBrandIDCardUI2.f345449o.f354578w.f132174g;
                            TextView textView8 = aVar28.f223249j;
                            if (str18 == null) {
                                str18 = str3;
                            }
                            textView8.setText(str18);
                        }
                        C76200a aVar29 = appBrandIDCardUI2.f345459y;
                        String str19 = appBrandIDCardUI2.f345449o.f354578w.f132175h;
                        TextView textView9 = aVar29.f223252p;
                        if (str19 != null) {
                            str3 = str19;
                        }
                        textView9.setText(str3);
                        boolean z2 = appBrandIDCardUI2.f345449o.f354576u;
                        appBrandIDCardUI2.mo175054J7(z2 ? 12 : 13);
                        C76200a aVar30 = appBrandIDCardUI2.f345459y;
                        Boolean valueOf2 = Boolean.valueOf(z2);
                        aVar30.f223256t.setChecked(valueOf2 != null ? valueOf2.booleanValue() : false);
                        Button button3 = aVar30.f223259w;
                        if (valueOf2 != null) {
                            z = valueOf2.booleanValue();
                        }
                        button3.setEnabled(z);
                        C76200a aVar31 = appBrandIDCardUI2.f345459y;
                        String str20 = appBrandIDCardUI2.f345449o.f354571p;
                        Button button4 = aVar31.f223259w;
                        boolean isNullOrNil3 = Util.isNullOrNil(str20);
                        CharSequence charSequence3 = str20;
                        if (isNullOrNil3) {
                            charSequence3 = aVar31.getContext().getText(C0966R.string.f7715p4);
                        }
                        button4.setText(charSequence3);
                        C76200a aVar32 = appBrandIDCardUI2.f345459y;
                        String str21 = appBrandIDCardUI2.f345449o.f354577v;
                        CheckBox checkBox2 = aVar32.f223256t;
                        boolean isNullOrNil4 = Util.isNullOrNil(str21);
                        CharSequence charSequence4 = str21;
                        if (isNullOrNil4) {
                            charSequence4 = aVar32.getContext().getText(C0966R.string.f7716p5);
                        }
                        checkBox2.setText(charSequence4);
                        C50093k8 k8Var2 = appBrandIDCardUI2.f345449o.f354578w.f132177j;
                        if (k8Var2 != null) {
                            C76200a aVar33 = appBrandIDCardUI2.f345459y;
                            String str22 = k8Var2.f136603d;
                            if (str22 != null) {
                                aVar33.f223257u.setText(str22);
                                aVar33.f223257u.setOnClickListener(new C76215b(aVar33));
                            } else {
                                aVar33.getClass();
                            }
                        }
                        if (appBrandIDCardUI2.f345449o.f354578w.f132171d != null) {
                            C76200a aVar34 = appBrandIDCardUI2.f345459y;
                            aVar34.mo106465c(appBrandIDCardUI2.f345449o.f354578w.f132171d.f131566d + " " + appBrandIDCardUI2.f345449o.f354578w.f132171d.f131567e);
                        } else {
                            Log.m105924i("MicroMsg.AppBrandIDCardUI", "wecoin no id card info");
                        }
                        ArrayList arrayList2 = new ArrayList();
                        C50733ou1 ou13 = appBrandIDCardUI2.f345449o.f354578w.f132172e;
                        if (ou13 != null) {
                            C50386md3 md33 = ou13.f139366d;
                            if (md33 != null) {
                                arrayList2.add(new PhoneItem(Util.nullAsNil(md33.f137960d), Util.nullAsNil(md33.f137961e), Util.nullAsNil(md33.f137964h), Util.nullAsNil(md33.f137965i), Util.nullAsNil(md33.f137966j), md33.f137962f, md33.f137963g, true, false, ""));
                            }
                            LinkedList<C50386md3> linkedList2 = appBrandIDCardUI2.f345449o.f354578w.f132172e.f139367e;
                            if (linkedList2 != null) {
                                Iterator<C50386md3> it4 = linkedList2.iterator();
                                while (it4.hasNext()) {
                                    C50386md3 next2 = it4.next();
                                    arrayList2.add(new PhoneItem(Util.nullAsNil(next2.f137960d), Util.nullAsNil(next2.f137961e), Util.nullAsNil(next2.f137964h), Util.nullAsNil(next2.f137965i), Util.nullAsNil(next2.f137966j), next2.f137962f, next2.f137963g, false, false, ""));
                                }
                            }
                        }
                        C91919w wVar2 = C91919w.f263170a;
                        List<PhoneItem> c2 = wVar2.mo125748c(arrayList2, wVar2.mo125747b());
                        appBrandIDCardUI2.f345459y.mo106466d(c2 == null ? new ArrayList() : (ArrayList) c2);
                        wVar2.mo125749d(c2);
                        C87362k kVar5 = appBrandIDCardUI2.f345458x;
                        if (kVar5 != null) {
                            kVar5.mo121778b(appBrandIDCardUI2.f345459y);
                        }
                    }
                }
            }
        } else {
            Log.m105921e("MicroMsg.AppBrandIDCardUI", "getIDCardInfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", Integer.valueOf(i), Integer.valueOf(i2), str, cVar.f127056b.f127083a);
            Intent intent3 = new Intent();
            intent3.putExtra("intent_err_code", CodecError.DEQUEUEINPUTBUFFER_ILLEGAL);
            intent3.putExtra("intent_err_msg", "network err");
            AppBrandIDCardUI.this.setResult(1, intent3);
            AppBrandIDCardUI.this.finish();
        }
    }
}
