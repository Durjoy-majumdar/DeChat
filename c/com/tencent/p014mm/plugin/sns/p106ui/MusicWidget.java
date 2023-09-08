package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95006y;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import g34.C116918i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kr2.C76634a;
import p159gw.C8462g;
import qc0.C101093a;
import te3.C101802kr2;
import te3.f94;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.MusicWidget */
public class MusicWidget extends C96157q {

    /* renamed from: c */
    public MMActivity f276970c;

    /* renamed from: d */
    public WXMediaMessage f276971d = null;

    /* renamed from: e */
    public View f276972e;

    /* renamed from: f */
    public CdnImageView f276973f = null;

    /* renamed from: g */
    public TextView f276974g = null;

    /* renamed from: h */
    public TextView f276975h = null;

    /* renamed from: i */
    public ImageView f276976i;

    /* renamed from: j */
    public String f276977j;

    /* renamed from: k */
    public String f276978k = "";

    /* renamed from: l */
    public String f276979l = "";

    /* renamed from: m */
    public boolean f276980m = false;

    /* renamed from: n */
    public boolean f276981n = false;

    /* renamed from: o */
    public boolean f276982o = false;

    /* renamed from: p */
    public C91998s f276983p = null;

    /* renamed from: q */
    public int f276984q;

    /* renamed from: r */
    public int f276985r = 1;

    /* renamed from: s */
    public String f276986s = "";

    /* renamed from: t */
    public IListener f276987t;

    /* renamed from: u */
    public Bitmap f276988u;

