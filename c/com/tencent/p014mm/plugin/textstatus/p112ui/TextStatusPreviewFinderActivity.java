package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dl3.C45413b;
import eb0.C31543z5;
import fy3.C32224a;
import go3.C59600d;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60187m5;
import ht1.C60200t1;
import ht1.C60208v1;
import in3.C87773e;
import j20.C117292a;
import java.util.ArrayList;
import k60.C60979d;
import kotlin.Metadata;
import nj3.C88989a;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import qy2.C77456r;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import up1.C27696y;
import uz2.C65488a0;
import uz2.C65490m;
import vo3.C90852c;
import xz2.C79019r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPreviewFinderActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity */
public final class TextStatusPreviewFinderActivity extends MMSecDataActivity {

    /* renamed from: d */
    public final C13601g f164587d = C36568h.m40985a(new C57454d(this));

    /* renamed from: e */
    public final C13601g f164588e = C36568h.m40985a(new C57453c(this));

    /* renamed from: f */
    public final C13601g f164589f = C36568h.m40985a(new C57457g(this));

    /* renamed from: g */
    public final C13601g f164590g = C36568h.m40985a(new C57451a(this));

    /* renamed from: h */
    public final C13601g f164591h = C36568h.m40985a(new C57452b(this));

    /* renamed from: i */
    public C59600d f164592i;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity$a */
    public static final class C57451a extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusPreviewFinderActivity f164593d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57451a(TextStatusPreviewFinderActivity textStatusPreviewFinderActivity) {
            super(0);
            this.f164593d = textStatusPreviewFinderActivity;
        }

