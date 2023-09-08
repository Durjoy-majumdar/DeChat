package x21;

import a70.C112760b;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import bh3.C113177k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.plugin.component.editor.widget.voiceview.C93093a;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import hh2.C8532a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import kd0.C99125s;
import ke3.C88144b;
import nc0.C76850a;
import nj3.C76912y0;
import o21.C100273b;
import o21.C100274c;
import o21.C100275d;
import p140cw.C7138g;
import p182kk.C61104a;
import p206nj.C100115c;
import p206nj.C88955f;
import p21.C100616a;
import p21.C100627l;
import p21.C100628m;
import p21.C100631p;
import p375qh.C101196q;
import p447aw.C103918d;
import p492dn.C97498p;
import p492dn.C97500q;
import p492dn.C97501r;
import p492dn.C97502s;
import pb1.C11881t1;
import q21.C100974a;
import qg0.C12215a;
import t21.C101712a;
import t21.C101713b;
import te3.C101834rc0;
import u21.C101941c;
import w21.C102304b;
import w21.C102305c;
import w21.C102312j;
import w21.C102321r;
import w21.C102324u;

/* renamed from: x21.a */
public class C102538a implements C100974a, C101713b {

    /* renamed from: a */
    public C93083b f301910a;

    /* renamed from: b */
    public View f301911b;

    /* renamed from: c */
    public WeImageButton f301912c;

    /* renamed from: d */
    public WeImageButton f301913d;

    /* renamed from: e */
    public WeImageButton f301914e;

    /* renamed from: f */
    public WeImageButton f301915f;

    /* renamed from: g */
    public WeImageButton f301916g;

    /* renamed from: h */
    public WeImageButton f301917h;

    /* renamed from: i */
    public LinearLayout f301918i;

    /* renamed from: j */
    public LinearLayout f301919j;

    /* renamed from: k */
    public LinearLayout f301920k;

    /* renamed from: l */
    public LinearLayout f301921l;

    /* renamed from: m */
    public LinearLayout f301922m;

    /* renamed from: n */
    public LinearLayout f301923n;

    /* renamed from: o */
    public boolean f301924o = false;

    /* renamed from: p */
    public String f301925p = "";

    /* renamed from: q */
    public boolean f301926q = false;

    /* renamed from: r */
    public boolean f301927r = false;

    /* renamed from: s */
    public boolean f301928s = false;

    /* renamed from: t */
    public boolean f301929t = false;

    /* renamed from: u */
    public boolean f301930u;

    /* renamed from: x21.a$a */
    public class C15619a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101712a f42242d;

        public C15619a(C101712a aVar) {
            this.f42242d = aVar;
        }

