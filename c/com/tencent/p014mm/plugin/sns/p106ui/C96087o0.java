package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.ArtistBrowseUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import os2.C100417r0;
import p196ln.C76705f;
import p629ny.C76979h;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.o0 */
public class C96087o0 extends LinearLayout implements C96327z0 {

    /* renamed from: d */
    public C96095g f280624d = new C96095g(this);

    /* renamed from: e */
    public Context f280625e;

    /* renamed from: f */
    public SnsInfo f280626f = null;

    /* renamed from: g */
    public C96094f f280627g;

    /* renamed from: h */
    public int f280628h = 0;

    /* renamed from: i */
    public String f280629i = "";

    /* renamed from: j */
    public int f280630j;

    /* renamed from: n */
    public boolean f280631n = false;

    /* renamed from: o */
    public View.OnTouchListener f280632o = Util.genLinearPressedListener();

    /* renamed from: p */
    public String f280633p = "";

    /* renamed from: q */
    public boolean f280634q = true;

    /* renamed from: com.tencent.mm.plugin.sns.ui.o0$a */
    public class C96088a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.o0$a$a */
        public class C96089a implements Runnable {
            public C96089a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.GalleryFooter$1$1");
                C96087o0.this.mo133643e();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.GalleryFooter$1$1");
            }
        }

        public C96088a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$1");
            if (C96087o0.m123121b(C96087o0.this) == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            String str = "";
            if (C96087o0.m123121b(C96087o0.this).getLikeFlag() == 0) {
                if (C96087o0.m123121b(C96087o0.this).isExtFlag()) {
                    SnsInfo b = C96087o0.m123121b(C96087o0.this);
                    C96087o0 o0Var = C96087o0.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
                    int i = o0Var.f280630j;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
                    C5431p1.C5432a.m5341l(b, 1, "", 0, "", false, i);
                } else {
                    String str2 = C96087o0.m123121b(C96087o0.this).field_userName;
                    SnsInfo b2 = C96087o0.m123121b(C96087o0.this);
                    C96087o0 o0Var2 = C96087o0.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
                    int i2 = o0Var2.f280630j;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
                    C5431p1.C5432a.m5343n(str2, 5, str, b2, i2);
                }
                C96087o0.m123121b(C96087o0.this).setLikeFlag(1);
                C94866e1.Yx0().Pq0(C96087o0.m123121b(C96087o0.this));
                SnsReportHelper.f275506m0.mo131361V().f265948s = 2;
            } else {
                C96087o0.m123121b(C96087o0.this).setLikeFlag(0);
                C94866e1.Yx0().Pq0(C96087o0.m123121b(C96087o0.this));
                C5431p1.C5432a.m5338a(C96087o0.m123121b(C96087o0.this).getSnsId());
                C96087o0 o0Var3 = C96087o0.this;
                SnsInfo SE = C94866e1.Yx0().mo139806SE(C96087o0.m123121b(C96087o0.this).field_snsId);
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
                o0Var3.f280626f = SE;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
                SnsReportHelper.f275506m0.mo131361V().f265948s = 4;
            }
            if (C96087o0.m123121b(C96087o0.this).field_snsId != 0) {
                str = C102236a0.m134765q0(C96087o0.m123121b(C96087o0.this).field_snsId);
            }
            C115669n.INSTANCE.mo160131h(11989, 1, str, 0);
            new MMHandler().postDelayed(new C96089a(), 500);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.o0$b */
    public class C96090b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f280637d;

        public C96090b(Context context) {
            this.f280637d = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$2");
            Log.m105918d("MicroMsg.GalleryFooter", "comment cmd");
            if (C96087o0.m123121b(C96087o0.this) == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            int i = C96087o0.m123121b(C96087o0.this).localid;
            Intent intent = new Intent();
            intent.putExtra("sns_comment_localId", i);
            C96087o0 o0Var = C96087o0.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            int i2 = o0Var.f280630j;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            intent.putExtra("sns_source", i2);
            intent.setClass(this.f280637d, SnsCommentUI.class);
            C115669n.INSTANCE.mo160131h(11989, 2, C96087o0.m123121b(C96087o0.this).field_snsId == 0 ? "" : C102236a0.m134765q0(C96087o0.m123121b(C96087o0.this).field_snsId), 0);
            Context context = this.f280637d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/GalleryFooter$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/sns/ui/GalleryFooter$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.o0$c */
    public class C96091c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f280639d;

        public C96091c(Context context) {
            this.f280639d = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$3");
            if (C96087o0.m123121b(C96087o0.this) == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$3");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C115669n.INSTANCE.mo160131h(11989, 3, C96087o0.m123121b(C96087o0.this).field_snsId == 0 ? "" : C102236a0.m134765q0(C96087o0.m123121b(C96087o0.this).field_snsId), 0);
            int i = C96087o0.m123121b(C96087o0.this).localid;
            Intent intent = new Intent();
            intent.setClass(this.f280639d, SnsCommentDetailUI.class);
            intent.putExtra("INTENT_TALKER", C96087o0.m123121b(C96087o0.this).getUserName());
            intent.putExtra("INTENT_SNS_LOCAL_ID", C100417r0.m131420i("sns_table_", (long) i));
            intent.putExtra("INTENT_FROMGALLERY", true);
            ((MMActivity) this.f280639d).startActivityForResult(intent, 1);
            SnsReportHelper.f275506m0.mo131361V().f265940k = 1;
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.o0$d */
    public class C96092d implements View.OnClickListener {
        public C96092d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$4");
            if (C96087o0.m123122c(C96087o0.this) != null) {
                ArtistBrowseUI.C95306c cVar = (ArtistBrowseUI.C95306c) C96087o0.m123122c(C96087o0.this);
                cVar.getClass();
                SnsMethodCalculate.markStartTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
                C101804kv2 cntMedia = ArtistBrowseUI.this.f277761o.getCntMedia();
                if (cntMedia == null) {
                    SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
                } else {
                    Log.m105918d("MicroMsg.ArtistBrowseUI", "set bg the meida id " + cntMedia.f298689d);
                    C91998s.m115550d(723);
                    if (!C86013q1.m106450k(C94938q1.m120518e(C94866e1.m120262YO(), cntMedia.f298689d) + C102236a0.m134717L(cntMedia))) {
                        SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
                    } else {
                        C94866e1.gy0().mo131204o(cntMedia);
                        Intent intent = new Intent();
                        intent.setClass(ArtistBrowseUI.this, SettingSnsBackgroundUI.class);
                        intent.setFlags(536870912);
                        intent.addFlags(67108864);
                        ArtistBrowseUI artistBrowseUI = ArtistBrowseUI.this;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        ArtistBrowseUI artistBrowseUI2 = artistBrowseUI;
                        C117292a.m165358d(artistBrowseUI2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$3", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        artistBrowseUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(artistBrowseUI2, "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$3", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        ArtistBrowseUI.this.finish();
                        SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.o0$e */
    public class C96093e implements View.OnClickListener {
        public C96093e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$5");
            if (C96087o0.m123122c(C96087o0.this) != null) {
                ((ArtistBrowseUI.C95306c) C96087o0.m123122c(C96087o0.this)).getClass();
                SnsMethodCalculate.markStartTimeMs("onRemoveItem", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
                SnsMethodCalculate.markEndTimeMs("onRemoveItem", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.o0$f */
    public interface C96094f {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.o0$g */
    public class C96095g {

        /* renamed from: a */
        public LinearLayout f280643a;

        /* renamed from: b */
        public TextView f280644b;

        /* renamed from: c */
        public LinearLayout f280645c;

        /* renamed from: d */
        public LinearLayout f280646d;

        /* renamed from: e */
        public ImageView f280647e;

        /* renamed from: f */
        public LinearLayout f280648f;

        /* renamed from: g */
        public LinearLayout f280649g;

        /* renamed from: h */
        public TextView f280650h;

        /* renamed from: i */
        public TextView f280651i;

        /* renamed from: j */
        public TextView f280652j;

        /* renamed from: k */
        public TextView f280653k;

        /* renamed from: l */
        public LinearLayout f280654l;

        /* renamed from: m */
        public ImageView f280655m;

        /* renamed from: n */
        public ImageView f280656n;

        /* renamed from: o */
        public ImageView f280657o;

        /* renamed from: p */
        public LinearLayout f280658p;

        /* renamed from: q */
        public LinearLayout f280659q;

        /* renamed from: r */
        public TextView f280660r;

        public C96095g(C96087o0 o0Var) {
        }
    }

    public C96087o0(Context context, int i, boolean z) {
        super(context);
        this.f280628h = i;
        this.f280631n = z;
        mo133642d(context);
    }

    /* renamed from: b */
    public static /* synthetic */ SnsInfo m123121b(C96087o0 o0Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        SnsInfo snsInfo = o0Var.f280626f;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        return snsInfo;
    }

    /* renamed from: c */
    public static /* synthetic */ C96094f m123122c(C96087o0 o0Var) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        C96094f fVar = o0Var.f280627g;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        return fVar;
    }

    /* renamed from: a */
    public void mo133641a(String str) {
        SnsMethodCalculate.markStartTimeMs("onFooterIdChange", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        setFooter(str);
        SnsMethodCalculate.markEndTimeMs("onFooterIdChange", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    /* renamed from: d */
    public final void mo133642d(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f280625e = context;
        if (this.f280628h == -1) {
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        this.f280633p = C75592q0.m90789s();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f360004c33, this, true);
        this.f280624d.f280643a = (LinearLayout) inflate.findViewById(C0966R.C0970id.k0v);
        this.f280624d.f280654l = (LinearLayout) inflate.findViewById(C0966R.C0970id.l8g);
        this.f280624d.f280646d = (LinearLayout) inflate.findViewById(C0966R.C0970id.f358542fo0);
        this.f280624d.f280646d.setOnTouchListener(this.f280632o);
        this.f280624d.f280647e = (ImageView) inflate.findViewById(C0966R.C0970id.f358448f61);
        this.f280624d.f280648f = (LinearLayout) inflate.findViewById(C0966R.C0970id.bju);
        this.f280624d.f280648f.setOnTouchListener(this.f280632o);
        this.f280624d.f280649g = (LinearLayout) inflate.findViewById(C0966R.C0970id.brx);
        this.f280624d.f280651i = (TextView) inflate.findViewById(C0966R.C0970id.js4);
        this.f280624d.f280652j = (TextView) inflate.findViewById(C0966R.C0970id.js5);
        this.f280624d.f280650h = (TextView) inflate.findViewById(C0966R.C0970id.etl);
        this.f280624d.f280644b = (TextView) inflate.findViewById(C0966R.C0970id.jcp);
        this.f280624d.f280645c = (LinearLayout) inflate.findViewById(C0966R.C0970id.jcq);
        this.f280624d.f280653k = (TextView) inflate.findViewById(C0966R.C0970id.jsv);
        this.f280624d.f280659q = (LinearLayout) inflate.findViewById(C0966R.C0970id.f358455f70);
        this.f280624d.f280655m = (ImageView) inflate.findViewById(C0966R.C0970id.a2o);
        this.f280624d.f280656n = (ImageView) inflate.findViewById(C0966R.C0970id.f358627g51);
        this.f280624d.f280657o = (ImageView) inflate.findViewById(C0966R.C0970id.ckt);
        this.f280624d.f280658p = (LinearLayout) inflate.findViewById(C0966R.C0970id.c0f);
        this.f280624d.f280660r = (TextView) inflate.findViewById(C0966R.C0970id.c0j);
        int i = this.f280628h;
        if (i == 2) {
            this.f280624d.f280654l.setVisibility(8);
            this.f280624d.f280658p.setVisibility(8);
            this.f280624d.f280645c.setVisibility(0);
        } else if (i == 3) {
            this.f280624d.f280654l.setVisibility(8);
            this.f280624d.f280645c.setVisibility(8);
            this.f280624d.f280658p.setVisibility(0);
        } else {
            this.f280624d.f280654l.setVisibility(0);
            this.f280624d.f280645c.setVisibility(8);
            this.f280624d.f280658p.setVisibility(8);
        }
        this.f280624d.f280646d.setOnClickListener(new C96088a());
        this.f280624d.f280648f.setOnClickListener(new C96090b(context));
        this.f280624d.f280649g.setOnClickListener(new C96091c(context));
        this.f280624d.f280644b.setOnClickListener(new C96092d());
        this.f280624d.f280660r.setOnClickListener(new C96093e());
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    /* renamed from: e */
    public void mo133643e() {
        SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        if (this.f280628h == -1) {
            SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        this.f280626f = C94866e1.Yx0().mo139798DN(this.f280629i);
        if (Util.isNullOrNil(this.f280629i) || this.f280626f == null) {
            SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        this.f280624d.f280657o.setVisibility(8);
        if (C94897n1.m120371i(this.f280626f.getLocalPrivate(), this.f280631n)) {
            this.f280624d.f280648f.setVisibility(8);
            this.f280624d.f280646d.setVisibility(8);
        } else if (!this.f280626f.isExtFlag()) {
            this.f280624d.f280659q.setVisibility(0);
            this.f280624d.f280654l.setVisibility(0);
            this.f280624d.f280643a.setVisibility(8);
            this.f280624d.f280649g.setVisibility(8);
            this.f280624d.f280648f.setVisibility(8);
            this.f280624d.f280646d.setVisibility(8);
        } else {
            if (this.f280634q) {
                this.f280624d.f280643a.setVisibility(0);
            }
            this.f280624d.f280649g.setVisibility(0);
            this.f280624d.f280648f.setVisibility(0);
            this.f280624d.f280646d.setVisibility(0);
            this.f280624d.f280654l.setVisibility(0);
        }
        SnsObject e = C94897n1.m120367e(this.f280626f);
        if (e != null) {
            if (this.f280626f.isExtFlag()) {
                int i = e.CommentCount;
                if (i > 0) {
                    TextView textView = this.f280624d.f280652j;
                    textView.setText(i + "");
                    this.f280624d.f280652j.setVisibility(0);
                } else {
                    this.f280624d.f280652j.setVisibility(8);
                }
                int i2 = e.LikeCount;
                if (i2 > 0) {
                    TextView textView2 = this.f280624d.f280651i;
                    textView2.setText(i2 + "");
                    this.f280624d.f280651i.setVisibility(0);
                } else {
                    this.f280624d.f280651i.setVisibility(8);
                }
                this.f280624d.f280649g.setContentDescription(getResources().getString(C0966R.string.jcv, new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
                Log.m105918d("MicroMsg.GalleryFooter", "commentCount " + i + " " + i2);
                this.f280624d.f280650h.setText(this.f280626f.getLikeFlag() == 1 ? getResources().getString(C0966R.string.jcs) : getResources().getString(C0966R.string.jcu));
                this.f280624d.f280647e.setImageResource(C0966R.raw.friendactivity_comment_likeicon_normal);
                SnsReportHelper.f275506m0.mo131361V().f265945p = (long) i;
                SnsReportHelper.f275506m0.mo131361V().f265946q = (long) i2;
            }
            if (this.f280633p.equals(this.f280626f.getUserName()) || !this.f280631n) {
                this.f280624d.f280655m.setVisibility(8);
            } else {
                this.f280624d.f280655m.setVisibility(0);
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f280624d.f280655m, this.f280626f.getUserName());
            }
        }
        if (this.f280626f.getTimeLine() == null) {
            this.f280624d.f280653k.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        String str = this.f280626f.getTimeLine().ContentDesc;
        if (str == null || str.equals("")) {
            this.f280624d.f280653k.setText("");
            this.f280624d.f280653k.setVisibility(8);
        } else {
            TextView textView3 = this.f280624d.f280653k;
            Context context = getContext();
            textView3.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(context, str + " ", this.f280624d.f280653k.getTextSize()));
            this.f280624d.f280653k.setVisibility(0);
            SnsReportHelper.f275506m0.mo131361V().f265937h = 1;
        }
        if (C94897n1.m120371i(this.f280626f.getLocalPrivate(), this.f280631n)) {
            this.f280624d.f280656n.setVisibility(0);
            this.f280624d.f280653k.setVisibility(0);
        } else {
            this.f280624d.f280656n.setVisibility(8);
        }
        if (this.f280631n && this.f280626f.isDieItem()) {
            this.f280624d.f280649g.setVisibility(0);
            this.f280624d.f280653k.setVisibility(0);
            this.f280624d.f280657o.setVisibility(0);
        }
        SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public int getFooterH() {
        SnsMethodCalculate.markStartTimeMs("getFooterH", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        LinearLayout linearLayout = this.f280624d.f280643a;
        if (linearLayout != null) {
            int height = linearLayout.getHeight();
            SnsMethodCalculate.markEndTimeMs("getFooterH", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return height;
        }
        SnsMethodCalculate.markEndTimeMs("getFooterH", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        return 10;
    }

    public void setCallBack(C96094f fVar) {
        SnsMethodCalculate.markStartTimeMs("setCallBack", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f280627g = fVar;
        SnsMethodCalculate.markEndTimeMs("setCallBack", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public void setFooter(String str) {
        SnsMethodCalculate.markStartTimeMs("setFooter", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f280629i = str;
        mo133643e();
        SnsMethodCalculate.markEndTimeMs("setFooter", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public void setSnsSource(int i) {
        SnsMethodCalculate.markStartTimeMs("setSnsSource", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f280630j = i;
        SnsMethodCalculate.markEndTimeMs("setSnsSource", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public void setType(int i) {
        SnsMethodCalculate.markStartTimeMs("setType", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f280628h = i;
        mo133642d(this.f280625e);
        SnsMethodCalculate.markEndTimeMs("setType", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public void setVisibility(int i) {
        SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        int i2 = this.f280628h;
        boolean z = true;
        if (i2 == 2 || i2 == 3) {
            super.setVisibility(i);
            if (i == 8) {
                z = false;
            }
            this.f280634q = z;
            SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        SnsInfo snsInfo = this.f280626f;
        if (snsInfo == null || snsInfo.isExtFlag()) {
            if (i == 8) {
                this.f280624d.f280643a.setVisibility(8);
                this.f280634q = false;
            } else if (i == 0) {
                this.f280624d.f280643a.setVisibility(0);
                this.f280634q = true;
            }
            SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }
}