    /* renamed from: com.tencent.mm.plugin.sns.ui.MusicWidget$a */
    public class C85471a implements Runnable {
        public C85471a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.MusicWidget$2");
            C101093a.m132490l();
            MusicWidget musicWidget = MusicWidget.this;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            musicWidget.f276982o = false;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.MusicWidget$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.MusicWidget$b */
    public class C85472b implements View.OnClickListener {
        public C85472b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/MusicWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MusicWidget$4");
            if (MusicWidget.this.mo132243m()) {
                MusicWidget musicWidget = MusicWidget.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                musicWidget.mo132242l();
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            } else {
                MusicWidget musicWidget2 = MusicWidget.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                musicWidget2.getClass();
                SnsMethodCalculate.markStartTimeMs("doBeginPlayMusic", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                if (musicWidget2.f276971d == null) {
                    Log.m105928w("MicroMsg.MusicWidget", "doBeingPlayMusic: but item is null");
                    SnsMethodCalculate.markEndTimeMs("doBeginPlayMusic", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                } else {
                    new MMHandler(musicWidget2.f276970c.getMainLooper()).post(new C85473s1(musicWidget2));
                    SnsMethodCalculate.markEndTimeMs("doBeginPlayMusic", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                }
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MusicWidget$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/MusicWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public MusicWidget(MMActivity mMActivity) {
        C854701 r0 = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.MusicWidget$1");
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.MusicWidget$1");
                int i = ((MusicPlayerEvent) iEvent).f9336d.f9337a;
                if (i == 0 || i == 1) {
                    MusicWidget musicWidget = MusicWidget.this;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                    ImageView imageView = musicWidget.f276976i;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                    imageView.setImageResource(C0966R.C0969drawable.ajq);
                } else if (i == 2 || i == 3 || i == 4 || i == 7) {
                    MusicWidget musicWidget2 = MusicWidget.this;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                    ImageView imageView2 = musicWidget2.f276976i;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                    imageView2.setImageResource(C0966R.C0969drawable.ajs);
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.MusicWidget$1");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.MusicWidget$1");
                return false;
            }
        };
        this.f276987t = r0;
        this.f276970c = mMActivity;
        r0.alive();
    }

    /* renamed from: k */
    public static /* synthetic */ WXMediaMessage m121558k(MusicWidget musicWidget) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        WXMediaMessage wXMediaMessage = musicWidget.f276971d;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return wXMediaMessage;
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        View inflate = C85868k2.m106137b(this.f276970c).inflate(C0966R.C0971layout.f360042cb3, (ViewGroup) null);
        this.f276972e = inflate;
        this.f276973f = (CdnImageView) inflate.findViewById(C0966R.C0970id.f4p);
        this.f276974g = (TextView) this.f276972e.findViewById(C0966R.C0970id.kpq);
        this.f276975h = (TextView) this.f276972e.findViewById(C0966R.C0970id.iub);
        View findViewById = this.f276972e.findViewById(C0966R.C0970id.k0s);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/MusicWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/sns/ui/MusicWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f276974g.setText(this.f276971d.title);
        byte[] bArr = this.f276971d.thumbData;
        if (bArr != null) {
            this.f276988u = BitmapUtil.decodeByteArray(bArr);
        }
        this.f276973f.setImageBitmap(this.f276988u);
        if (!Util.isNullOrNil(this.f276971d.description)) {
            this.f276975h.setText(this.f276971d.description);
            this.f276975h.setVisibility(0);
        } else {
            this.f276975h.setVisibility(8);
        }
        ImageView imageView = (ImageView) this.f276972e.findViewById(C0966R.C0970id.k0s);
        this.f276976i = imageView;
        imageView.setVisibility(0);
        if (!mo132243m() || !this.f276982o) {
            this.f276976i.setImageResource(C0966R.C0969drawable.ajs);
        } else {
            this.f276976i.setImageResource(C0966R.C0969drawable.ajq);
        }
        this.f276976i.setOnClickListener(new C85472b());
        C102236a0.m134779x0(this.f276973f, this.f276970c);
        View view = this.f276972e;
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return view;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        this.f276971d = new SendMessageToWX.Req(this.f276970c.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
        this.f276977j = this.f276970c.getIntent().getStringExtra("Ksnsupload_musicid");
        this.f276983p = C91998s.m115551f(this.f276970c.getIntent());
        this.f276978k = Util.nullAs(this.f276970c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f276979l = Util.nullAs(this.f276970c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f276980m = this.f276970c.getIntent().getBooleanExtra("KThrid_app", false);
        this.f276981n = this.f276970c.getIntent().getBooleanExtra("KSnsAction", false);
        this.f276984q = this.f276970c.getIntent().getIntExtra("Ksnsupload_source", 0);
        if (this.f276970c.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f276985r = 1;
        } else {
            this.f276985r = 0;
        }
        this.f276986s = Util.nullAs(this.f276970c.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MusicWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        WXMediaMessage wXMediaMessage;
        C116918i iVar2 = iVar;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        C94945s2 r = C94866e1.gy0().mo131207r(this.f276971d, str, this.f276978k, this.f276979l);
        if (r == null) {
            Log.m105921e("MicroMsg.MusicWidget", "packHelper == null, %s, %s", this.f276978k, this.f276979l);
            SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            return false;
        }
        pInt.value = r.mo131253j();
        if (i3 > C76634a.f224255a) {
            r.mo131261r(1, 4);
        }
        r.mo131234H(this.f276984q);
        if (this.f276980m) {
            r.mo131234H(5);
        }
        r.mo131262s(linkedList);
        LinkedList linkedList2 = new LinkedList();
        if (list != null) {
            new LinkedList();
            List<String> gt = ((C8462g) C86312j.m106911c(C8462g.class)).mo9266gt();
            for (String next : list) {
                if (gt != null && !gt.contains(next)) {
                    f94 f94 = new f94();
                    f94.f298255d = next;
                    linkedList2.add(f94);
                }
            }
        }
        r.mo131243Q(linkedList2);
        if (iVar2 != null) {
            r.mo131241O(iVar2.f350347d, iVar2.f350348e);
        }
        r.mo131265v(kr22);
        if (z) {
            r.mo131264u(1);
        } else {
            r.mo131264u(0);
        }
        r.mo131263t(list2);
        int i6 = i;
        r.mo131228B(i);
        r.mo131235I((String) null, (String) null, (String) null, i4, i5);
        r.mo131269z(this.f276985r, this.f276986s);
        if (this.f276981n && (wXMediaMessage = this.f276971d) != null) {
            r.mo131238L(wXMediaMessage.mediaTagName);
            String str3 = this.f276978k;
            WXMediaMessage wXMediaMessage2 = this.f276971d;
            r.mo131240N(str3, wXMediaMessage2.messageExt, wXMediaMessage2.messageAction);
        }
        mo133779j(r);
        int i7 = r.mo131252i();
        C91998s sVar = this.f276983p;
        if (sVar != null) {
            sVar.mo125840a(i7);
            C95006y.f275639b.mo131398c(this.f276983p);
        }
        C94866e1.gy0().mo131192c();
        this.f276970c.finish();
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return false;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        Bitmap bitmap = this.f276988u;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f276988u.recycle();
        }
        this.f276987t.dead();
        if (mo132243m() && this.f276982o) {
            mo132242l();
        }
        boolean m = mo132243m();
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return m;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return true;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MusicWidget");
    }

    /* renamed from: l */
    public final void mo132242l() {
        SnsMethodCalculate.markStartTimeMs("doStopPlayMusic", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        new MMHandler(this.f276970c.getMainLooper()).post(new C85471a());
        SnsMethodCalculate.markEndTimeMs("doStopPlayMusic", "com.tencent.mm.plugin.sns.ui.MusicWidget");
    }

    /* renamed from: m */
    public boolean mo132243m() {
        SnsMethodCalculate.markStartTimeMs("isPlay", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        boolean c = C101093a.m132481c();
        SnsMethodCalculate.markEndTimeMs("isPlay", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return c;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MusicWidget");
        return false;
    }
}
