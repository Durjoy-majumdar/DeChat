package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.plugin.game.model.C42112t;
import com.tencent.p014mm.plugin.game.widget.TextProgressBar;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import java.util.ArrayList;
import ry1.C48110c0;
import ry1.C48114d0;
import ry1.C48122i;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDownloadView */
public class GameDownloadView extends FrameLayout implements View.OnClickListener, C111847h {

    /* renamed from: i */
    public static final /* synthetic */ int f113844i = 0;

    /* renamed from: d */
    public Button f113845d;

    /* renamed from: e */
    public TextProgressBar f113846e;

    /* renamed from: f */
    public C48122i f113847f;

    /* renamed from: g */
    public C42112t f113848g;

    /* renamed from: h */
    public C42091s.C42092a f113849h = new C42189b();

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDownloadView$a */
    public class C42188a implements Runnable {
        public C42188a() {
        }

        public void run() {
            C42112t tVar = GameDownloadView.this.f113848g;
            tVar.getClass();
            tVar.mo66072a(MMApplicationContext.getContext());
            GameDownloadView.this.f113848g.mo66073b();
            GameDownloadView gameDownloadView = GameDownloadView.this;
            gameDownloadView.getClass();
            MMHandlerThread.postToMainThread(new C48114d0(gameDownloadView));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDownloadView$b */
    public class C42189b implements C42091s.C42092a {
        public C42189b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            r1 = r0.f113851a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo66052a(int r1, java.lang.String r2, boolean r3) {
            /*
                r0 = this;
                if (r3 == 0) goto L_0x0036
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r1 == 0) goto L_0x0009
                goto L_0x0036
            L_0x0009:
                com.tencent.mm.plugin.game.ui.GameDownloadView r1 = com.tencent.p014mm.plugin.game.p061ui.GameDownloadView.this
                com.tencent.mm.plugin.game.model.t r1 = r1.f113848g
                if (r1 == 0) goto L_0x0036
                com.tencent.mm.plugin.game.model.b r1 = r1.f113423a
                if (r1 == 0) goto L_0x0036
                java.lang.String r1 = r1.field_appId
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x001c
                goto L_0x0036
            L_0x001c:
                com.tencent.mm.plugin.game.ui.GameDownloadView r1 = com.tencent.p014mm.plugin.game.p061ui.GameDownloadView.this
                com.tencent.mm.plugin.game.model.t r2 = r1.f113848g
                if (r2 == 0) goto L_0x0036
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r2.mo66072a(r3)
                com.tencent.mm.plugin.game.model.t r2 = r1.f113848g
                r2.mo66073b()
                ry1.d0 r2 = new ry1.d0
                r2.<init>(r1)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            L_0x0036:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameDownloadView.C42189b.mo66052a(int, java.lang.String, boolean):void");
        }
    }

    public GameDownloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42091s.m45783a(this.f113849h);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDownloadView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42112t tVar = this.f113848g;
        tVar.getClass();
        tVar.mo66072a(MMApplicationContext.getContext());
        C48122i iVar = this.f113847f;
        C42112t tVar2 = this.f113848g;
        iVar.mo72863a(tVar2.f113423a, tVar2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDownloadView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42091s.m45785e(this.f113849h);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.avx, this, true);
        this.f113845d = (Button) inflate.findViewById(C0966R.C0970id.ek8);
        TextProgressBar textProgressBar = (TextProgressBar) inflate.findViewById(C0966R.C0970id.ek_);
        this.f113846e = textProgressBar;
        textProgressBar.setTextSize(14);
        this.f113845d.setOnClickListener(this);
        this.f113846e.setOnClickListener(this);
        C48122i iVar = new C48122i(getContext());
        this.f113847f = iVar;
        iVar.f129001f = new C48110c0(this);
    }

    public void setDownloadInfo(C42112t tVar) {
        this.f113848g = tVar;
        C52642c.m58994l().postToWorker(new C42188a());
        MMHandlerThread.postToMainThread(new C48114d0(this));
    }
}
