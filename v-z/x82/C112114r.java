package x82;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import c92.C104328f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.MultiTalkSmallControlIconLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;
import x82.C112075a;
import zt3.C119157j;

/* renamed from: x82.r */
public final class C112114r {

    /* renamed from: a */
    public Context f335672a;

    /* renamed from: b */
    public C112075a f335673b;

    /* renamed from: c */
    public C112095g f335674c;

    /* renamed from: d */
    public View f335675d;

    /* renamed from: e */
    public MultiTalkSmallControlIconLayout f335676e;

    /* renamed from: f */
    public WeImageView f335677f;

    /* renamed from: g */
    public MultiTalkSmallControlIconLayout f335678g;

    /* renamed from: h */
    public MultiTalkSmallControlIconLayout f335679h;

    /* renamed from: i */
    public Toast f335680i;

    /* renamed from: j */
    public boolean f335681j;

    /* renamed from: k */
    public boolean f335682k;

    /* renamed from: l */
    public WeImageView f335683l;

    /* renamed from: m */
    public boolean f335684m;

    /* renamed from: x82.r$a */
    public static final class C112115a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112114r f335685d;

        public C112115a(C112114r rVar) {
            this.f335685d = rVar;
        }

        public final void onClick(View view) {
            WeImageView weImageView;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112114r rVar = this.f335685d;
            if (!rVar.f335684m) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout = rVar.f335676e;
            if (multiTalkSmallControlIconLayout != null) {
                multiTalkSmallControlIconLayout.setChecked(false);
            }
            MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout2 = this.f335685d.f335676e;
            if (multiTalkSmallControlIconLayout2 != null) {
                multiTalkSmallControlIconLayout2.setVisibility(0);
            }
            C112075a.C112076a.m152803a(this.f335685d.f335673b, C112075a.C112077b.HIDE_DOODLE_LAYOUT, (Bundle) null, 2, (Object) null);
            MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout3 = this.f335685d.f335678g;
            if (multiTalkSmallControlIconLayout3 != null) {
                multiTalkSmallControlIconLayout3.setVisibility(0);
            }
            MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout4 = this.f335685d.f335679h;
            if (multiTalkSmallControlIconLayout4 != null) {
                multiTalkSmallControlIconLayout4.setVisibility(0);
            }
            C112114r rVar2 = this.f335685d;
            if (rVar2.f335681j && (weImageView = rVar2.f335683l) != null) {
                weImageView.setVisibility(0);
            }
            WeImageView weImageView2 = this.f335685d.f335677f;
            if (weImageView2 != null) {
                weImageView2.setVisibility(8);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x82.r$b */
    public static final class C112116b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112114r f335686d;

        public C112116b(C112114r rVar) {
            this.f335686d = rVar;
        }

        public final void onClick(View view) {
            WeImageView weImageView;
            WeImageView weImageView2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112114r rVar = this.f335686d;
            if (!rVar.f335684m) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout = rVar.f335676e;
            if (multiTalkSmallControlIconLayout != null) {
                Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickDoodle");
                C115669n.INSTANCE.mo175913w(1538, 6, 1);
                if (!multiTalkSmallControlIconLayout.f201579j) {
                    C112075a.C112076a.m152803a(rVar.f335673b, C112075a.C112077b.SHOW_DOODLE_LAYOUT, (Bundle) null, 2, (Object) null);
                    multiTalkSmallControlIconLayout.setChecked(true);
                    MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout2 = rVar.f335678g;
                    if (multiTalkSmallControlIconLayout2 != null) {
                        multiTalkSmallControlIconLayout2.setVisibility(8);
                    }
                    MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout3 = rVar.f335679h;
                    if (multiTalkSmallControlIconLayout3 != null) {
                        multiTalkSmallControlIconLayout3.setVisibility(8);
                    }
                    if (rVar.f335681j && (weImageView2 = rVar.f335683l) != null) {
                        weImageView2.setVisibility(8);
                    }
                    MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout4 = rVar.f335676e;
                    if (multiTalkSmallControlIconLayout4 != null) {
                        multiTalkSmallControlIconLayout4.setVisibility(8);
                    }
                    WeImageView weImageView3 = rVar.f335677f;
                    if (weImageView3 != null) {
                        weImageView3.setVisibility(0);
                    }
                } else {
                    C112075a.C112076a.m152803a(rVar.f335673b, C112075a.C112077b.HIDE_DOODLE_LAYOUT, (Bundle) null, 2, (Object) null);
                    multiTalkSmallControlIconLayout.setChecked(false);
                    MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout5 = rVar.f335678g;
                    if (multiTalkSmallControlIconLayout5 != null) {
                        multiTalkSmallControlIconLayout5.setVisibility(0);
                    }
                    MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout6 = rVar.f335679h;
                    if (multiTalkSmallControlIconLayout6 != null) {
                        multiTalkSmallControlIconLayout6.setVisibility(0);
                    }
                    if (rVar.f335681j && (weImageView = rVar.f335683l) != null) {
                        weImageView.setVisibility(0);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x82.r$c */
    public static final class C112117c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112114r f335687d;

        /* renamed from: x82.r$c$a */
        public static final class C112118a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MultiTalkSmallControlIconLayout f335688d;

            public C112118a(MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout) {
                this.f335688d = multiTalkSmallControlIconLayout;
            }

            public final void run() {
                C105851w0.zx0().mo150641R(this.f335688d.f201579j);
            }
        }

        public C112117c(C112114r rVar) {
            this.f335687d = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112114r rVar = this.f335687d;
            if (!rVar.f335684m) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout = rVar.f335678g;
            if (multiTalkSmallControlIconLayout != null) {
                Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickMute");
                C115669n.INSTANCE.mo175913w(1538, 7, 1);
                C104328f.f308805a.mo146025b(5, 1);
                if (!multiTalkSmallControlIconLayout.f201579j) {
                    Context context = rVar.f335672a;
                    rVar.mo163851b(context, context.getResources().getString(C0966R.string.if8));
                    MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout2 = rVar.f335678g;
                    if (multiTalkSmallControlIconLayout2 != null) {
                        multiTalkSmallControlIconLayout2.setContentDescription(MMApplicationContext.getString(C0966R.string.gzu));
                    }
                    multiTalkSmallControlIconLayout.setChecked(true);
                } else {
                    Context context2 = rVar.f335672a;
                    rVar.mo163851b(context2, context2.getResources().getString(C0966R.string.if7));
                    MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout3 = rVar.f335678g;
                    if (multiTalkSmallControlIconLayout3 != null) {
                        multiTalkSmallControlIconLayout3.setContentDescription(MMApplicationContext.getString(C0966R.string.gzv));
                    }
                    multiTalkSmallControlIconLayout.setChecked(false);
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C112118a(multiTalkSmallControlIconLayout));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x82.r$d */
    public static final class C112119d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112114r f335689d;

        /* renamed from: x82.r$d$a */
        public static final class C112120a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MultiTalkSmallControlIconLayout f335690d;

            public C112120a(MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout) {
                this.f335690d = multiTalkSmallControlIconLayout;
            }

            public final void run() {
                C105851w0.zx0().mo150642S(this.f335690d.f201579j);
            }
        }

        public C112119d(C112114r rVar) {
            this.f335689d = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112114r rVar = this.f335689d;
            if (!rVar.f335684m) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout = rVar.f335679h;
            if (multiTalkSmallControlIconLayout != null) {
                Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickSpeakerOn");
                C115669n.INSTANCE.mo175913w(1538, 8, 1);
                C104328f.f308805a.mo146025b(6, 1);
                if (multiTalkSmallControlIconLayout.isEnabled()) {
                    if (!multiTalkSmallControlIconLayout.f201579j) {
                        Context context = rVar.f335672a;
                        rVar.mo163851b(context, context.getResources().getString(C0966R.string.ifv));
                        MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout2 = rVar.f335679h;
                        if (multiTalkSmallControlIconLayout2 != null) {
                            multiTalkSmallControlIconLayout2.setContentDescription(MMApplicationContext.getString(C0966R.string.f361062h00));
                        }
                        multiTalkSmallControlIconLayout.setChecked(true);
                    } else {
                        Context context2 = rVar.f335672a;
                        rVar.mo163851b(context2, context2.getResources().getString(C0966R.string.ifu));
                        MultiTalkSmallControlIconLayout multiTalkSmallControlIconLayout3 = rVar.f335679h;
                        if (multiTalkSmallControlIconLayout3 != null) {
                            multiTalkSmallControlIconLayout3.setContentDescription(MMApplicationContext.getString(C0966R.string.gzz));
                        }
                        multiTalkSmallControlIconLayout.setChecked(false);
                    }
                    ((C119157j) C119157j.f356862d).mo183875f(new C112120a(multiTalkSmallControlIconLayout));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x82.r$e */
    public static final class C112121e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112114r f335691d;

        public C112121e(C112114r rVar) {
            this.f335691d = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112114r rVar = this.f335691d;
            if (!rVar.f335684m) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Context context = rVar.f335672a;
            rVar.getClass();
            C77407n nVar = new C77407n(context, 1, false);
            nVar.f225771i = new C112122s(rVar);
            nVar.mo107570o(true);
            nVar.f225782p = new C112123t(rVar);
            nVar.mo107559d(false);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI$applyClickEvent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C112114r(Context context, C112075a aVar, C112095g gVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "statusManager");
        this.f335672a = context;
        this.f335673b = aVar;
        this.f335674c = gVar;
        boolean z = false;
        this.f335681j = gVar != null ? gVar.f335602a.contains(3) : false;
        C112095g gVar2 = this.f335674c;
        this.f335682k = gVar2 != null ? gVar2.f335602a.contains(1) : z;
        C112095g gVar3 = this.f335674c;
        if (gVar3 != null) {
            gVar3.f335602a.contains(2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163850a() {
        /*
            r7 = this;
            boolean r0 = r7.f335682k
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0086
            android.view.View r0 = r7.f335675d
            if (r0 == 0) goto L_0x0014
            r3 = 2131299715(0x7f090d83, float:1.821744E38)
            android.view.View r0 = r0.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            goto L_0x0015
        L_0x0014:
            r0 = r2
        L_0x0015:
            r7.f335677f = r0
            r3 = -1
            if (r0 == 0) goto L_0x0026
            android.content.Context r4 = r7.f335672a
            r5 = 2131755990(0x7f1003d6, float:1.9142875E38)
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r5, r3)
            r0.setImageDrawable(r4)
        L_0x0026:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r7.f335677f
            if (r0 == 0) goto L_0x002d
            r0.setIconColor(r3)
        L_0x002d:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r7.f335677f
            if (r0 == 0) goto L_0x0039
            x82.r$a r3 = new x82.r$a
            r3.<init>(r7)
            r0.setOnClickListener(r3)
        L_0x0039:
            android.view.View r0 = r7.f335675d
            if (r0 == 0) goto L_0x0047
            r3 = 2131301134(0x7f09130e, float:1.8220317E38)
            android.view.View r0 = r0.findViewById(r3)
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.MultiTalkSmallControlIconLayout) r0
            goto L_0x0048
        L_0x0047:
            r0 = r2
        L_0x0048:
            r7.f335676e = r0
            x82.a r0 = r7.f335673b
            boolean r0 = r0.mo163773d()
            if (r0 == 0) goto L_0x0065
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335676e
            if (r0 != 0) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            r3 = 8
            r0.setVisibility(r3)
        L_0x005c:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r7.f335677f
            if (r0 != 0) goto L_0x0061
            goto L_0x006d
        L_0x0061:
            r0.setVisibility(r1)
            goto L_0x006d
        L_0x0065:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335676e
            if (r0 != 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            r0.setVisibility(r1)
        L_0x006d:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335676e
            if (r0 == 0) goto L_0x007a
            x82.a r3 = r7.f335673b
            boolean r3 = r3.mo163773d()
            r0.setChecked(r3)
        L_0x007a:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335676e
            if (r0 == 0) goto L_0x0086
            x82.r$b r3 = new x82.r$b
            r3.<init>(r7)
            r0.setOnClickListener(r3)
        L_0x0086:
            android.view.View r0 = r7.f335675d
            if (r0 == 0) goto L_0x0094
            r3 = 2131309223(0x7f0932a7, float:1.8236724E38)
            android.view.View r0 = r0.findViewById(r3)
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.MultiTalkSmallControlIconLayout) r0
            goto L_0x0095
        L_0x0094:
            r0 = r2
        L_0x0095:
            r7.f335678g = r0
            if (r0 == 0) goto L_0x00a2
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r3 = r3.f314493e
            r0.setChecked(r3)
        L_0x00a2:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335678g
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.f201579j
            if (r0 == 0) goto L_0x00bb
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335678g
            if (r0 != 0) goto L_0x00b0
            goto L_0x00ca
        L_0x00b0:
            r3 = 2131833207(0x7f113177, float:1.929949E38)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r3)
            r0.setContentDescription(r3)
            goto L_0x00ca
        L_0x00bb:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335678g
            if (r0 != 0) goto L_0x00c0
            goto L_0x00ca
        L_0x00c0:
            r3 = 2131833208(0x7f113178, float:1.9299492E38)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r3)
            r0.setContentDescription(r3)
        L_0x00ca:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335678g
            r3 = 4
            if (r0 != 0) goto L_0x00d0
            goto L_0x00de
        L_0x00d0:
            x82.a r4 = r7.f335673b
            boolean r4 = r4.mo163773d()
            if (r4 == 0) goto L_0x00da
            r4 = 4
            goto L_0x00db
        L_0x00da:
            r4 = 0
        L_0x00db:
            r0.setVisibility(r4)
        L_0x00de:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335678g
            if (r0 == 0) goto L_0x00ea
            x82.r$c r4 = new x82.r$c
            r4.<init>(r7)
            r0.setOnClickListener(r4)
        L_0x00ea:
            android.view.View r0 = r7.f335675d
            if (r0 == 0) goto L_0x00f8
            r4 = 2131314226(0x7f094632, float:1.8246871E38)
            android.view.View r0 = r0.findViewById(r4)
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = (com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.MultiTalkSmallControlIconLayout) r0
            goto L_0x00f9
        L_0x00f8:
            r0 = r2
        L_0x00f9:
            r7.f335679h = r0
            if (r0 == 0) goto L_0x0106
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r4 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r4 = r4.f314494f
            r0.setChecked(r4)
        L_0x0106:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335679h
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.f201579j
            if (r0 == 0) goto L_0x011f
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335679h
            if (r0 != 0) goto L_0x0114
            goto L_0x012e
        L_0x0114:
            r4 = 2131833212(0x7f11317c, float:1.92995E38)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r4)
            r0.setContentDescription(r4)
            goto L_0x012e
        L_0x011f:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335679h
            if (r0 != 0) goto L_0x0124
            goto L_0x012e
        L_0x0124:
            r4 = 2131833213(0x7f11317d, float:1.9299502E38)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r4)
            r0.setContentDescription(r4)
        L_0x012e:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335679h
            if (r0 == 0) goto L_0x013a
            x82.r$d r4 = new x82.r$d
            r4.<init>(r7)
            r0.setOnClickListener(r4)
        L_0x013a:
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout r0 = r7.f335679h
            if (r0 != 0) goto L_0x013f
            goto L_0x014d
        L_0x013f:
            x82.a r4 = r7.f335673b
            boolean r4 = r4.mo163773d()
            if (r4 == 0) goto L_0x0149
            r4 = 4
            goto L_0x014a
        L_0x0149:
            r4 = 0
        L_0x014a:
            r0.setVisibility(r4)
        L_0x014d:
            boolean r0 = r7.f335681j
            if (r0 == 0) goto L_0x01a8
            android.view.View r0 = r7.f335675d
            if (r0 == 0) goto L_0x015f
            r2 = 2131309513(0x7f0933c9, float:1.8237312E38)
            android.view.View r0 = r0.findViewById(r2)
            r2 = r0
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
        L_0x015f:
            r7.f335683l = r2
            r0 = 2131101833(0x7f060889, float:1.7816087E38)
            if (r2 == 0) goto L_0x017a
            android.content.Context r4 = r7.f335672a
            r5 = 2131756091(0x7f10043b, float:1.914308E38)
            android.content.res.Resources r6 = r4.getResources()
            int r6 = r6.getColor(r0)
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r5, r6)
            r2.setImageDrawable(r4)
        L_0x017a:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r7.f335683l
            if (r2 == 0) goto L_0x018b
            android.content.Context r4 = r7.f335672a
            android.content.res.Resources r4 = r4.getResources()
            int r0 = r4.getColor(r0)
            r2.setIconColor(r0)
        L_0x018b:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r7.f335683l
            if (r0 != 0) goto L_0x0190
            goto L_0x019c
        L_0x0190:
            x82.a r2 = r7.f335673b
            boolean r2 = r2.mo163773d()
            if (r2 == 0) goto L_0x0199
            r1 = 4
        L_0x0199:
            r0.setVisibility(r1)
        L_0x019c:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r7.f335683l
            if (r0 == 0) goto L_0x01a8
            x82.r$e r1 = new x82.r$e
            r1.<init>(r7)
            r0.setOnClickListener(r1)
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112114r.mo163850a():void");
    }

    /* renamed from: b */
    public final void mo163851b(Context context, String str) {
        Toast toast = this.f335680i;
        if (toast != null) {
            toast.cancel();
        }
        this.f335680i = Toast.makeText(context, "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.f359902bi1, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.kpy);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        Toast toast2 = this.f335680i;
        if (toast2 != null) {
            toast2.setGravity(17, 0, 0);
        }
        Toast toast3 = this.f335680i;
        if (toast3 != null) {
            toast3.setView(inflate);
        }
        Toast toast4 = this.f335680i;
        if (toast4 != null) {
            toast4.show();
        }
    }
}
