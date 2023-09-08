package com.tencent.p014mm.plugin.game.chatroom.view;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.s */
public class C41835s extends RecyclerView.C0130p {

    /* renamed from: d */
    public Context f112760d;

    /* renamed from: e */
    public RecyclerView f112761e;

    /* renamed from: f */
    public int f112762f;

    /* renamed from: g */
    public int f112763g;

    /* renamed from: h */
    public RecyclerView.C16634v f112764h;

    /* renamed from: i */
    public RecyclerView.C16634v f112765i;

    /* renamed from: j */
    public int f112766j = 0;

    /* renamed from: n */
    public int f112767n;

    /* renamed from: o */
    public float f112768o = ((float) ViewConfiguration.get(MMApplicationContext.getContext()).getScaledTouchSlop());

    /* renamed from: p */
    public int f112769p = -1;

    /* renamed from: q */
    public boolean f112770q = false;

    /* renamed from: r */
    public LinearLayoutManager f112771r;

    /* renamed from: s */
    public boolean f112772s = false;

    /* renamed from: t */
    public int f112773t;

    /* renamed from: u */
    public int f112774u = 0;

    /* renamed from: v */
    public boolean f112775v = false;

    /* renamed from: w */
    public boolean f112776w = false;

    /* renamed from: x */
    public boolean f112777x = false;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.s$a */
    public interface C41836a {
        /* renamed from: a */
        void mo65622a();

        /* renamed from: b */
        void mo65623b();
    }

    public C41835s(int i) {
        this.f112773t = i;
    }

    /* renamed from: a */
    public final int mo65619a(int i) {
        int i2 = this.f112766j;
        float width = (float) this.f112761e.getWidth();
        int i3 = this.f112766j;
        Log.m105919d("GameChatRoom.CommonLineViewPagerHelper", "alvinluo getOffsetToPosition offset: %d, mTmpOffset: %d, diff: %d, width: %s, mTouchSlop: %s, curPage: %d", Integer.valueOf(i), Integer.valueOf(this.f112763g), Integer.valueOf(i - this.f112763g), Float.valueOf(width), Float.valueOf(this.f112768o), Integer.valueOf(this.f112766j));
        int i4 = i - this.f112763g;
        float f = (float) i4;
        if (f >= width / 2.0f) {
            i2 = mo65620b(this.f112771r.mo16959E());
        } else if (i4 >= 0 && f < this.f112768o) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = Integer.valueOf(i2 == 0 ? 0 : (this.f112767n * i2) + this.f112773t);
            Log.m105925i("GameChatRoom.CommonLineViewPagerHelper", "alvinluo [getOffsetToPosition] targetPage: %s targetPos: %s", objArr);
            if (i2 == 0) {
                return 0;
            }
            return (i2 * this.f112767n) + this.f112773t;
        } else if (f <= (-width) / 2.0f) {
            i2 = mo65620b(this.f112771r.mo16957C());
        }
        int itemCount = this.f112761e.getAdapter().getItemCount();
        int i5 = this.f112767n;
        int i6 = itemCount / i5;
        if (itemCount % i5 != 0) {
            i6++;
        }
        int max = Math.max(Math.min(i2, i6 - 1), -1);
        if (max - i3 > 1) {
            max = i3 + 1;
        } else if (i3 - max > 1) {
            max = i3 - 1;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = Integer.valueOf(i3);
        objArr2[1] = Integer.valueOf(max);
        objArr2[2] = Integer.valueOf(max == 0 ? 0 : (this.f112767n * max) + 1);
        Log.m105925i("GameChatRoom.CommonLineViewPagerHelper", "[getOffsetToPosition] lastPage: %d, targetPage: %d targetPos: %d", objArr2);
        if (max == 0) {
            return 0;
        }
        return (max * this.f112767n) + this.f112773t;
    }

    /* renamed from: b */
    public int mo65620b(int i) {
        if (this.f112773t == 0) {
            return i / this.f112767n;
        }
        int i2 = this.f112767n;
        int i3 = i / i2;
        return (i % i2 != 0 || i == 0) ? i3 : i3 - 1;
    }

