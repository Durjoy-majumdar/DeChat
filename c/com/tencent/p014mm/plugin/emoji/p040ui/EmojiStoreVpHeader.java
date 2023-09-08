package com.tencent.p014mm.plugin.emoji.p040ui;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.camera.core.FocusMeteringAction;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMDotView;
import com.tencent.p014mm.plugin.emoji.model.C93101b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import te3.C101754a80;
import te3.C52077y70;
import te3.C52226z70;
import w51.C102344i;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader */
public class EmojiStoreVpHeader extends LinearLayout implements ViewPager.OnPageChangeListener {

    /* renamed from: q */
    public static final /* synthetic */ int f268662q = 0;

    /* renamed from: d */
    public MMDotView f268663d;

    /* renamed from: e */
    public ViewPager f268664e;

    /* renamed from: f */
    public View f268665f;

    /* renamed from: g */
    public LinkedList<C93101b> f268666g;

    /* renamed from: h */
    public View f268667h;

    /* renamed from: i */
    public C102344i f268668i;

    /* renamed from: j */
    public float f268669j;

    /* renamed from: n */
    public float f268670n;

    /* renamed from: o */
    public C93158c f268671o;

    /* renamed from: p */
    public volatile boolean f268672p;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader$a */
    public class C93156a implements Runnable {
        public C93156a() {
        }

