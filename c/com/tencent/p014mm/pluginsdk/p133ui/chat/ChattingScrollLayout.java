package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.ChattingAnimFrame;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.xweb.util.WXWebReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import p1136n3.C109678b;
import p206nj.C11171e;
import p849e3.C107168a0;
import p849e3.C107207u;
import wq3.C111847h;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout */
public class ChattingScrollLayout extends LinearLayout implements C111847h {

    /* renamed from: d */
    public OverScroller f212077d;

    /* renamed from: e */
    public Runnable f212078e;

    /* renamed from: f */
    public int f212079f;

    /* renamed from: g */
    public int f212080g;

    /* renamed from: h */
    public int f212081h;

    /* renamed from: i */
    public int f212082i;

    /* renamed from: j */
    public int f212083j;

    /* renamed from: n */
    public View f212084n;

    /* renamed from: o */
    public View f212085o;

    /* renamed from: p */
    public MMChattingListView f212086p;

    /* renamed from: q */
    public final List<C72760b> f212087q;

    /* renamed from: r */
    public float f212088r;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout$a */
    public class C72759a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f212089d;

        /* renamed from: e */
        public final /* synthetic */ boolean f212090e;

        public C72759a(int i, boolean z) {
            this.f212089d = i;
            this.f212090e = z;
        }

        public void run() {
            Log.m105924i("MicroMsg.ChattingScrollLayout", "scrollContentTo: in runnable");
            ChattingScrollLayout chattingScrollLayout = ChattingScrollLayout.this;
            chattingScrollLayout.f212078e = null;
            int i = chattingScrollLayout.f212080g;
            int i2 = chattingScrollLayout.f212079f;
            chattingScrollLayout.f212077d.startScroll(0, i2, 0, i - i2, this.f212090e ? this.f212089d == 0 ? TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE : WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO : 0);
            ChattingScrollLayout chattingScrollLayout2 = ChattingScrollLayout.this;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(chattingScrollLayout2);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout$b */
    public interface C72760b {
        /* renamed from: m */
        void mo100547m(float f, boolean z);
    }

    public ChattingScrollLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getInterTranslationY() {
        int i = this.f212081h;
        if (i != 0) {
            return (int) (((((double) this.f212079f) * 1.0d) / ((double) i)) * ((double) this.f212083j));
        }
        return 0;
    }

    /* renamed from: a */
    public void mo100586a(int i, boolean z, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Log.m105925i("MicroMsg.ChattingScrollLayout", "scrollContentTo: %s", Integer.valueOf(i));
        if (this.f212080g != i) {
            this.f212080g = i;
            if (i != 0) {
                this.f212081h = i;
            }
            this.f212083j = i3;
            View view = (ChattingAnimFrame) findViewById(C0966R.C0970id.b1l);
            if (view == null) {
                view = findViewById(C0966R.C0970id.l8y);
                Log.m105924i("MicroMsg.ChattingScrollLayout", "resizeChatAnimFrame: use view stub");
            } else {
                Log.m105924i("MicroMsg.ChattingScrollLayout", "resizeChatAnimFrame: use view");
            }
            if (!(view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null)) {
                marginLayoutParams.bottomMargin = this.f212080g;
                view.setLayoutParams(marginLayoutParams);
            }
            this.f212077d.forceFinished(true);
            removeCallbacks(this.f212078e);
            C72759a aVar = new C72759a(i2, z);
            this.f212078e = aVar;
            post(aVar);
        }
    }

    /* renamed from: b */
    public final void mo100587b(boolean z, boolean z2) {
        int bottomSpace = this.f212086p.getBottomSpace();
        float translationY = (bottomSpace > 0 ? this.f212084n.getTranslationY() + ((float) bottomSpace) : this.f212084n.getTranslationY()) + ((float) getInterTranslationY());
        if (translationY > 0.0f) {
            translationY = 0.0f;
        }
        if (this.f212088r != translationY) {
            if (!z || !this.f212077d.isFinished() || this.f212080g <= 0 || translationY >= this.f212086p.getTranslationY() || !C11171e.m11046c(24)) {
                this.f212086p.setTranslationY(translationY);
            } else {
                this.f212086p.animate().translationY(translationY).setDuration(100).start();
            }
        }
        this.f212088r = translationY;
        if (!z) {
            boolean z3 = z2 && this.f212077d.isFinished();
            Iterator it = new ArrayList(this.f212087q).iterator();
            while (it.hasNext()) {
                ((C72760b) it.next()).mo100547m(translationY, z3);
            }
        }
    }

    public void computeScroll() {
        if (this.f212077d.computeScrollOffset()) {
            this.f212079f = this.f212077d.getCurrY();
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != this.f212085o) {
                    childAt.setTranslationY((float) (-this.f212079f));
                }
            }
            mo100587b(false, true);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f212082i = this.f212079f;
        } else {
            motionEvent.offsetLocation(0.0f, (float) (this.f212082i - this.f212079f));
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                this.f212082i = 0;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f212084n = findViewById(C0966R.C0970id.h_g);
        this.f212085o = findViewById(C0966R.C0970id.b49);
        this.f212086p = (MMChattingListView) findViewById(C0966R.C0970id.b5n);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105925i("MicroMsg.ChattingScrollLayout", "onLayout: %s, %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f212078e;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.f212078e);
        }
        OverScroller overScroller = this.f212077d;
        if (overScroller != null && overScroller.isFinished()) {
            mo100587b(true, true);
        }
    }

    public ChattingScrollLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f212079f = 0;
        this.f212080g = 0;
        this.f212081h = 0;
        this.f212082i = 0;
        this.f212087q = new LinkedList();
        this.f212088r = 0.0f;
        this.f212077d = new OverScroller(getContext(), new C109678b());
    }
}
