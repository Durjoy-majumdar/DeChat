package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.m */
public class C115818m extends C103853a {

    /* renamed from: d */
    public final /* synthetic */ TopStoryHomeUIComponentImpl f347456d;

    public C115818m(TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl) {
        this.f347456d = topStoryHomeUIComponentImpl;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "destroyItem pos:%s, v:%s", Integer.valueOf(i), Integer.valueOf(obj.hashCode()));
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.f347456d.f54516q.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Log.m105925i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "instantiateItem pos:%s, v:%s", Integer.valueOf(i), Integer.valueOf(((TopStoryHomeUIComponentImpl.C19340m) ((ArrayList) this.f347456d.f54525z).get(i)).f54554a.hashCode()));
        viewGroup.addView(((TopStoryHomeUIComponentImpl.C19340m) ((ArrayList) this.f347456d.f54525z).get(i)).f54554a, new ViewGroup.LayoutParams(-1, -1));
        return ((TopStoryHomeUIComponentImpl.C19340m) ((ArrayList) this.f347456d.f54525z).get(i)).f54554a;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
