package lw2;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import ew2.C97757a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kw2.C99268i;
import rx3.C13598b0;

/* renamed from: lw2.o */
public final class C99705o extends C103853a {

    /* renamed from: d */
    public boolean f292228d;

    /* renamed from: e */
    public ArrayList<C97757a> f292229e;

    /* renamed from: f */
    public ArrayList<C97757a> f292230f;

    /* renamed from: g */
    public ArrayList<StoryMsgListView> f292231g;

    /* renamed from: h */
    public final String f292232h;

    /* renamed from: i */
    public C99268i f292233i;

    /* renamed from: j */
    public C32226l<? super C97757a, C13598b0> f292234j;

    /* renamed from: n */
    public C32224a<C13598b0> f292235n;

    /* renamed from: o */
    public C32226l<? super Integer, C13598b0> f292236o;

    /* renamed from: p */
    public C32224a<C13598b0> f292237p;

    public C99705o(boolean z, ArrayList<C97757a> arrayList, ArrayList<C97757a> arrayList2, ArrayList<StoryMsgListView> arrayList3, int i, C8480h hVar) {
        arrayList = (i & 2) != 0 ? new ArrayList<>() : arrayList;
        arrayList2 = (i & 4) != 0 ? new ArrayList<>() : arrayList2;
        arrayList3 = (i & 8) != 0 ? new ArrayList<>() : arrayList3;
        C87412m.m108594g(arrayList, "visitors");
        C87412m.m108594g(arrayList2, "comments");
        C87412m.m108594g(arrayList3, "pages");
        this.f292228d = z;
        this.f292229e = arrayList;
        this.f292230f = arrayList2;
        this.f292231g = arrayList3;
        this.f292232h = "MicroMsg.StoryMsgListAdapter";
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C87412m.m108594g(viewGroup, "container");
        C87412m.m108594g(obj, "view");
        String str = this.f292232h;
        Log.m105918d(str, "destroyItem " + i);
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.f292231g.size();
    }

    public int getItemPosition(Object obj) {
        C87412m.m108594g(obj, "obj");
        return -2;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "container");
        String str = this.f292232h;
        Log.m105918d(str, "instantiateItem isSelf:" + this.f292228d);
        if (this.f292228d) {
            if (i == 0) {
                int i2 = StoryMsgListView.f281952o;
                this.f292231g.get(i).mo134291b(0, this.f292230f, this.f292229e, this.f292233i);
                this.f292231g.get(i).setOnBlankClick(this.f292235n);
                this.f292231g.get(i).setOnContentTopOverScroll(this.f292236o);
                this.f292231g.get(i).setOnContentTopOverScrollStop(this.f292237p);
            } else {
                this.f292231g.get(i).setOnCommentItemClick(this.f292234j);
                this.f292231g.get(i).setOnBlankClick(this.f292235n);
                this.f292231g.get(i).setOnContentTopOverScroll(this.f292236o);
                this.f292231g.get(i).setOnContentTopOverScrollStop(this.f292237p);
                int i3 = StoryMsgListView.f281952o;
                this.f292231g.get(i).mo134291b(1, this.f292230f, this.f292229e, this.f292233i);
            }
            StoryMsgListView storyMsgListView = this.f292231g.get(i);
            int c = C75044y4.m89991c(viewGroup.getContext()) + C74942w4.m89784a(viewGroup.getContext(), 48) + C74942w4.m89784a(viewGroup.getContext(), 24);
            ViewGroup.LayoutParams layoutParams = storyMsgListView.f281953d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c;
            storyMsgListView.requestLayout();
        } else {
            this.f292231g.get(i).setOnCommentItemClick(this.f292234j);
            this.f292231g.get(i).setOnBlankClick(this.f292235n);
            this.f292231g.get(i).setOnContentTopOverScroll(this.f292236o);
            this.f292231g.get(i).setOnContentTopOverScrollStop(this.f292237p);
            int i4 = StoryMsgListView.f281952o;
            this.f292231g.get(i).mo134291b(1, this.f292230f, this.f292229e, this.f292233i);
            StoryMsgListView storyMsgListView2 = this.f292231g.get(i);
            int c2 = C75044y4.m89991c(viewGroup.getContext()) + C74942w4.m89784a(viewGroup.getContext(), 24);
            ViewGroup.LayoutParams layoutParams2 = storyMsgListView2.f281953d.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = c2;
            storyMsgListView2.requestLayout();
        }
        viewGroup.addView(this.f292231g.get(i));
        StoryMsgListView storyMsgListView3 = this.f292231g.get(i);
        C87412m.m108593f(storyMsgListView3, "pages[position]");
        return storyMsgListView3;
    }

    public boolean isViewFromObject(View view, Object obj) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(obj, "obj");
        return C87412m.m108589b(view, obj);
    }
}