        public void run() {
            LinkedList<C93101b> linkedList;
            EmojiStoreVpHeader emojiStoreVpHeader = EmojiStoreVpHeader.this;
            C102344i iVar = emojiStoreVpHeader.f268668i;
            if (iVar != null && (linkedList = emojiStoreVpHeader.f268666g) != null) {
                iVar.f301440e.clear();
                iVar.f301440e.addAll(linkedList);
                iVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader$b */
    public class C93157b implements Runnable {
        public C93157b() {
        }

        public void run() {
            EmojiStoreVpHeader emojiStoreVpHeader = EmojiStoreVpHeader.this;
            int i = EmojiStoreVpHeader.f268662q;
            ViewPager viewPager = emojiStoreVpHeader.f268664e;
            if (viewPager != null) {
                viewPager.setCurrentItem(emojiStoreVpHeader.f268666g.size() * 30, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader$c */
    public class C93158c extends MMHandler {
        public C93158c(C93156a aVar) {
        }

        public void handleMessage(Message message) {
            C93158c cVar;
            if (EmojiStoreVpHeader.this.f268672p || message.what == 0) {
                LinkedList<C93101b> linkedList = EmojiStoreVpHeader.this.f268666g;
                if (linkedList == null || linkedList.size() <= 1) {
                    Log.m105928w("MicroMsg.emoji.EmojiStoreVpHeader", "list is null");
                    return;
                }
                EmojiStoreVpHeader emojiStoreVpHeader = EmojiStoreVpHeader.this;
                if (emojiStoreVpHeader.f268668i == null) {
                    Log.m105928w("MicroMsg.emoji.EmojiStoreVpHeader", "adapter is null");
                    return;
                }
                int currentItem = emojiStoreVpHeader.f268664e.getCurrentItem() + 1;
                if (currentItem >= EmojiStoreVpHeader.this.f268668i.getCount()) {
                    currentItem = (EmojiStoreVpHeader.this.f268666g.size() * 60) / 2;
                }
                EmojiStoreVpHeader.this.f268664e.setCurrentItem(currentItem);
                if (EmojiStoreVpHeader.this.f268672p && (cVar = EmojiStoreVpHeader.this.f268671o) != null) {
                    sendMessageDelayed(cVar.obtainMessage(0), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
            }
        }
    }

    public EmojiStoreVpHeader(Context context) {
        super(context);
        setOrientation(1);
    }

    /* renamed from: a */
    public static int[] m117650a(Context context) {
        int[] iArr = new int[2];
        if (context instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            iArr[0] = displayMetrics.widthPixels;
            iArr[1] = displayMetrics.heightPixels;
        } else {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            iArr[0] = defaultDisplay.getWidth();
            iArr[1] = defaultDisplay.getHeight();
        }
        return iArr;
    }

    /* renamed from: b */
    public void mo127764b() {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.a3_, (ViewGroup) null);
        this.f268667h = inflate;
        this.f268665f = inflate.findViewById(C0966R.C0970id.cht);
        this.f268663d = (MMDotView) this.f268667h.findViewById(C0966R.C0970id.chs);
        this.f268664e = (ViewPager) this.f268667h.findViewById(C0966R.C0970id.chu);
        this.f268671o = new C93158c((C93156a) null);
        int i = ((m117650a(getContext())[0] * 3) / 8) + 1;
        View view = this.f268665f;
        if (view != null) {
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        }
        addView(this.f268667h, new LinearLayout.LayoutParams(-1, -2));
    }

    /* renamed from: c */
    public final void mo127765c() {
        LinkedList<C93101b> linkedList;
        if (this.f268664e != null && (linkedList = this.f268666g) != null) {
            if (linkedList.size() <= 0) {
                View view = this.f268665f;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            View view3 = this.f268665f;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f268664e.setOnPageChangeListener(this);
            if (this.f268668i == null) {
                C102344i iVar = new C102344i(getContext(), this.f268666g);
                this.f268668i = iVar;
                this.f268664e.setAdapter(iVar);
                this.f268664e.setOffscreenPageLimit(1);
                ViewPager viewPager = this.f268664e;
                if (viewPager != null) {
                    viewPager.setCurrentItem(this.f268666g.size() * 30, false);
                    return;
                }
                return;
            }
            post(new C93156a());
        }
    }

    /* renamed from: d */
    public void mo127766d(LinkedList<C52077y70> linkedList, LinkedList<C101754a80> linkedList2) {
        C52226z70 z702;
        C52226z70 z703;
        if (linkedList != null) {
            LinkedList<C93101b> linkedList3 = this.f268666g;
            if (linkedList3 == null) {
                this.f268666g = new LinkedList<>();
            } else {
                linkedList3.clear();
            }
            Iterator<C101754a80> it = linkedList2.iterator();
            while (it.hasNext()) {
                C101754a80 next = it.next();
                if (!(next == null || (z703 = next.f297838d) == null || Util.isNullOrNil(z703.f145740g))) {
                    this.f268666g.add(new C93101b((C52077y70) null, next, true));
                }
            }
            Iterator<C52077y70> it4 = linkedList.iterator();
            while (it4.hasNext()) {
                C52077y70 next2 = it4.next();
                if (!(next2 == null || (z702 = next2.f145152e) == null || Util.isNullOrNil(z702.f145740g))) {
                    this.f268666g.add(new C93101b(next2, (C101754a80) null, false));
                }
            }
            synchronized (this) {
                if (this.f268666g != null) {
                    if (this.f268667h == null) {
                        mo127764b();
                    }
                    MMDotView mMDotView = this.f268663d;
                    if (mMDotView != null) {
                        LinkedList<C93101b> linkedList4 = this.f268666g;
                        mMDotView.setDotCount(linkedList4 == null ? 0 : linkedList4.size());
                        this.f268663d.setSelectedDot(0);
                        this.f268663d.setVisibility(8);
                    }
                    mo127765c();
                } else {
                    throw new IllegalAccessError("must has emoji baner list first");
                }
            }
        }
    }

    /* renamed from: e */
    public void mo127767e() {
        if (this.f268671o == null) {
            this.f268671o = new C93158c((C93156a) null);
        }
        this.f268672p = true;
        this.f268671o.removeMessages(0);
        this.f268671o.sendEmptyMessageDelayed(0, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1 != 3) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            int r1 = r9.getAction()
            float r2 = r9.getRawX()
            float r3 = r9.getRawY()
            r4 = 0
            r5 = 3
            r6 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r6) goto L_0x0039
            r7 = 2
            if (r1 == r7) goto L_0x001d
            if (r1 == r5) goto L_0x0039
            goto L_0x004c
        L_0x001d:
            float r1 = r8.f268669j
            float r2 = r2 - r1
            int r1 = (int) r2
            float r2 = r8.f268670n
            float r3 = r3 - r2
            int r2 = (int) r3
            int r1 = java.lang.Math.abs(r1)
            int r2 = java.lang.Math.abs(r2)
            if (r1 <= r2) goto L_0x004c
            android.view.ViewParent r1 = r8.getParent()
            if (r1 == 0) goto L_0x004c
            r1.requestDisallowInterceptTouchEvent(r6)
            goto L_0x004c
        L_0x0039:
            r1 = 0
            r8.f268669j = r1
            r8.f268670n = r1
            android.view.ViewParent r1 = r8.getParent()
            if (r1 == 0) goto L_0x004c
            r1.requestDisallowInterceptTouchEvent(r4)
            goto L_0x004c
        L_0x0048:
            r8.f268669j = r2
            r8.f268670n = r3
        L_0x004c:
            if (r0 == 0) goto L_0x0057
            if (r0 == r6) goto L_0x0053
            if (r0 == r5) goto L_0x0053
            goto L_0x0063
        L_0x0053:
            r8.mo127767e()
            goto L_0x0063
        L_0x0057:
            com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader$c r0 = r8.f268671o
            if (r0 != 0) goto L_0x005c
            goto L_0x0063
        L_0x005c:
            r8.f268672p = r4
            com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader$c r0 = r8.f268671o
            r0.removeMessages(r4)
        L_0x0063:
            boolean r9 = super.onInterceptTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.EmojiStoreVpHeader.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        LinkedList<C93101b> linkedList = this.f268666g;
        if (linkedList != null && linkedList.size() > 1) {
            if (i == 0 || i == this.f268668i.getCount() - 1) {
                this.f268667h.postDelayed(new C93157b(), 350);
            }
        }
    }

    public EmojiStoreVpHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
    }
}
