package d83;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C103422m;
import c83.C92383e;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WCTopicSearchShareActionReportStruct;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C7250m;
import d62.C97425j;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60161e;
import ht1.C60166f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import kg3.C76577a;
import kr0.C88274h0;
import o40.C61926c;
import p158gt.C76057w;
import qo3.C89779i0;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C101784gx3;
import te3.C101810m82;
import te3.C101818my3;
import te3.C101837ry3;
import te3.C101844sx3;
import te3.C101847tx3;
import te3.C101853ux3;
import te3.C49767hx3;
import te3.C51315sy3;
import te3.C64628pk1;
import te3.C64682rk1;
import te3.xe4;
import u73.C101986v;
import u73.C22613h1;
import wc3.C78541w;
import wd3.C65953v0;

/* renamed from: d83.g */
public final class C97448g extends C103422m {

    /* renamed from: f */
    public xe4 f286027f;

    /* renamed from: g */
    public final C75343a f286028g;

    /* renamed from: h */
    public final String f286029h = "MicroMsg.WebSearch.TagSearchDialog";

    /* renamed from: i */
    public View f286030i;

    /* renamed from: j */
    public boolean f286031j;

    /* renamed from: n */
    public C97453j f286032n;

    /* renamed from: o */
    public C97454k f286033o;

    /* renamed from: p */
    public C89779i0 f286034p;

    /* renamed from: d83.g$a */
    public static final class C97449a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C97448g f286035d;

        /* renamed from: e */
        public final /* synthetic */ C101810m82 f286036e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f286037f;

        /* renamed from: g */
        public final /* synthetic */ String f286038g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97449a(C97448g gVar, C101810m82 m822, Bitmap bitmap, String str) {
            super(0);
            this.f286035d = gVar;
            this.f286036e = m822;
            this.f286037f = bitmap;
            this.f286038g = str;
        }

