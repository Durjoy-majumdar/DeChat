package com.tencent.p014mm.plugin.topstory.p113ui.widget;

import a13.C67000f;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.HaoKanActionEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.SnsEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C89779i0;
import s03.C77599f;
import te3.lh4;
import te3.mh4;

/* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog */
public class TopStoryCommentFloatDialog extends RelativeLayout implements C7020t0, C11385n {

    /* renamed from: t */
    public static final /* synthetic */ int f207333t = 0;

    /* renamed from: d */
    public View f207334d;

    /* renamed from: e */
    public TextView f207335e;

    /* renamed from: f */
    public TextView f207336f;

    /* renamed from: g */
    public SnsEditText f207337g;

    /* renamed from: h */
    public KeyboardHeightProvider f207338h;

    /* renamed from: i */
    public MMActivity f207339i;

    /* renamed from: j */
    public C89779i0 f207340j = null;

    /* renamed from: n */
    public boolean f207341n = false;

    /* renamed from: o */
    public long f207342o = 0;

    /* renamed from: p */
    public C77599f f207343p;

    /* renamed from: q */
    public C71559h f207344q;

    /* renamed from: r */
    public TextView f207345r;

    /* renamed from: s */
    public View.OnClickListener f207346s = new C71558g();

    /* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog$a */
    public class C71552a implements View.OnClickListener {
        public C71552a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TopStoryCommentFloatDialog.this.mo98671b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog$b */
    public class C71553b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f207348d;

