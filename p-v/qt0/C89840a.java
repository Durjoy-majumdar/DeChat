package qt0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import p008bq.C92290u0;
import p008bq.C92293z0;
import p518fb.C86794p;
import p518fb.C86798t;

/* renamed from: qt0.a */
public final class C89840a extends FrameLayout implements C89843b, C89847c {

    /* renamed from: d */
    public final /* synthetic */ C89848d f258266d = new C89848d();

    /* renamed from: e */
    public final ChatFooterPanel f258267e;

    /* renamed from: f */
    public int f258268f;

    /* renamed from: qt0.a$a */
    public static final class C89841a implements C72837v1 {

        /* renamed from: a */
        public final /* synthetic */ C89850f f258269a;

        public C89841a(C89850f fVar) {
            this.f258269a = fVar;
        }

        /* renamed from: X1 */
        public void mo65586X1(IEmojiInfo iEmojiInfo) {
            if (iEmojiInfo != null) {
                String T = ((C92293z0) C86312j.m106911c(C92293z0.class)).mo126037T(iEmojiInfo.getMd5());
                String groupId = iEmojiInfo.getGroupId();
                String str = "";
                if (groupId == null) {
                    groupId = str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onSendCustomEmoji productId:");
                sb.append(iEmojiInfo.getGroupId());
                sb.append(", md5:");
                sb.append(iEmojiInfo.getMd5());
                sb.append(", desc:");
                sb.append(T);
                sb.append(", designerId:");
                String o0 = iEmojiInfo.mo62685o0();
                if (o0 == null) {
                    o0 = str;
                }
                sb.append(o0);
                Log.m105924i("MicroMsg.AppBrandInputNewSmileyPanel", sb.toString());
                C89850f fVar = this.f258269a;
                if (fVar != null) {
                    String md5 = iEmojiInfo.getMd5();
                    String o05 = iEmojiInfo.mo62685o0();
                    if (o05 != null) {
                        str = o05;
                    }
                    C86794p pVar = (C86794p) fVar;
                    C86798t tVar = pVar.f251931b.f251935j;
                    C81925i2 i2Var = pVar.f251930a;
                    tVar.getClass();
                    C87412m.m108594g(i2Var, "service");
                    C87412m.m108594g(md5, "md5");
                    C87412m.m108594g(T, "desc");
                    if (i2Var.isRunning()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("md5", md5);
                        hashMap.put("productId", groupId);
                        hashMap.put("desc", T);
                        hashMap.put("designerId", str);
                        tVar.mo115165o(hashMap);
                        tVar.mo115194p(i2Var);
                        tVar.mo115158h();
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo65587a() {
        }

        /* renamed from: b */
        public void mo65588b(boolean z, int i) {
        }
    }

    /* renamed from: qt0.a$b */
    public static final class C89842b implements ChatFooterPanel.C72719a {

        /* renamed from: a */
        public final /* synthetic */ C89851g f258270a;

        public C89842b(C89851g gVar) {
            this.f258270a = gVar;
        }

        /* renamed from: a */
        public void mo64626a() {
        }

        /* renamed from: b */
        public void mo64627b(String str) {
            C84983t0.C84991j jVar = C84983t0.this.f247668g;
            if (jVar != null) {
                jVar.mo117901a(str);
            }
        }

        /* renamed from: c */
        public void mo64628c() {
            C84983t0.C84991j jVar = C84983t0.this.f247668g;
            if (jVar != null) {
                jVar.mo117901a("[DELETE_EMOTION]");
            }
        }

        /* renamed from: d */
        public void mo64629d(boolean z) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89840a(Context context, boolean z) {
        super(context);
        C87412m.m108594g(context, "context");
        ChatFooterPanel tm = ((C92290u0) C86312j.m106911c(C92290u0.class)).mo126053tm(context, z);
        this.f258267e = tm;
        tm.setShowSmiley(true);
        tm.mo100204p(false, false);
        tm.mo100203o(false, false);
        tm.setShowStore(false);
        tm.setShowSend(false);
        tm.setShowClose(false);
        tm.setShowSearch(true);
        tm.mo100197i();
        addView(tm, new FrameLayout.LayoutParams(-1, -1));
        setClickable(true);
    }

    private final int getAppropriateHeightInPort() {
        int i = this.f258268f;
        return i > 0 ? i : getPanelDefaultHeightInPort();
    }

    public int getForcedPanelHeight() {
        return this.f258268f;
    }

    public int getPanelDefaultHeightInPort() {
        C89848d dVar = this.f258266d;
        if (dVar.f258276f < 0) {
            dVar.f258276f = KeyBoardUtil.getValidPanelHeight(MMApplicationContext.getContext());
        }
        int i = dVar.f258276f;
        if (i > 0) {
            return i;
        }
        int[] a = dVar.mo124135a();
        int max = (Math.max(a[0], a[1]) / 2) - MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3657ag);
        dVar.f258276f = max;
        return max;
    }

    public int getPanelHeightInLandscape() {
        C89848d dVar = this.f258266d;
        int[] a = dVar.mo124135a();
        int i = dVar.f258275e;
        return (i <= 0 || i >= a[1]) ? (Math.min(a[0], a[1]) / 2) - MMApplicationContext.getResources().getDimensionPixelSize(C0966R.dimen.f3657ag) : i;
    }

    public View getPanelView() {
        return this;
    }

    /* renamed from: k */
    public boolean mo124118k() {
        return true;
    }

    /* renamed from: l */
    public boolean mo124119l(int i) {
        if (i <= 0 || this.f258268f == i) {
            return false;
        }
        this.f258268f = i;
        setForceHeight(i);
        return true;
    }

    /* renamed from: m */
    public void mo124120m(boolean z) {
        this.f258267e.setShowStore(z);
    }

    /* renamed from: n */
    public boolean mo124121n() {
        return isInLayout();
    }

    public void onDestroy() {
        removeAllViews();
    }

    public void onMeasure(int i, int i2) {
        if (!isShown()) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(!KeyBoardUtil.isPortOrientation(getContext()) ? getPanelHeightInLandscape() : getAppropriateHeightInPort(), 1073741824));
        }
    }

    public void onPause() {
        this.f258267e.mo100196h();
    }

    public void onResume() {
        this.f258267e.mo100197i();
    }

    /* renamed from: p */
    public void mo124126p() {
        this.f258267e.setVisibility(0);
        setBackground((Drawable) null);
    }

    /* renamed from: q */
    public boolean mo117827q() {
        Log.m105918d("MicroMsg.AppBrandInputNewSmileyPanel", "[scrollUp] isRealHeightSettled, mForcePanelHeight:" + this.f258268f + ", height:" + getHeight() + ", measuredHeight:" + getMeasuredHeight());
        int i = this.f258268f;
        return i > 0 && i == getMeasuredHeight();
    }

    /* renamed from: r */
    public void mo124127r(boolean z) {
        this.f258267e.setShowSearch(z);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: s */
    public void mo124128s(boolean z) {
        this.f258267e.setVisibility(4);
        if (z) {
            setBackground((Drawable) null);
            return;
        }
        TypedArray obtainStyledAttributes = this.f258267e.getContext().obtainStyledAttributes(new int[]{C0966R.attr.f2800ky});
        C87412m.m108593f(obtainStyledAttributes, "mSmileyPanel.context.obt…tr.emojiPanelBackground))");
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            setBackground(drawable);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setForceHeight(int i) {
        this.f258266d.f258275e = i;
    }

    public void setOnEmoticonOperationListener(C89850f fVar) {
        this.f258267e.setCallback(new C89841a(fVar));
    }

    public void setOnTextOperationListener(C89851g gVar) {
        this.f258267e.setOnTextOperationListener(gVar == null ? null : new C89842b(gVar));
    }
}