    /* renamed from: c */
    public final void mo65621c() {
        if (this.f112770q) {
            Log.m105924i("GameChatRoom.CommonLineViewPagerHelper", "alvinluo onScrollAnimationEnd");
            this.f112770q = false;
            this.f112772s = false;
            this.f112769p = -1;
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        Log.m105925i("GameChatRoom.CommonLineViewPagerHelper", "alvinluo onScrollStateChanged newState: %d", Integer.valueOf(i));
        if (i == 0 && this.f112774u != 2) {
            int a = mo65619a(this.f112762f);
            RecyclerView recyclerView2 = this.f112761e;
            if (recyclerView2 != null && this.f112776w) {
                this.f112764h.f44872a = a;
                this.f112777x = true;
                recyclerView2.getLayoutManager().startSmoothScroll(this.f112764h);
            }
            this.f112775v = true;
        } else if (!this.f112775v && i == 2) {
            this.f112775v = true;
        } else if (i == 0) {
            this.f112763g = this.f112762f;
            this.f112775v = false;
            int C = this.f112771r.mo16957C();
            Log.m105925i("GameChatRoom.CommonLineViewPagerHelper", "alvinluo onScrollStateChanged firstPos: %d", Integer.valueOf(C));
            if (C != -1) {
                int i2 = C / this.f112767n;
                this.f112766j = i2;
                Log.m105925i("GameChatRoom.CommonLineViewPagerHelper", "alvinluo onScrollStateChanged mCurPage: %d, firstVisible: %d", Integer.valueOf(i2), Integer.valueOf(C));
            } else {
                Log.m105921e("GameChatRoom.CommonLineViewPagerHelper", "alvinluo onScrollStateChanged firstPos is -1, invalid, mCurPage: %d", Integer.valueOf(this.f112766j));
            }
            this.f112776w = false;
            if (this.f112772s) {
                Log.m105918d("GameChatRoom.CommonLineViewPagerHelper", "alvinluo scrollMore");
                this.f112761e.getAdapter().notifyItemRangeChanged(this.f112761e.getAdapter().getItemCount(), 5);
                this.f112772s = false;
                int itemCount = this.f112761e.getAdapter().getItemCount();
                int i3 = this.f112767n;
                int i4 = itemCount / i3;
                if (itemCount % i3 == 0) {
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 * i5;
                if (i6 <= 0) {
                    i6 = 0;
                }
                Log.m105925i("GameChatRoom.CommonLineViewPagerHelper", "alvinluo smoothScrollToLastPage allCount: %d, lastPage: %d, targetPos: %d", Integer.valueOf(itemCount), Integer.valueOf(i5), Integer.valueOf(i6));
                this.f112770q = true;
                int b = mo65620b(i6);
                this.f112769p = b == 0 ? 0 : (this.f112767n * b) + 1;
                int b2 = mo65620b(this.f112771r.mo17004z());
                this.f112766j = b2;
                Log.m105925i("GameChatRoom.CommonLineViewPagerHelper", "alvinluo fastScroll curPage: %d, pos: %d, targetPage: %d, targetPos: %d", Integer.valueOf(b2), Integer.valueOf(i6), Integer.valueOf(b), Integer.valueOf(this.f112769p));
                if (b == this.f112766j) {
                    mo65621c();
                } else {
                    int i7 = this.f112769p;
                    RecyclerView recyclerView3 = this.f112761e;
                    if (recyclerView3 != null) {
                        this.f112765i.f44872a = i7;
                        this.f112777x = true;
                        recyclerView3.getLayoutManager().startSmoothScroll(this.f112765i);
                    }
                }
            } else {
                mo65621c();
            }
            if (this.f112777x) {
                Log.m105924i("GameChatRoom.CommonLineViewPagerHelper", "alvinluo scrollBy x: -1, y: 0");
                this.f112777x = false;
                this.f112761e.scrollBy(-1, 0);
            }
        } else if (i == 1) {
            Log.m105924i("GameChatRoom.CommonLineViewPagerHelper", "SCROLL_STATE_DRAGGING");
            this.f112776w = true;
        }
        this.f112774u = i;
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        this.f112762f += i;
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