        public Object invoke() {
            return (Button) this.f164593d.findViewById(C0966R.C0970id.f357588am1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity$b */
    public static final class C57452b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusPreviewFinderActivity f164594d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57452b(TextStatusPreviewFinderActivity textStatusPreviewFinderActivity) {
            super(0);
            this.f164594d = textStatusPreviewFinderActivity;
        }

        public Object invoke() {
            return (ImageView) this.f164594d.findViewById(C0966R.C0970id.fca);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity$c */
    public static final class C57453c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusPreviewFinderActivity f164595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57453c(TextStatusPreviewFinderActivity textStatusPreviewFinderActivity) {
            super(0);
            this.f164595d = textStatusPreviewFinderActivity;
        }

        public Object invoke() {
            return (ImageView) this.f164595d.findViewById(C0966R.C0970id.fcb);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity$d */
    public static final class C57454d extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusPreviewFinderActivity f164596d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57454d(TextStatusPreviewFinderActivity textStatusPreviewFinderActivity) {
            super(0);
            this.f164596d = textStatusPreviewFinderActivity;
        }

        public Object invoke() {
            return (FrameLayout) this.f164596d.findViewById(C0966R.C0970id.fkq);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity$e */
    public static final class C57455e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusPreviewFinderActivity f164597d;

        public C57455e(TextStatusPreviewFinderActivity textStatusPreviewFinderActivity) {
            this.f164597d = textStatusPreviewFinderActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f164597d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity$f */
    public static final class C57456f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusPreviewFinderActivity f164598d;

        public C57456f(TextStatusPreviewFinderActivity textStatusPreviewFinderActivity) {
            this.f164598d = textStatusPreviewFinderActivity;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusPreviewFinderActivity$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f164598d.setResult(-1);
            this.f164598d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusPreviewFinderActivity$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusPreviewFinderActivity$g */
    public static final class C57457g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusPreviewFinderActivity f164599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57457g(TextStatusPreviewFinderActivity textStatusPreviewFinderActivity) {
            super(0);
            this.f164599d = textStatusPreviewFinderActivity;
        }

        public Object invoke() {
            return (TextView) this.f164599d.findViewById(C0966R.C0970id.kvg);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c9q;
    }

    public void onCreate(Bundle bundle) {
        C59600d dVar;
        String nickname;
        Class cls = C11990s0.class;
        Class cls2 = C60208v1.class;
        Class cls3 = C60200t1.class;
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        C87773e.m109211d(getWindow());
        setNavigationbarColor(getResources().getColor(C0966R.color.ahf));
        String str = "";
        setMMTitle(str);
        hideActionbarLine();
        setBackBtn(new C57455e(this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("SELECT_OBJECT");
        if (byteArrayExtra == null) {
            Log.m105920e("MicroMsg.TextStatus.TextStatusPreviewFinderActivity", "finderObj bytes == null");
            finish();
            return;
        }
        FinderObject finderObject = new FinderObject();
        finderObject.parseFrom(byteArrayExtra);
        C60187m5 s9 = ((C60208v1) C86312j.m106911c(cls2)).mo78718s9(finderObject.contact);
        C59600d dVar2 = null;
        String avatarUrl = s9 != null ? s9.getAvatarUrl() : null;
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls)).mo11872i2();
        C7335d c = C86312j.m106911c(C62368t0.class);
        C87412m.m108593f(c, "getService(IFinderLoaderDataService::class.java)");
        C62368t0 t0Var = (C62368t0) c;
        if (avatarUrl == null) {
            avatarUrl = str;
        }
        C100810g0 Rt0 = t0Var.Rt0(avatarUrl, C27696y.MEDIUM_AVATAR_IMAGE);
        Object value = ((C36570n) this.f164588e).getValue();
        C87412m.m108593f(value, "<get-ivAuthor>(...)");
        i2.mo85957c(Rt0, (ImageView) value, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        Object value2 = ((C36570n) this.f164589f).getValue();
        C87412m.m108593f(value2, "<get-tvAuthorName>(...)");
        TextView textView = (TextView) value2;
        if (!(s9 == null || (nickname = s9.getNickname()) == null)) {
            str = nickname;
        }
        textView.setText(str);
        C7335d c2 = C86312j.m106911c(cls3);
        C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
        C60200t1 t1Var = (C60200t1) c2;
        Object value3 = ((C36570n) this.f164591h).getValue();
        C87412m.m108593f(value3, "<get-ivAuth>(...)");
        ImageView imageView = (ImageView) value3;
        FinderContact finderContact = finderObject.contact;
        t1Var.mo76826X(imageView, finderContact != null ? finderContact.authInfo : null, 1, ((C60208v1) C86312j.m106911c(cls2)).O40(s9));
        Object value4 = ((C36570n) this.f164590g).getValue();
        C87412m.m108593f(value4, "<get-btnOk>(...)");
        ((Button) value4).setOnClickListener(new C57456f(this));
        C65488a0 Fd0 = ((C60200t1) C86312j.m106911c(cls3)).Fd0(finderObject);
        C65490m mVar = new C65490m();
        mVar.f188445d = 0;
        mVar.f188446e = 4;
        mVar.f188448g = C31543z5.m39455e();
        C77456r a = C79019r.f232026a.mo108986a(Fd0.f188439d);
        if (a != null) {
            Object value5 = ((C36570n) this.f164587d).getValue();
            C87412m.m108593f(value5, "<get-layoutFinderPreview>(...)");
            dVar2 = a.mo84138IT("finder@inner", (FrameLayout) value5, Fd0, mVar);
        }
        this.f164592i = dVar2;
        AppCompatActivity context = getContext();
        if ((context instanceof MMFragmentActivity) && (dVar = this.f164592i) != null) {
            C45413b.C45414a.m50357a(dVar, (MMFragmentActivity) context);
        }
        C59600d dVar3 = this.f164592i;
        if (dVar3 != null && !dVar3.f170310d) {
            dVar3.mo79964h();
            dVar3.mo79962f();
        }
    }

    public void onPause() {
        super.onPause();
        C59600d dVar = this.f164592i;
        if (dVar != null && dVar.f170310d) {
            dVar.mo79963g();
            dVar.mo79961e();
        }
    }

    public void onResume() {
        super.onResume();
        C59600d dVar = this.f164592i;
        if (dVar != null && !dVar.f170310d) {
            dVar.mo79964h();
            dVar.mo79962f();
        }
    }
}
