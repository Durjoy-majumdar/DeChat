package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.plugin.C40034i;
import com.tencent.p014mm.app.plugin.URISpanHandlerSet;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import de3.C45335p;
import di3.C86312j;
import eb0.C45628s0;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import he0.C46024k;
import hp3.C87581a;
import if0.C46238a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import org.json.JSONObject;
import p270xi.C91212b;
import p629ny.C76979h;
import p749xh.C38700x6;
import qo3.C101218e0;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C51351t63;
import te3.C51494u42;
import te3.C51644v42;
import te3.pl4;
import te3.ql4;
import wc3.C53145l0;
import wd3.C53155r0;
import z04.C112550d0;
import z04.C112551y;
import zj3.C53792l0;

@C91212b(exportInterface = C53792l0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.OpenIMArchiveComponent */
public final class OpenIMArchiveComponent extends C73412a implements C53792l0, MStorage.IOnStorageChange {

    /* renamed from: e */
    public boolean f121542e;

    /* renamed from: f */
    public C101218e0 f121543f;

    /* renamed from: g */
    public final OpenIMArchiveSpanHandler f121544g = new OpenIMArchiveSpanHandler(this);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/component/OpenIMArchiveComponent$OpenIMArchiveSpanHandler;", "Lcom/tencent/mm/app/plugin/URISpanHandlerSet$BaseUriSpanHandler;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.ui.chatting.component.OpenIMArchiveComponent$OpenIMArchiveSpanHandler */
    public static final class OpenIMArchiveSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler {

        /* renamed from: a */
        public final WeakReference<OpenIMArchiveComponent> f121545a;

        public OpenIMArchiveSpanHandler(OpenIMArchiveComponent openIMArchiveComponent) {
            C87412m.m108594g(openIMArchiveComponent, "component");
            this.f121545a = new WeakReference<>(openIMArchiveComponent);
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{65};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            C87412m.m108591d(str);
            if (C112551y.m153820t(C112550d0.m153799i0(str).toString(), "wxwork://jump?target=archivepopup", false, 2, (Object) null)) {
                return new C53155r0(str, 65, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            C87412m.m108591d(r0Var);
            if (r0Var.f148313d != 65) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("handleSpanClick ");
            OpenIMArchiveComponent openIMArchiveComponent = this.f121545a.get();
            sb.append(openIMArchiveComponent != null ? Boolean.valueOf(openIMArchiveComponent.f121542e) : null);
            Log.m105918d("MicroMsg.OpenIMArchiveComponent", sb.toString());
            OpenIMArchiveComponent openIMArchiveComponent2 = this.f121545a.get();
            if (openIMArchiveComponent2 == null || openIMArchiveComponent2.f121542e) {
                return false;
            }
            String queryParameter = Uri.parse(r0Var.f148312c).getQueryParameter("url");
            if (queryParameter == null) {
                return true;
            }
            openIMArchiveComponent2.mo70048Z5(queryParameter, false);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.OpenIMArchiveComponent$a */
    public static final class C44785a extends C89132b<C51644v42> {

        /* renamed from: com.tencent.mm.ui.chatting.component.OpenIMArchiveComponent$a$a */
        public static final class C44786a extends C87413o implements C32224a<C51494u42> {

            /* renamed from: d */
            public final /* synthetic */ String f121546d;

            /* renamed from: e */
            public final /* synthetic */ String f121547e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44786a(String str, String str2) {
                super(0);
                this.f121546d = str;
                this.f121547e = str2;
            }

            public Object invoke() {
                C51494u42 u422 = new C51494u42();
                u422.f142593d = this.f121546d;
                u422.f142594e = this.f121547e;
                return u422;
            }
        }

        public C44785a(String str, String str2) {
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(str2, "url");
            C13601g a = C36568h.m40985a(new C44786a(str, str2));
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = (C51494u42) a.getValue();
            bVar.f127067b = new C51644v42();
            bVar.f127068c = "/cgi-bin/micromsg-bin/getopenimarchivepopupinfo";
            bVar.f127069d = 6987;
            mo123453j(bVar.mo72403a());
        }

        /* renamed from: h */
        public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
            C51644v42 v422 = (C51644v42) eu32;
            Log.m105924i("MicroMsg.NetSceneGetArchiveInfo", "onCgiBack errType:" + i + " errCode:" + i2 + " errMsg:" + str);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.OpenIMArchiveComponent$b */
    public static final class C44787b extends C89132b<ql4> {

        /* renamed from: com.tencent.mm.ui.chatting.component.OpenIMArchiveComponent$b$a */
        public static final class C44788a extends C87413o implements C32224a<pl4> {

            /* renamed from: d */
            public final /* synthetic */ int f121548d;

            /* renamed from: e */
            public final /* synthetic */ String f121549e;

            /* renamed from: f */
            public final /* synthetic */ String f121550f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44788a(int i, String str, String str2) {
                super(0);
                this.f121548d = i;
                this.f121549e = str;
                this.f121550f = str2;
            }

            public Object invoke() {
                pl4 pl4 = new pl4();
                pl4.f139827d = this.f121548d;
                pl4.f139828e = this.f121549e;
                pl4.f139829f = this.f121550f;
                return pl4;
            }
        }

        public C44787b(String str, String str2, int i) {
            C87412m.m108594g(str, "userName");
            C87412m.m108594g(str2, "url");
            C13601g a = C36568h.m40985a(new C44788a(i, str, str2));
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = (pl4) a.getValue();
            bVar.f127067b = new ql4();
            bVar.f127068c = "/cgi-bin/micromsg-bin/updateopenimarchivestatus";
            bVar.f127069d = 6924;
            mo123453j(bVar.mo72403a());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.OpenIMArchiveComponent$c */
    public static final class C44789c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ OpenIMArchiveComponent f121551a;

        /* renamed from: b */
        public final /* synthetic */ String f121552b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<C89779i0> f121553c;

        /* renamed from: d */
        public final /* synthetic */ boolean f121554d;

        public C44789c(OpenIMArchiveComponent openIMArchiveComponent, String str, C8479f0<C89779i0> f0Var, boolean z) {
            this.f121551a = openIMArchiveComponent;
            this.f121552b = str;
            this.f121553c = f0Var;
            this.f121554d = z;
        }

        public Object call(Object obj) {
            JSONObject jSONObject;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f121551a.hashCode());
            sb.append(" checkArchiveDlg() called isPause = ");
            sb.append(this.f121551a.f121542e);
            sb.append(" reqUserName = ");
            sb.append(this.f121552b);
            sb.append(" curUserName:");
            C67391b bVar = this.f121551a.f215752d;
            sb.append(bVar != null ? bVar.mo91577r() : null);
            sb.append(" errType:");
            sb.append(cVar.f256793a);
            sb.append(" errCode:");
            sb.append(cVar.f256794b);
            sb.append(" resp:");
            C51644v42 v422 = (C51644v42) cVar.f256796d;
            if (v422 != null) {
                jSONObject = new JSONObject();
                try {
                    C49966ja jaVar = v422.BaseResponse;
                    C46238a.C46239a aVar = C46238a.f124644a;
                    aVar.mo71655d(jSONObject, "BaseResponse", jaVar, false);
                    aVar.mo71655d(jSONObject, "info", v422.f143300d, false);
                } catch (Exception unused) {
                }
            } else {
                jSONObject = null;
            }
            sb.append(jSONObject);
            Log.m105924i("MicroMsg.OpenIMArchiveComponent", sb.toString());
            C89779i0 i0Var = (C89779i0) this.f121553c.f27484d;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            OpenIMArchiveComponent openIMArchiveComponent = this.f121551a;
            if (!openIMArchiveComponent.f121542e) {
                C67391b bVar2 = openIMArchiveComponent.f215752d;
                if (C87412m.m108589b(bVar2 != null ? bVar2.mo91577r() : null, this.f121552b)) {
                    if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                        OpenIMArchiveComponent openIMArchiveComponent2 = this.f121551a;
                        C51351t63 t632 = ((C51644v42) cVar.f256796d).f143300d;
                        C87412m.m108593f(t632, "it.resp.info");
                        C101218e0 e0Var = openIMArchiveComponent2.f121543f;
                        if (!(e0Var != null && e0Var.mo140661h())) {
                            C101218e0 e0Var2 = new C101218e0(openIMArchiveComponent2.f215752d.mo91565f(), t632.f141996n ? 3 : 1, 2, false);
                            View inflate = LayoutInflater.from(openIMArchiveComponent2.f215752d.mo91565f()).inflate(C0966R.C0971layout.f359917bm0, (ViewGroup) null);
                            e0Var2.mo140663j(inflate);
                            View inflate2 = LayoutInflater.from(openIMArchiveComponent2.f215752d.mo91565f()).inflate(C0966R.C0971layout.f359918bm1, (ViewGroup) null);
                            e0Var2.mo140670p(inflate2);
                            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kwr);
                            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.f359429kw2);
                            TextView textView3 = (TextView) inflate2.findViewById(C0966R.C0970id.kwg);
                            TextView textView4 = e0Var2.f296372C;
                            if (textView4 != null) {
                                textView4.setTypeface(Typeface.DEFAULT_BOLD);
                                int h = C76577a.m92157h(openIMArchiveComponent2.f215752d.mo91565f(), C0966R.dimen.f3745cw);
                                Drawable drawable = openIMArchiveComponent2.f215752d.mo91565f().getDrawable(C0966R.raw.open_im_main_logo);
                                if (drawable != null) {
                                    drawable.setBounds(0, 0, h, h);
                                } else {
                                    drawable = null;
                                }
                                textView4.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                                textView4.setText(' ' + t632.f141989d);
                                textView4.setGravity(16);
                            }
                            textView.setText(t632.f141990e);
                            textView2.setText(t632.f141991f);
                            textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
                            String str = t632.f141995j;
                            if (!(str == null || C112551y.m153811k(str))) {
                                String str2 = t632.f141994i;
                                if (!(str2 == null || C112551y.m153811k(str2))) {
                                    textView3.setVisibility(0);
                                    String format = String.format("<a href='%s'>%s</a>", Arrays.copyOf(new Object[]{t632.f141995j, t632.f141994i}, 2));
                                    C87412m.m108593f(format, "format(format, *args)");
                                    textView3.setText(format);
                                    ((C76979h) C86312j.m106911c(C76979h.class)).mo107079pD(textView3, 1);
                                    e0Var2.mo140667n(t632.f141993h, t632.f141992g);
                                    C44838r3 r3Var = new C44838r3(openIMArchiveComponent2, t632);
                                    C44840s3 s3Var = new C44840s3(openIMArchiveComponent2, t632);
                                    e0Var2.f296373D = r3Var;
                                    e0Var2.f296374E = s3Var;
                                    e0Var2.mo140655A();
                                    openIMArchiveComponent2.f121543f = e0Var2;
                                }
                            }
                            textView3.setVisibility(8);
                            ((C76979h) C86312j.m106911c(C76979h.class)).mo107079pD(textView3, 1);
                            e0Var2.mo140667n(t632.f141993h, t632.f141992g);
                            C44838r3 r3Var2 = new C44838r3(openIMArchiveComponent2, t632);
                            C44840s3 s3Var2 = new C44840s3(openIMArchiveComponent2, t632);
                            e0Var2.f296373D = r3Var2;
                            e0Var2.f296374E = s3Var2;
                            e0Var2.mo140655A();
                            openIMArchiveComponent2.f121543f = e0Var2;
                        }
                    } else if (!this.f121554d) {
                        C67391b bVar3 = this.f121551a.f215752d;
                        C76879j.m92754y(bVar3 != null ? bVar3.mo91565f() : null, cVar.f256795c, "", this.f121551a.f215752d.mo91565f().getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: Y5 */
    public static final void m49597Y5(OpenIMArchiveComponent openIMArchiveComponent, C51351t63 t632, int i) {
        C67391b bVar = openIMArchiveComponent.f215752d;
        String r = bVar != null ? bVar.mo91577r() : null;
        if (r == null) {
            r = "";
        }
        Log.m105925i("MicroMsg.OpenIMArchiveComponent", "doubleBtnClick username:%s url:%s status:%s", r, t632.f141995j, Integer.valueOf(i));
        C89779i0 Q = C76879j.m92723Q(openIMArchiveComponent.f215752d.mo91565f(), "", openIMArchiveComponent.f215752d.mo91565f().getString(C0966R.string.gas), true, false, (DialogInterface.OnCancelListener) null);
        String str = t632.f141995j;
        C87412m.m108593f(str, "info.privacy_agreement_url");
        C89059e i2 = new C44787b(r, str, i).mo9225i();
        Activity f = openIMArchiveComponent.f215752d.mo91565f();
        C87412m.m108592e(f, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        i2.mo11397F((MMFragmentActivity) f);
        i2.mo123062e(new C44836q3(Q, r, openIMArchiveComponent));
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        Class cls = C46024k.class;
        boolean z = false;
        this.f121542e = false;
        C67391b bVar = this.f215752d;
        String r = bVar != null ? bVar.mo91577r() : null;
        if (r == null) {
            r = "";
        }
        if (!C112551y.m153811k(r)) {
            if (C72996z1.m85843n5(r) || C72996z1.m85844o5(r) || C45628s0.m50748M(r)) {
                String wK = ((C46024k) C86312j.m106911c(cls)).mo58606wK(r);
                Log.m105925i("MicroMsg.OpenIMArchiveComponent", hashCode() + " onChattingResume talker:%s url:%s", r, wK);
                if (wK == null || C112551y.m153811k(wK)) {
                    z = true;
                }
                if (!z) {
                    C87412m.m108593f(wK, "url");
                    mo70048Z5(wK, true);
                }
                ((C46024k) C86312j.m106911c(cls)).mo58603iN().add(this);
            }
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        Log.m105918d("MicroMsg.OpenIMArchiveComponent", hashCode() + " onChattingPause() called");
        this.f121542e = true;
        ((C46024k) C86312j.m106911c(C46024k.class)).mo58603iN().remove(this);
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Log.m105924i("MicroMsg.OpenIMArchiveComponent", "onChattingEnterAnimStart() called " + hashCode());
        C40034i B = C40034i.m43126B();
        B.f107348h.add(this.f121544g);
    }

    /* renamed from: Z5 */
    public final void mo70048Z5(String str, boolean z) {
        C67391b bVar = this.f215752d;
        Boolean bool = null;
        String r = bVar != null ? bVar.mo91577r() : null;
        if (r == null) {
            r = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" checkArchiveDlg() called with: url = ");
        sb.append(str);
        sb.append(", fromNewXml = ");
        sb.append(z);
        sb.append(" reqUserName = ");
        sb.append(r);
        sb.append(" isfinish:");
        Activity f = this.f215752d.mo91565f();
        if (f != null) {
            bool = Boolean.valueOf(f.isFinishing());
        }
        sb.append(bool);
        Log.m105924i("MicroMsg.OpenIMArchiveComponent", sb.toString());
        C8479f0 f0Var = new C8479f0();
        if (!z) {
            f0Var.f27484d = C76879j.m92723Q(this.f215752d.mo91565f(), "", this.f215752d.mo91565f().getString(C0966R.string.gas), true, false, (DialogInterface.OnCancelListener) null);
        }
        C89059e i = new C44785a(r, str).mo9225i();
        Activity f2 = this.f215752d.mo91565f();
        C87412m.m108592e(f2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        i.mo11397F((MMFragmentActivity) f2);
        i.mo123062e(new C44789c(this, r, f0Var, z));
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        Log.m105924i("MicroMsg.OpenIMArchiveComponent", "onChattingExitAnimEnd() called " + hashCode());
        C40034i B = C40034i.m43126B();
        B.f107348h.remove(this.f121544g);
        C101218e0 e0Var = this.f121543f;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        this.f121543f = null;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        C67391b bVar = this.f215752d;
        String str2 = null;
        String r = bVar != null ? bVar.mo91577r() : null;
        if (r == null) {
            r = "";
        }
        if (!C112551y.m153811k(r)) {
            boolean z = false;
            if (mStorageEventData != null && mStorageEventData.eventId == 4) {
                Object obj = mStorageEventData != null ? mStorageEventData.obj : null;
                C38700x6 x6Var = obj instanceof C38700x6 ? (C38700x6) obj : null;
                if (C87412m.m108589b(r, x6Var != null ? x6Var.field_username : null)) {
                    Object obj2 = mStorageEventData != null ? mStorageEventData.obj : null;
                    C38700x6 x6Var2 = obj2 instanceof C38700x6 ? (C38700x6) obj2 : null;
                    if (x6Var2 != null) {
                        str2 = x6Var2.field_content;
                    }
                    if (str2 == null || C112551y.m153811k(str2)) {
                        z = true;
                    }
                    if (!z) {
                        mo70048Z5(str2, true);
                    }
                }
            }
        }
    }
}