        public C71553b(MMActivity mMActivity) {
            this.f207348d = mMActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0089, code lost:
            if (r0 != 6) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009d, code lost:
            if (r0 != 6) goto L_0x008c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r15) {
            /*
                r14 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r15)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r14
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                long r0 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog r15 = com.tencent.p014mm.plugin.topstory.p113ui.widget.TopStoryCommentFloatDialog.this
                long r2 = r15.f207342o
                long r0 = r0 - r2
                r2 = 500(0x1f4, double:2.47E-321)
                java.lang.String r4 = "(Landroid/view/View;)V"
                java.lang.String r5 = "onClick"
                java.lang.String r6 = "android/view/View$OnClickListener"
                java.lang.String r7 = "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$2"
                int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r8 >= 0) goto L_0x0036
                j20.C117292a.m165361g(r14, r7, r6, r5, r4)
                return
            L_0x0036:
                long r0 = java.lang.System.currentTimeMillis()
                r15.f207342o = r0
                com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog r15 = com.tencent.p014mm.plugin.topstory.p113ui.widget.TopStoryCommentFloatDialog.this
                com.tencent.mm.plugin.sns.ui.SnsEditText r15 = r15.f207337g
                android.text.Editable r15 = r15.getText()
                java.lang.String r15 = r15.toString()
                int r0 = r15.length()
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 <= r1) goto L_0x0054
                j20.C117292a.m165361g(r14, r7, r6, r5, r4)
                return
            L_0x0054:
                int r0 = r15.length()
                if (r0 <= 0) goto L_0x00e7
                java.lang.String r0 = r15.trim()
                int r0 = r0.length()
                if (r0 > 0) goto L_0x0066
                goto L_0x00e7
            L_0x0066:
                com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog r0 = com.tencent.p014mm.plugin.topstory.p113ui.widget.TopStoryCommentFloatDialog.this
                r0.getClass()
                f40.j r0 = f40.C86709a0.m107531m()
                j40.a r0 = r0.mo58407a()
                j40.b r0 = (j40.C87829b) r0
                boolean r0 = r0.mo71804b()
                r1 = 1
                r2 = 4
                r3 = 6
                r8 = 0
                if (r0 == 0) goto L_0x008e
                ob0.b0 r0 = f40.C86709a0.m107524d()
                int r0 = r0.mo123467m()
                if (r0 == r2) goto L_0x009f
                if (r0 != r3) goto L_0x008c
                goto L_0x009f
            L_0x008c:
                r1 = 0
                goto L_0x009f
            L_0x008e:
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r0)
                if (r0 == 0) goto L_0x009a
                r0 = 6
                goto L_0x009b
            L_0x009a:
                r0 = 0
            L_0x009b:
                if (r0 == r2) goto L_0x009f
                if (r0 != r3) goto L_0x008c
            L_0x009f:
                if (r1 != 0) goto L_0x00b3
                com.tencent.mm.ui.MMActivity r15 = r14.f207348d
                r0 = 2131821610(0x7f11042a, float:1.9275968E38)
                java.lang.String r0 = r15.getString(r0)
                java.lang.String r1 = ""
                nj3.C76879j.m92748s(r15, r0, r1)
                j20.C117292a.m165361g(r14, r7, r6, r5, r4)
                return
            L_0x00b3:
                com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog r0 = com.tencent.p014mm.plugin.topstory.p113ui.widget.TopStoryCommentFloatDialog.this
                com.tencent.mm.ui.MMActivity r8 = r14.f207348d
                r1 = 2131821681(0x7f110471, float:1.9276112E38)
                java.lang.String r10 = r8.getString(r1)
                r11 = 1
                r12 = 0
                r13 = 0
                java.lang.String r9 = ""
                qo3.i0 r1 = nj3.C76879j.m92723Q(r8, r9, r10, r11, r12, r13)
                r0.f207340j = r1
                s03.f r0 = new s03.f
                com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog r1 = com.tencent.p014mm.plugin.topstory.p113ui.widget.TopStoryCommentFloatDialog.this
                s03.f r1 = r1.f207343p
                r0.<init>((s03.C77599f) r1)
                ob0.c r1 = r0.f226228e
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                te3.lh4 r1 = (te3.lh4) r1
                r1.f227803f = r15
                ob0.b0 r15 = f40.C86709a0.m107524d()
                r15.mo123460f(r0)
                j20.C117292a.m165361g(r14, r7, r6, r5, r4)
                return
            L_0x00e7:
                j20.C117292a.m165361g(r14, r7, r6, r5, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.topstory.p113ui.widget.TopStoryCommentFloatDialog.C71553b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog$c */
    public class C71554c implements TextWatcher {
        public C71554c() {
        }

        public void afterTextChanged(Editable editable) {
            TopStoryCommentFloatDialog topStoryCommentFloatDialog = TopStoryCommentFloatDialog.this;
            int i = TopStoryCommentFloatDialog.f207333t;
            topStoryCommentFloatDialog.mo98675f();
            TopStoryCommentFloatDialog.this.mo98676g();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog$d */
    public class C71555d implements Runnable {
        public C71555d() {
        }

        public void run() {
            TopStoryCommentFloatDialog.this.f207338h.mo104022e();
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog$e */
    public class C71556e implements DialogInterface.OnClickListener {
        public C71556e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TopStoryCommentFloatDialog.this.mo98670a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog$f */
    public class C71557f implements DialogInterface.OnClickListener {
        public C71557f(TopStoryCommentFloatDialog topStoryCommentFloatDialog) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog$g */
    public class C71558g implements View.OnClickListener {
        public C71558g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (TopStoryCommentFloatDialog.this.getVisibility() == 0) {
                TopStoryCommentFloatDialog.this.mo98671b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog$h */
    public interface C71559h {
        /* renamed from: a */
        void mo25022a();

        void onDismiss();
    }

    public TopStoryCommentFloatDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo98672c();
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        Log.m105924i("MicroMsg.TopStoryCommentFloatDialog", "onKeyboardHeightChanged in pixels: " + i);
        if (this.f207341n) {
            View view = this.f207334d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog", "show", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/topstory/ui/widget/TopStoryCommentFloatDialog", "show", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (((RelativeLayout.LayoutParams) this.f207334d.getLayoutParams()).bottomMargin != i) {
                C67000f fVar = new C67000f(this, i);
                if (i != 0) {
                    fVar.setDuration(200);
                } else {
                    fVar.setDuration(300);
                }
                this.f207334d.startAnimation(fVar);
            }
            this.f207337g.requestFocus();
            setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo98670a() {
        this.f207337g.setText("");
        setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f207334d.getLayoutParams();
        layoutParams.bottomMargin = 0;
        this.f207334d.setLayoutParams(layoutParams);
        this.f207339i.hideVKB();
        this.f207341n = false;
        C71559h hVar = this.f207344q;
        if (hVar != null) {
            hVar.onDismiss();
        }
    }

    /* renamed from: b */
    public void mo98671b() {
        if (this.f207337g.getText().toString().length() > 0) {
            C76879j.m92741l(this.f207339i, C0966R.string.k4g, 0, C0966R.string.a4h, C0966R.string.f360090a14, true, new C71556e(), new C71557f(this), C0966R.color.f3154h3);
        } else {
            mo98670a();
        }
    }

    /* renamed from: c */
    public final void mo98672c() {
        View.inflate(getContext(), C0966R.C0971layout.f360038ca2, this);
        this.f207334d = findViewById(C0966R.C0970id.bjf);
        this.f207337g = (SnsEditText) findViewById(C0966R.C0970id.bk8);
        this.f207335e = (TextView) findViewById(C0966R.C0970id.bf6);
        this.f207336f = (TextView) findViewById(C0966R.C0970id.bf7);
    }

    /* renamed from: d */
    public void mo98673d(MMActivity mMActivity) {
        this.f207339i = mMActivity;
        this.f207338h = new KeyboardHeightProvider(mMActivity);
        setOnClickListener(this.f207346s);
        findViewById(C0966R.C0970id.f357606aq0).setOnClickListener(new C71552a());
        TextView textView = (TextView) findViewById(C0966R.C0970id.hzz);
        this.f207345r = textView;
        textView.setOnClickListener(new C71553b(mMActivity));
        mo98675f();
        mo98676g();
        this.f207337g.addTextChangedListener(new C71554c());
        post(new C71555d());
    }

    /* renamed from: e */
    public void mo98674e(C77599f fVar, C71559h hVar, int i, int i2) {
        this.f207341n = true;
        this.f207343p = fVar;
        setVisibility(0);
        this.f207337g.requestFocus();
        this.f207339i.showVKB();
        this.f207344q = hVar;
        lh4 lh4 = (lh4) fVar.f226228e.f127055a.f127080a;
        C115669n.INSTANCE.mo160131h(17080, 7, 2, "action=14&channelId=" + i + "&mpScene=0&kykScene=" + lh4.f227809o + "&kykSubScene=" + 0 + "&itemType=" + i2 + "&searchId=" + lh4.f227808n + "&docId=" + lh4.f227802e + "&byPass=" + lh4.f227811q);
    }

    /* renamed from: f */
    public final void mo98675f() {
        int length = this.f207337g.getText().toString().length();
        if (length < 180) {
            this.f207335e.setVisibility(8);
            this.f207336f.setVisibility(8);
            return;
        }
        this.f207335e.setVisibility(0);
        this.f207336f.setVisibility(0);
        int color = length <= 200 ? getResources().getColor(C0966R.color.ah5) : getResources().getColor(C0966R.color.a_0);
        TextView textView = this.f207335e;
        textView.setText("" + length);
        this.f207335e.setTextColor(color);
    }

    /* renamed from: g */
    public final void mo98676g() {
        int length = this.f207337g.getText().toString().length();
        int length2 = this.f207337g.getText().toString().trim().length();
        if (length > 200 || length <= 0 || length2 <= 0) {
            this.f207345r.setBackgroundResource(C0966R.C0969drawable.ayg);
        } else {
            this.f207345r.setBackgroundResource(C0966R.C0969drawable.ayf);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var = this.f207340j;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f207340j = null;
        }
        if (i == 0 && i2 == 0) {
            mo98670a();
            C71559h hVar = this.f207344q;
            if (hVar != null) {
                hVar.mo25022a();
            }
            if (yVar instanceof C77599f) {
                C77599f fVar = (C77599f) yVar;
                C104289g gVar = new C104289g();
                try {
                    lh4 lh4 = (lh4) fVar.f226228e.f127055a.f127080a;
                    gVar.put("content", lh4 != null ? lh4.f227803f : "");
                    gVar.put("id", ((mh4) fVar.f226228e.f127056b.f127083a).f138037d);
                    lh4 lh42 = (lh4) fVar.f226228e.f127055a.f127080a;
                    gVar.put("docId", lh42 != null ? lh42.f227802e : "");
                    gVar.put("opType", "REPLY_ARTICLE_BY_ME");
                    HaoKanActionEvent haoKanActionEvent = new HaoKanActionEvent();
                    haoKanActionEvent.f9314d.f9315a = gVar.toString();
                    haoKanActionEvent.f9314d.f9316b = "";
                    haoKanActionEvent.publish();
                } catch (C79923f unused) {
                    Log.m105920e("MicroMsg.TopStoryCommentFloatDialog", "notify tl failed");
                }
            }
            C76912y0.makeText((Context) this.f207339i, (int) C0966R.string.k4i, 0).show();
            return;
        }
        MMActivity mMActivity = this.f207339i;
        C76879j.m92748s(mMActivity, mMActivity.getString(C0966R.string.f7966xq), "");
    }

    public TopStoryCommentFloatDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo98672c();
    }
}