        public void onClick(View view) {
            Class cls = C103918d.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!WeChatBrands.Business.Entries.SessionLocation.checkAvailable(view.getContext())) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C101941c.m134173q().mo141469z(-1, false, true);
            if (!C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
                boolean z1 = ((C103918d) C86312j.m106911c(cls)).mo125788z1((Activity) C102538a.this.f301911b.getContext(), "android.permission.ACCESS_FINE_LOCATION", 64, (String) null, (String) null);
                Log.m105925i("MicroMsg.EditorFooterPanel", "summerper checkPermission checkLocation[%b]", Boolean.valueOf(z1));
                if (!z1) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            } else if (!((C103918d) C86312j.m106911c(cls)).Lb0((Activity) C102538a.this.f301911b.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                    C12215a.m11778c((Activity) C102538a.this.f301911b.getContext(), C102538a.this.f301911b.getContext().getResources().getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30764, true);
                } else {
                    ((C103918d) C86312j.m106911c(cls)).mo125790zt((Activity) C102538a.this.f301911b.getContext(), "android.permission.ACCESS_FINE_LOCATION", 64);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
            intent.putExtra("map_view_type", 3);
            C88144b.m109795m(C102538a.this.f301911b.getContext(), FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 4098);
            this.f42242d.mo94194q4(4096);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x21.a$b */
    public class C15620b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101712a f42244d;

        /* renamed from: x21.a$b$a */
        public class C15621a implements C113177k.C113181e {

            /* renamed from: a */
            public final /* synthetic */ Intent f42246a;

            public C15621a(Intent intent) {
                this.f42246a = intent;
            }

            public void onOp(Boolean bool) {
                if (bool.booleanValue()) {
                    C88144b.m109802t(C102538a.this.f301911b.getContext(), "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", this.f42246a, 4099);
                }
            }
        }

        public C15620b(C101712a aVar) {
            this.f42244d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101941c.m134173q().mo141469z(-1, false, true);
            if (!C88955f.m111058b()) {
                C76912y0.m92771j(C102538a.this.f301911b.getContext(), (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("key_title", C102538a.this.f301911b.getContext().getString(C0966R.string.cpu));
            intent.putExtra("key_media_type", 2);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
            if (((C113177k) C86312j.m106911c(C113177k.class)).mo165704UG(C113177k.C113179b.STORAGE, new C15621a(intent))) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C88144b.m109802t(C102538a.this.f301911b.getContext(), "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent, 4099);
            this.f42244d.mo94194q4(65536);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x21.a$e */
    public class C15622e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101712a f42248d;

        public C15622e(C101712a aVar) {
            this.f42248d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.EditorFooterPanel", "go to GalleryEntryUI");
            C101941c.m134173q().mo141469z(-1, false, true);
            Intent intent = new Intent();
            intent.putExtra("max_select_count", 9);
            intent.putExtra("query_source_type", 13);
            intent.putExtra("query_media_type", 3);
            intent.putExtra("show_header_view", false);
            intent.putExtra("record_video_force_sys_camera", false);
            intent.putExtra("record_video_is_sight_capture", true);
            intent.putExtra("show_header_view", true);
            intent.addFlags(67108864);
            intent.putExtra("key_can_select_video_and_pic", true);
            C88144b.m109795m(C102538a.this.f301911b.getContext(), "gallery", ".ui.GalleryEntryUI", intent, 4096);
            this.f42248d.mo94194q4(16);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x21.a$f */
    public class C15623f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101712a f42250d;

        public C15623f(C101712a aVar) {
            this.f42250d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RecordConfigProvider recordConfigProvider = new RecordConfigProvider();
            Boolean bool = Boolean.TRUE;
            recordConfigProvider.f272931s = bool;
            recordConfigProvider.f272933u = bool;
            recordConfigProvider.f272934v = Boolean.FALSE;
            recordConfigProvider.f272905F = 4;
            UICustomParam uICustomParam = new UICustomParam();
            ((HashMap) uICustomParam.f266575h).put("plugin_filter", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
            recordConfigProvider.f272927o = uICustomParam;
            C102538a aVar = C102538a.this;
            if (aVar.f301930u) {
                C8532a.f27585a.mo9445d(aVar.f301911b.getContext(), 4100, C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2493eh, recordConfigProvider, 0);
            } else {
                Intent intent = new Intent();
                C102538a.this.getClass();
                SightParams sightParams = (SightParams) intent.getParcelableExtra("KEY_SIGHT_PARAMS");
                if (sightParams == null) {
                    sightParams = new SightParams(4, 0);
                }
                String str = "micromsg_" + System.currentTimeMillis();
                String str2 = C112760b.m154240l() + str + ".mp4";
                String str3 = C112760b.m154240l() + str + ".jpeg";
                int intExtra = intent.getIntExtra("key_pick_local_media_duration", 60);
                SightParams sightParams2 = new SightParams(4, 1);
                sightParams2.f248451e = 2;
                sightParams2.f248450d = 0;
                if (sightParams2.f248452f == null) {
                    sightParams2.f248452f = new VideoTransPara();
                }
                sightParams2.f248452f.f267170h = intExtra;
                sightParams2.mo118479a(str, str2, str3, AndroidMediaUtil.getSysCameraDirPath() + String.format("%s%d.%s", new Object[]{"capture", Long.valueOf(System.currentTimeMillis()), "jpg"}));
                intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
                ((C7138g) C86312j.m106911c(C7138g.class)).mo8314Vt(C102538a.this.f301911b.getContext(), 4101, intent, 4, 1);
            }
            this.f42250d.mo94194q4(256);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x21.a$c */
    public class C102539c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f301931d;

        public C102539c(int i) {
            this.f301931d = i;
        }

        public void run() {
            ImageButton imageButton = (ImageButton) C102538a.this.f301911b.findViewById(C0966R.C0970id.ly5);
            View findViewById = C102538a.this.f301911b.findViewById(C0966R.C0970id.er6);
            int i = this.f301931d;
            if (i == 0) {
                C102538a.this.f301918i.setVisibility(8);
                C102538a aVar = C102538a.this;
                if (!aVar.f301924o) {
                    View view = aVar.f301911b;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                View view3 = aVar.f301911b;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i == 1) {
                imageButton.setImageResource(C0966R.raw.editor_style_unpress);
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = C102538a.this.f301911b;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C102538a.this.f301918i.setVisibility(8);
            } else if (i == 2) {
                View view6 = C102538a.this.f301911b;
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar6.mo10233c(0);
                C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C102538a.this.f301918i.setVisibility(8);
            } else if (i == 3) {
                imageButton.setImageResource(C0966R.raw.editor_style_press);
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar7.mo10233c(0);
                View view7 = findViewById;
                C117292a.m165358d(view7, aVar7.mo10232b(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view8 = C102538a.this.f301911b;
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(0);
                C117292a.m165358d(view8, aVar8.mo10232b(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C102538a.this.f301918i.setVisibility(0);
            }
        }
    }

    /* renamed from: x21.a$d */
    public class C102540d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101712a f301933d;

        public C102540d(C101712a aVar) {
            this.f301933d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102538a aVar = C102538a.this;
            View view2 = aVar.f301911b;
            char c = (view2 == null || view2.getVisibility() == 8) ? 0 : aVar.f301918i.getVisibility() == 0 ? (char) 3 : 1;
            if (c == 1) {
                ((EditorUI) this.f301933d).mo127491Z7(false, 0);
                C102538a.this.mo142158c(3, 100);
            } else if (c == 3) {
                ((EditorUI) this.f301933d).mo127491Z7(true, 50);
                C102538a.this.mo142158c(1, 0);
            } else if (c == 2) {
                C102538a.this.mo142158c(3, 0);
            }
            this.f301933d.mo94194q4(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x21.a$g */
    public class C102541g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101712a f301935d;

        /* renamed from: e */
        public final /* synthetic */ C93083b f301936e;

        public C102541g(C101712a aVar, C93083b bVar) {
            this.f301935d = aVar;
            this.f301936e = bVar;
        }

        public void onClick(View view) {
            C101834rc0 rc02;
            Object obj;
            long j;
            String str;
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102538a aVar = C102538a.this;
            View view2 = aVar.f301911b;
            char c = 0;
            if (((view2 == null || view2.getVisibility() == 8) ? 0 : aVar.f301918i.getVisibility() == 0 ? (char) 3 : 1) == 3) {
                ((EditorUI) this.f301935d).mo127491Z7(true, 50);
                C102538a.this.mo142158c(1, 0);
            }
            C101941c.m134173q().mo141469z(-1, false, true);
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) C102538a.this.f301911b.getContext(), "android.permission.RECORD_AUDIO", 80, (String) null, (String) null);
            Log.m105925i("MicroMsg.EditorFooterPanel", "summerper checkPermission checkMicrophone[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
            if (!z1) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!C102538a.this.f301924o) {
                if (!C88955f.m111058b()) {
                    C76912y0.m92771j(C102538a.this.f301911b.getContext(), (View) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (C61104a.m71669y(C102538a.this.f301911b.getContext()) || C61104a.m71665u(C102538a.this.f301911b.getContext()) || C61104a.m71649e(C102538a.this.f301911b.getContext())) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            C102538a aVar2 = C102538a.this;
            if (aVar2.f301924o) {
                aVar2.mo142159d(this.f301935d);
            } else if (C101941c.m134173q().mo141450f(0, 1)) {
                ((EditorUI) this.f301935d).mo127486U7();
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                C102538a.this.f301916g.setImageResource(C0966R.raw.editor_voiceplayer_record_icon);
                if (C93093a.m117459b().mo127596c()) {
                    C93093a.m117459b().mo127598e();
                }
                C102538a.this.f301924o = true;
                C100631p pVar = new C100631p();
                pVar.f294811p = 4;
                pVar.f294812q = false;
                pVar.f294830w = Boolean.TRUE;
                C102538a.this.f301911b.getContext().getString(C0966R.string.csg);
                C102538a.this.f301925p = "speex";
                pVar.f294825u = 1;
                pVar.f294807l = C101941c.m134173q().mo141455k();
                pVar.f294823s = C102538a.this.f301925p;
                pVar.f294795a = C100273b.m131073a(pVar.toString(), 18);
                C101834rc0 rc03 = new C101834rc0();
                rc03.mo141257m(pVar.f294795a);
                rc03.mo141261q(pVar.f294823s);
                if (this.f301936e != null) {
                    rc02 = rc03;
                    obj = "speex";
                    C101941c.m134173q().mo141461r(pVar, this.f301936e.mo127569c(), true, true, false, false, false);
                } else {
                    rc02 = rc03;
                    obj = "speex";
                    C101941c.m134173q().mo141461r(pVar, (WXRTEditText) null, true, true, false, false, false);
                }
                C100275d a = C100275d.m131079a();
                C102538a.this.f301911b.getContext();
                C102538a aVar3 = C102538a.this;
                String c2 = C100273b.m131075c(rc02);
                a.f293779m = pVar;
                Util.getInt(pVar.f294807l.substring(7), 0);
                String str2 = pVar.f294823s;
                if (!a.f293767a) {
                    a.f293767a = true;
                    a.f293778l = aVar3;
                    a.f293776j = str2;
                    a.f293777k = c2;
                    C100115c cVar = a.f293773g;
                    if (cVar != null) {
                        cVar.mo139415b();
                    }
                    a.f293770d = false;
                    if (Util.isNullOrNil(a.f293777k)) {
                        C86009m1 m1Var = new C86009m1(C11881t1.m11563a(true), "wenote/voice/data");
                        if (!m1Var.mo119967g()) {
                            m1Var.mo119987x();
                        }
                        String i = m1Var.mo119971i();
                        Uri n = C116299g2.m163858n(i);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        C116281f0 f0Var = C116281f0.C116289i.f348994a;
                        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                            if (l2.mo177810a()) {
                                l2.f348991a.mo119937g(l2.f348992b);
                            }
                        }
                        do {
                            str = i + "/" + System.currentTimeMillis();
                            Uri n2 = C116299g2.m163858n(str);
                            String path2 = n2.getPath();
                            if (path2 != null) {
                                String k2 = C116299g2.m163855k(path2, false, false);
                                if (!n2.getPath().equals(k2)) {
                                    n2 = n2.buildUpon().path(k2).build();
                                }
                            }
                            C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                            if (!l3.mo177810a()) {
                                z = false;
                                continue;
                            } else {
                                z = l3.f348991a.mo119948x(l3.f348992b);
                                continue;
                            }
                        } while (z);
                        a.f293777k = str;
                    }
                    if ((Util.isNullOrNil(str2) ? "amr" : str2).equals(obj)) {
                        C97501r Je = ((C97502s) C86312j.m106911c(C97502s.class)).mo126429Je();
                        a.f293775i = Je;
                        Je.getClass();
                    } else {
                        C97498p Aq = ((C97500q) C86312j.m106911c(C97500q.class)).mo126428Aq();
                        a.f293774h = Aq;
                        ((C101196q) Aq).f296208d = new C100274c(a);
                    }
                    a.f293771e = -1;
                    if ((str2.equals(obj) ? Boolean.valueOf(((C99125s) a.f293775i).startRecord(a.f293777k)) : Boolean.valueOf(((C101196q) a.f293774h).mo140641a(a.f293777k, 3600010))).booleanValue()) {
                        a.f293768b = Util.currentTicks();
                        a.f293782p.startTimer(200);
                        j = 0;
                    } else {
                        j = 0;
                        a.f293768b = 0;
                    }
                    if (a.f293768b == j) {
                        c = 65535;
                    } else {
                        a.f293781o.sendEmptyMessage(4096);
                    }
                }
                if (c < 0) {
                    ((EditorUI) this.f301935d).mo127487V7();
                    C102538a.this.mo142159d(this.f301935d);
                }
            }
            this.f301935d.mo94194q4(1048576);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x21.a$h */
    public class C102542h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101712a f301938d;

        public C102542h(C101712a aVar) {
            this.f301938d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102538a.this.f301922m.setPressed(false);
            C102538a.this.f301920k.setPressed(false);
            C102538a aVar = C102538a.this;
            if (aVar.f301927r || aVar.f301928s) {
                aVar.f301926q = false;
            }
            C102305c cVar = C102324u.f301364c;
            Boolean valueOf = Boolean.valueOf(!aVar.f301926q);
            C93083b bVar = aVar.f301910a;
            if (bVar != null) {
                bVar.mo127570d(cVar, valueOf);
            }
            C102538a aVar2 = C102538a.this;
            boolean z = !aVar2.f301926q;
            aVar2.f301926q = z;
            C102538a.m135382a(aVar2, view, z);
            C102538a.m135383b(C102538a.this, this.f301938d);
            C102538a aVar3 = C102538a.this;
            aVar3.f301927r = false;
            aVar3.f301928s = false;
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x21.a$i */
    public class C102543i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101712a f301940d;

        public C102543i(C101712a aVar) {
            this.f301940d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102538a.this.f301919j.setPressed(false);
            C102538a.this.f301922m.setPressed(false);
            C102538a aVar = C102538a.this;
            if (aVar.f301926q || aVar.f301928s) {
                aVar.f301927r = false;
            }
            C102312j jVar = C102324u.f301365d;
            Boolean valueOf = Boolean.valueOf(!aVar.f301927r);
            C93083b bVar = aVar.f301910a;
            if (bVar != null) {
                bVar.mo127570d(jVar, valueOf);
            }
            C102538a aVar2 = C102538a.this;
            boolean z = !aVar2.f301927r;
            aVar2.f301927r = z;
            C102538a.m135382a(aVar2, view, z);
            C102538a.m135383b(C102538a.this, this.f301940d);
            C102538a aVar3 = C102538a.this;
            aVar3.f301926q = false;
            aVar3.f301928s = false;
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x21.a$j */
    public class C102544j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C93083b f301942d;

        /* renamed from: e */
        public final /* synthetic */ C101712a f301943e;

        public C102544j(C93083b bVar, C101712a aVar) {
            this.f301942d = bVar;
            this.f301943e = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100627l lVar = new C100627l();
            if (this.f301942d != null) {
                C101941c.m134173q().mo141461r(lVar, this.f301942d.mo127569c(), true, true, false, false, true);
            } else {
                C101941c.m134173q().mo141461r(lVar, (WXRTEditText) null, true, true, false, false, true);
            }
            C102538a.m135383b(C102538a.this, this.f301943e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x21.a$k */
    public class C102545k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101712a f301945d;

        public C102545k(C101712a aVar) {
            this.f301945d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102538a.this.f301919j.setPressed(false);
            C102538a.this.f301920k.setPressed(false);
            C102538a aVar = C102538a.this;
            if (aVar.f301927r || aVar.f301926q) {
                aVar.f301928s = false;
            }
            C102321r rVar = C102324u.f301363b;
            Boolean valueOf = Boolean.valueOf(!aVar.f301928s);
            C93083b bVar = aVar.f301910a;
            if (bVar != null) {
                bVar.mo127570d(rVar, valueOf);
            }
            C102538a aVar2 = C102538a.this;
            boolean z = !aVar2.f301928s;
            aVar2.f301928s = z;
            C102538a.m135382a(aVar2, view, z);
            C102538a.m135383b(C102538a.this, this.f301945d);
            C102538a aVar3 = C102538a.this;
            aVar3.f301927r = false;
            aVar3.f301926q = false;
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x21.a$l */
    public class C102546l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101712a f301947d;

        public C102546l(C101712a aVar) {
            this.f301947d = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102538a aVar = C102538a.this;
            C102304b bVar = C102324u.f301362a;
            Boolean valueOf = Boolean.valueOf(!aVar.f301929t);
            C93083b bVar2 = aVar.f301910a;
            if (bVar2 != null) {
                bVar2.mo127570d(bVar, valueOf);
            }
            C102538a aVar2 = C102538a.this;
            boolean z = !aVar2.f301929t;
            aVar2.f301929t = z;
            C102538a.m135382a(aVar2, view, z);
            C102538a.m135383b(C102538a.this, this.f301947d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C102538a(C93083b bVar, View view, C101712a aVar, long j) {
        int i = 0;
        this.f301910a = bVar;
        this.f301911b = view;
        bVar.f268167c = this;
        this.f301912c = (WeImageButton) view.findViewById(C0966R.C0970id.ly5);
        this.f301914e = (WeImageButton) view.findViewById(C0966R.C0970id.lx4);
        this.f301913d = (WeImageButton) view.findViewById(C0966R.C0970id.lxs);
        this.f301917h = (WeImageButton) view.findViewById(C0966R.C0970id.f357901lx3);
        this.f301915f = (WeImageButton) view.findViewById(C0966R.C0970id.f357900lx2);
        this.f301916g = (WeImageButton) view.findViewById(C0966R.C0970id.ly4);
        this.f301912c.setVisibility((1 & j) == 0 ? 8 : 0);
        this.f301914e.setVisibility((16 & j) == 0 ? 8 : 0);
        this.f301913d.setVisibility((4096 & j) == 0 ? 8 : 0);
        this.f301917h.setVisibility((65536 & j) == 0 ? 8 : 0);
        this.f301915f.setVisibility((256 & j) == 0 ? 8 : 0);
        this.f301916g.setVisibility((1048576 & j) == 0 ? 8 : 0);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.ly7);
        this.f301918i = linearLayout;
        linearLayout.setVisibility(8);
        this.f301919j = (LinearLayout) this.f301918i.findViewById(C0966R.C0970id.lrg);
        this.f301920k = (LinearLayout) this.f301918i.findViewById(C0966R.C0970id.lre);
        this.f301921l = (LinearLayout) this.f301918i.findViewById(C0966R.C0970id.lrf);
        this.f301922m = (LinearLayout) this.f301918i.findViewById(C0966R.C0970id.gz8);
        this.f301923n = (LinearLayout) this.f301918i.findViewById(C0966R.C0970id.lr_);
        this.f301919j.setVisibility((16777216 & j) == 0 ? 8 : 0);
        this.f301920k.setVisibility((268435456 & j) == 0 ? 8 : 0);
        this.f301921l.setVisibility((4294967296L & j) == 0 ? 8 : 0);
        this.f301922m.setVisibility((68719476736L & j) == 0 ? 8 : 0);
        this.f301923n.setVisibility((j & 1099511627776L) == 0 ? 8 : i);
        this.f301912c.setOnClickListener(new C102540d(aVar));
        this.f301914e.setOnClickListener(new C15622e(aVar));
        this.f301930u = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_jump_to_record_media, true);
        this.f301915f.setOnClickListener(new C15623f(aVar));
        this.f301916g.setOnClickListener(new C102541g(aVar, bVar));
        this.f301919j.setOnClickListener(new C102542h(aVar));
        this.f301920k.setOnClickListener(new C102543i(aVar));
        this.f301921l.setOnClickListener(new C102544j(bVar, aVar));
        this.f301922m.setOnClickListener(new C102545k(aVar));
        this.f301923n.setOnClickListener(new C102546l(aVar));
        this.f301913d.setOnClickListener(new C15619a(aVar));
        this.f301917h.setOnClickListener(new C15620b(aVar));
    }

    /* renamed from: a */
    public static void m135382a(C102538a aVar, View view, boolean z) {
        aVar.getClass();
        view.postDelayed(new C102549d(aVar, view, z), 100);
    }

    /* renamed from: b */
    public static void m135383b(C102538a aVar, C101712a aVar2) {
        aVar.getClass();
        ((EditorUI) aVar2).mo127491Z7(true, 50);
        aVar.mo142158c(1, 0);
    }

    /* renamed from: c */
    public void mo142158c(int i, long j) {
        this.f301911b.postDelayed(new C102539c(i), j);
    }

    /* renamed from: d */
    public void mo142159d(C101712a aVar) {
        int i;
        this.f301916g.setImageResource(C0966R.C0969drawable.f4932rn);
        if (this.f301924o) {
            this.f301924o = false;
            C100275d a = C100275d.m131079a();
            if (a.f293767a && !a.f293770d) {
                a.mo139542b();
            }
            C100275d a2 = C100275d.m131079a();
            String str = C86013q1.m106450k(a2.f293777k) ? a2.f293777k : "";
            int i2 = (int) C100275d.m131079a().f293769c;
            int j = (int) C93088r.m117440j((long) i2);
            C101941c q = C101941c.m134173q();
            synchronized (q) {
                if (q.f300117a != null) {
                    i = 0;
                    while (true) {
                        if (i < q.f300117a.size()) {
                            if (q.f300117a.get(i).mo140076b() == 4 && ((C100631p) q.f300117a.get(i)).f294830w.booleanValue()) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
                i = -1;
            }
            C100616a l = C101941c.m134173q().mo141456l(i);
            if (!C86013q1.m106450k(str)) {
                Log.m105920e("MicroMsg.EditorFooterPanel", "voicePath not exist, remove data from data list and ui.");
                C101941c.m134173q().mo141466w(i, false);
                if (aVar != null) {
                    aVar.mo94186d5(i);
                }
                C100628m mVar = new C100628m();
                mVar.f294819s = "";
                mVar.f294796b = true;
                mVar.f294801g = false;
                C101941c.m134173q().mo141445a(i, mVar, true);
                C101941c.m134173q().mo141448d(i - 1, i + 1, true);
            } else if (i != -1 && l != null && l.mo140076b() == 4) {
                C100631p pVar = (C100631p) l;
                pVar.f294830w = Boolean.FALSE;
                pVar.f294811p = 4;
                pVar.f294812q = true;
                ((String) C93088r.m117443m(MMApplicationContext.getContext(), j)).getClass();
                pVar.f294813r = str;
                pVar.f294826v = i2;
                C101712a aVar2 = C101941c.m134173q().f300118b;
                if (aVar2 != null) {
                    aVar2.mo94191h2(i, 0);
                }
            }
        }
    }
}