        public Object invoke() {
            C97448g gVar = this.f286035d;
            C101810m82 m822 = this.f286036e;
            Bitmap bitmap = this.f286037f;
            String str = this.f286038g;
            gVar.getClass();
            C87412m.m108594g(m822, "shareContent");
            if (m822.f298797j != null) {
                C68070l.C68072b bVar = new C68070l.C68072b();
                C60166f fVar = new C60166f();
                C101847tx3 tx32 = m822.f298797j;
                C64682rk1 rk12 = new C64682rk1();
                rk12.f185183d = tx32.f299556e;
                rk12.f185191o = tx32.f299560i;
                rk12.f185188i = tx32.f299557f;
                rk12.f185186g = tx32.f299559h;
                rk12.f185185f = tx32.f299558g;
                rk12.f185187h = tx32.f299555d;
                rk12.f185189j = tx32.f299562n.size();
                LinkedList<C64628pk1> linkedList = rk12.f185190n;
                LinkedList<C101853ux3> linkedList2 = tx32.f299562n;
                C87412m.m108593f(linkedList2, "feedObject.MediaList");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                for (C101853ux3 ux32 : linkedList2) {
                    C64628pk1 pk12 = new C64628pk1();
                    pk12.f184826d = ux32.f299644d;
                    pk12.f184827e = String.valueOf(ux32.f299645e);
                    pk12.f184828f = ux32.f299648h;
                    pk12.f184829g = (float) ux32.f299646f;
                    pk12.f184830h = (float) ux32.f299647g;
                    pk12.f184831i = ux32.f299649i;
                    arrayList.add(pk12);
                }
                linkedList.addAll(arrayList);
                fVar.f171710b = rk12;
                bVar.mo93545f(fVar);
                bVar.f195582i = 51;
                bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
                bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
                C80996q.C1279a.m1369a().mo112827qE(bVar, "", "", gVar.f286027f.f228424o, "", (byte[]) null);
                gVar.mo136716F(m822, str);
            } else {
                String str2 = "";
                if (m822.f298796i != null) {
                    C68070l.C68072b bVar2 = new C68070l.C68072b();
                    C60161e eVar = new C60161e();
                    String str3 = m822.f298796i.f299467e;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    eVar.mo85136j(str3);
                    String str4 = m822.f298796i.f299466d;
                    if (str4 == null) {
                        str4 = str2;
                    }
                    eVar.mo85135i(str4);
                    C101844sx3 sx32 = m822.f298796i;
                    String str5 = sx32.f299471i;
                    if (str5 == null) {
                        str5 = str2;
                    }
                    eVar.f171707h = str5;
                    String str6 = sx32.f299470h;
                    if (str6 == null) {
                        str6 = str2;
                    }
                    eVar.mo85133g(str6);
                    String str7 = m822.f298796i.f299468f;
                    if (str7 != null) {
                        str2 = str7;
                    }
                    eVar.mo85134h(str2);
                    bVar2.mo93545f(eVar);
                    bVar2.f195582i = 50;
                    bVar2.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
                    bVar2.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
                    C80996q.C1279a.m1369a().mo112827qE(bVar2, "", "", gVar.f286027f.f228424o, "", (byte[]) null);
                    gVar.mo136716F(m822, str);
                } else if (m822.f298792e != null) {
                    C68070l.C68072b bVar3 = new C68070l.C68072b();
                    C49767hx3 hx32 = m822.f298792e;
                    bVar3.f195570f = hx32.f134938d;
                    bVar3.f195646y = hx32.f134940f;
                    bVar3.f195586j = hx32.f134941g;
                    bVar3.f195574g = hx32.f134939e;
                    bVar3.f195578h = "view";
                    bVar3.f195618r = 3;
                    bVar3.f195634v = hx32.f134943i;
                    bVar3.f195638w = hx32.f134944j;
                    bVar3.f195582i = 5;
                    C68065f fVar2 = new C68065f();
                    fVar2.f195417b = 0;
                    bVar3.mo93545f(fVar2);
                    C80996q.C1279a.m1369a().mo112827qE(bVar3, "", "", gVar.f286027f.f228424o, "", (byte[]) null);
                    gVar.mo136716F(m822, str);
                } else {
                    C101784gx3 gx32 = m822.f298793f;
                    if (gx32 != null) {
                        String format = String.format("<msg username=\"%s\" nickname=\"%s\" alias=\"%s\" fullpy=\"%s\" shortpy=\"%s\" imagestatus=\"%d\" scene=\"17\" province=\"%s\" city=\"%s\" sign=\"%s\" percard=\"%d\" sex=\"%d\" certflag=\"%d\" certinfo=\"%s\" certinfoext=\"\" brandIconUrl=\"%s\" brandHomeUrl=\"\" brandSubscriptConfigUrl=\"\" brandFlags=\"\" regionCode=\"%s\"/>", Arrays.copyOf(new Object[]{Util.escapeStringForXml(gx32.f298318d), Util.escapeStringForXml(gx32.f298319e), Util.escapeStringForXml(gx32.f298321g), Util.escapeStringForXml(gx32.f298320f), Util.escapeStringForXml(str2), 0, Util.escapeStringForXml(gx32.f298323i), Util.escapeStringForXml(gx32.f298324j), Util.escapeStringForXml(gx32.f298325n), 0, Integer.valueOf(gx32.f298326o), Integer.valueOf(gx32.f298327p), str2, gx32.f298333v, Util.escapeStringForXml(gx32.f298322h)}, 15));
                        C87412m.m108593f(format, "format(format, *args)");
                        C97425j a = C7250m.m7431a();
                        String str8 = m822.f298793f.f298318d;
                        String str9 = gVar.f286027f.f228424o;
                        a.Ys0(str8, str9, format, C72996z1.m85820U5(str9));
                        gVar.mo136716F(m822, str);
                    } else {
                        C101837ry3 ry32 = m822.f298794g;
                        if (ry32 != null) {
                            C68070l.C68072b bVar4 = new C68070l.C68072b();
                            bVar4.f195570f = ry32.f299369e;
                            bVar4.f195573f2 = ry32.f299372h;
                            bVar4.f195569e2 = ry32.f299373i;
                            bVar4.f195577g2 = ry32.f299371g;
                            bVar4.f195653z2 = 0;
                            bVar4.f195467A2 = ry32.f299375n;
                            bVar4.f195581h2 = 2;
                            bVar4.f195586j = ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113311k8(ry32.f299371g);
                            bVar4.f195471B2 = ry32.f299374j;
                            bVar4.f195494H1 = "wxapp_" + ry32.f299371g + ry32.f299373i;
                            bVar4.f195634v = ry32.f299372h;
                            bVar4.f195638w = ry32.f299368d;
                            bVar4.mo93545f(new C80995a());
                            bVar4.f195582i = 33;
                            if (!TextUtils.isEmpty(ry32.f299370f)) {
                                ((C76057w) C86312j.m106911c(C76057w.class)).h60(ry32.f299370f, new C97451h(bVar4, ry32, gVar, m822, str));
                            } else {
                                C80996q.C1279a.m1369a().mo112827qE(bVar4, ry32.f299371g, "", gVar.f286027f.f228424o, "", BitmapUtil.Bitmap2Bytes(bitmap));
                                gVar.mo136716F(m822, str);
                            }
                        } else if (m822.f298795h != null) {
                            C68070l.C68072b bVar5 = new C68070l.C68072b();
                            C51315sy3 sy32 = m822.f298795h;
                            bVar5.f195570f = sy32.f141835e;
                            bVar5.f195582i = 33;
                            bVar5.f195573f2 = sy32.f141834d;
                            bVar5.f195577g2 = sy32.f141837g;
                            bVar5.f195581h2 = 1;
                            bVar5.f195494H1 = "wxapp_" + m822.f298795h.f141837g;
                            C51315sy3 sy33 = m822.f298795h;
                            bVar5.f195646y = sy33.f141836f;
                            String format2 = String.format(Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=upgrade&upgradetype=%d#wechat_redirect", Arrays.copyOf(new Object[]{sy33.f141837g, 3}, 2));
                            C87412m.m108593f(format2, "format(locale, format, *args)");
                            bVar5.f195586j = format2;
                            C51315sy3 sy34 = m822.f298795h;
                            bVar5.f195634v = sy34.f141834d;
                            bVar5.f195638w = sy34.f141835e;
                            C80995a aVar = new C80995a();
                            aVar.f237906o = 0;
                            bVar5.mo93545f(aVar);
                            C80996q a2 = C80996q.C1279a.m1369a();
                            C51315sy3 sy35 = m822.f298795h;
                            a2.mo112827qE(bVar5, sy35.f141837g, sy35.f141835e, gVar.f286027f.f228424o, (String) null, (byte[]) null);
                            gVar.mo136716F(m822, str);
                        } else if (m822.f298798n != null) {
                            ((C78541w) C86312j.m106911c(C78541w.class)).mo108489Qb(gVar.getContext(), gVar.f286027f.f228424o, m822.f298798n.toByteArray(), (C65953v0) null, 0, 0, (C78541w.C78542a) null);
                            gVar.mo136716F(m822, str);
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d83.g$b */
    public static final class C97450b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C97448g f286039d;

        public C97450b(C97448g gVar) {
            this.f286039d = gVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C92383e eVar;
            C101986v vVar;
            C92383e eVar2;
            C101986v vVar2;
            C97453j jVar = this.f286039d.f286032n;
            if (!(jVar == null || (eVar2 = jVar.f286054n) == null || (vVar2 = eVar2.f264360j) == null)) {
                C86709a0.m107524d().mo123458d(vVar2);
                eVar2.f264360j = null;
            }
            C97454k kVar = this.f286039d.f286033o;
            if (kVar != null && (eVar = kVar.f286062j) != null && (vVar = eVar.f264360j) != null) {
                C86709a0.m107524d().mo123458d(vVar);
                eVar.f264360j = null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97448g(Context context, xe4 xe4, C75343a aVar) {
        super(context, C0966R.style.f8765ui);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(xe4, "homeContext");
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f286027f = xe4;
        this.f286028g = aVar;
    }

    /* renamed from: E */
    public final void mo136715E(C101810m82 m822, Bitmap bitmap, String str) {
        C87412m.m108594g(m822, "shareContent");
        String str2 = this.f286029h;
        StringBuilder sb = new StringBuilder();
        sb.append("onSearchShare BusinessType:");
        sb.append(m822.f298791d.f298881g);
        sb.append(" SubType:");
        sb.append(m822.f298791d.f298882h);
        sb.append(" BrandFeed:");
        boolean z = true;
        sb.append(m822.f298792e != null);
        sb.append(" WeappFeed:");
        sb.append(m822.f298794g != null);
        sb.append(" WeappProfile:");
        sb.append(m822.f298795h != null);
        sb.append(" BrandProfile:");
        sb.append(m822.f298793f != null);
        sb.append(" FinderFeed:");
        sb.append(m822.f298797j != null);
        sb.append(" FinderProfile:");
        sb.append(m822.f298796i != null);
        sb.append(" Emoticon:");
        if (m822.f298798n == null) {
            z = false;
        }
        sb.append(z);
        Log.m105924i(str2, sb.toString());
        C61926c.m72668M(new C97449a(this, m822, bitmap, str));
    }

    /* renamed from: F */
    public final void mo136716F(C101810m82 m822, String str) {
        C87412m.m108594g(m822, "shareContent");
        C89779i0 i0Var = this.f286034p;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f286028g.mo91488b(m822);
        dismiss();
        WCTopicSearchShareActionReportStruct wCTopicSearchShareActionReportStruct = new WCTopicSearchShareActionReportStruct();
        wCTopicSearchShareActionReportStruct.f266536e = (long) C31543z5.m39455e();
        long j = 2;
        wCTopicSearchShareActionReportStruct.f266535d = 2;
        wCTopicSearchShareActionReportStruct.f266537f = 2;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        wCTopicSearchShareActionReportStruct.f266538g = wCTopicSearchShareActionReportStruct.mo86045b("ResultQuery", str, true);
        if (!C72996z1.m85820U5(this.f286027f.f228424o)) {
            j = 1;
        }
        wCTopicSearchShareActionReportStruct.f266539h = j;
        wCTopicSearchShareActionReportStruct.f266540i = wCTopicSearchShareActionReportStruct.mo86045b("ShareSceneId", this.f286027f.f228424o, true);
        String str3 = m822.f298791d.f298878d;
        if (str3 == null) {
            str3 = str2;
        }
        wCTopicSearchShareActionReportStruct.f266541j = wCTopicSearchShareActionReportStruct.mo86045b("ShareSessionId", str3, true);
        String str4 = m822.f298791d.f298879e;
        if (str4 == null) {
            str4 = str2;
        }
        wCTopicSearchShareActionReportStruct.f266542k = wCTopicSearchShareActionReportStruct.mo86045b("ShareSearchId", str4, true);
        String str5 = m822.f298791d.f298880f;
        if (str5 == null) {
            str5 = str2;
        }
        wCTopicSearchShareActionReportStruct.f266543l = wCTopicSearchShareActionReportStruct.mo86045b("ShareRequestId", str5, true);
        String str6 = m822.f298791d.f298883i;
        if (str6 != null) {
            str2 = str6;
        }
        wCTopicSearchShareActionReportStruct.f266544m = wCTopicSearchShareActionReportStruct.mo86045b("ShareDocId", str2, true);
        C101818my3 my32 = m822.f298791d;
        wCTopicSearchShareActionReportStruct.f266546o = (long) my32.f298882h;
        wCTopicSearchShareActionReportStruct.f266545n = (long) my32.f298881g;
        wCTopicSearchShareActionReportStruct.mo86054n();
        C22613h1.m26490p(wCTopicSearchShareActionReportStruct);
    }

    /* renamed from: G */
    public final void mo136717G(String str) {
        C87412m.m108594g(str, "id");
        if (this.f286034p == null) {
            this.f286034p = C89779i0.m112248e(getContext(), getContext().getString(C0966R.string.gas), true, 0, new C97450b(this));
        }
        C89779i0 i0Var = this.f286034p;
        if (i0Var != null && !i0Var.isShowing()) {
            i0Var.show();
        }
    }

    public void onBackPressed() {
        View findViewById;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator rotation;
        ViewPropertyAnimator duration;
        TextView textView;
        if (this.f286031j) {
            View view = this.f286030i;
            if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.kpm)) == null)) {
                textView.setText(C0966R.string.f361425jt1);
            }
            View view2 = this.f286030i;
            if (!(view2 == null || (findViewById = view2.findViewById(C0966R.C0970id.bec)) == null || (animate = findViewById.animate()) == null || (rotation = animate.rotation(0.0f)) == null || (duration = rotation.setDuration(200)) == null)) {
                duration.start();
            }
            C97454k kVar = this.f286033o;
            if (kVar != null) {
                kVar.f286059g.animate().translationX((float) C76577a.m92145A(kVar.mo24908k0())).setDuration(300).start();
            }
            this.f286031j = false;
            return;
        }
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(C0966R.style.f8365fv);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.crj, (ViewGroup) null);
        setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        inflate.findViewById(C0966R.C0970id.cij).setOnTouchListener(new C7252c(this));
        inflate.findViewById(C0966R.C0970id.bec).setOnClickListener(new C7253d(this));
        ((ImageView) inflate.findViewById(C0966R.C0970id.j5t)).setOnClickListener(new C45289e(inflate));
        ((TextView) inflate.findViewById(C0966R.C0970id.kpm)).setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3879hn)) * C76577a.m92161l(getContext()));
        this.f286032n = new C97453j(this, this.f286027f, this.f286028g, inflate);
        setOnDismissListener(new C97447f(this));
        setCancelable(true);
        this.f286030i = inflate;
    }
}
