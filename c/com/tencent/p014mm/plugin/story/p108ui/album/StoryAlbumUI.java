package com.tencent.p014mm.plugin.story.p108ui.album;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import aw2.C92163a;
import aw2.C92164b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import iw2.C98804a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mw2.C100007a;
import mw2.C100013c;
import mw2.C100017g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumUI;", "Lcom/tencent/mm/ui/MMFragment;", "Law2/b;", "<init>", "()V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.album.StoryAlbumUI */
public final class StoryAlbumUI extends MMFragment implements C92164b {

    /* renamed from: j */
    public static final /* synthetic */ int f281792j = 0;

    /* renamed from: d */
    public RecyclerView f281793d;

    /* renamed from: e */
    public TextView f281794e;

    /* renamed from: f */
    public View f281795f;

    /* renamed from: g */
    public C100007a f281796g;

    /* renamed from: h */
    public C92163a f281797h;

    /* renamed from: i */
    public String f281798i = "";

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r0 = r0.getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dealContentView(android.view.View r12) {
        /*
            r11 = this;
            java.lang.String r0 = "v"
            gy3.C87412m.m108594g(r12, r0)
            super.dealContentView(r12)
            iw2.a r0 = new iw2.a
            r0.<init>(r11)
            r11.f281797h = r0
            androidx.fragment.app.FragmentActivity r0 = r11.getActivity()
            r1 = 0
            if (r0 == 0) goto L_0x0025
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0025
            java.lang.String r2 = "username"
            java.lang.String r0 = r0.getStringExtra(r2)
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = ""
        L_0x002a:
            r11.f281798i = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "initViews username="
            r0.append(r2)
            java.lang.String r2 = r11.f281798i
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.StoryAlbumUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 2131296883(0x7f090273, float:1.8211695E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r2 = "v.findViewById(R.id.album_story_recycler)"
            gy3.C87412m.m108593f(r0, r2)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r11.f281793d = r0
            r0 = 2131296886(0x7f090276, float:1.8211701E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r2 = "v.findViewById(R.id.album_story_send_fail_layout)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2131296780(0x7f09020c, float:1.8211486E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r2 = "v.findViewById(R.id.album_bubble_send_fail_layout)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 2131296887(0x7f090277, float:1.8211703E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r2 = "v.findViewById(R.id.album_story_send_fail_tips)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131296781(0x7f09020d, float:1.8211488E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r2 = "v.findViewById(R.id.album_bubble_send_fail_tips)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131296882(0x7f090272, float:1.8211693E38)
            android.view.View r0 = r12.findViewById(r0)
            java.lang.String r2 = "v.findViewById(R.id.album_story_no_data_tip_tv)"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11.f281794e = r0
            r0 = 2131296881(0x7f090271, float:1.8211691E38)
            android.view.View r12 = r12.findViewById(r0)
            java.lang.String r0 = "v.findViewById(R.id.album_story_no_data_fav_panel)"
            gy3.C87412m.m108593f(r12, r0)
            r11.f281795f = r12
            r0 = 8
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.mo10233c(r0)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/story/ui/album/StoryAlbumUI"
            java.lang.String r5 = "initViews"
            java.lang.String r6 = "(Landroid/view/View;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            java.lang.Object r0 = r10.mo10231a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/story/ui/album/StoryAlbumUI"
            java.lang.String r4 = "initViews"
            java.lang.String r5 = "(Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            mw2.a r12 = new mw2.a
            r12.<init>()
            r11.f281796g = r12
            mw2.h r0 = new mw2.h
            r0.<init>(r11)
            r12.f293013o = r0
            mw2.a r12 = r11.f281796g
            if (r12 == 0) goto L_0x019f
            mw2.i r0 = mw2.C11093i.f32869d
            r12.f293014p = r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.f281793d
            java.lang.String r2 = "mRecyclerView"
            if (r0 == 0) goto L_0x019b
            r0.setAdapter(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r11.f281793d
            if (r12 == 0) goto L_0x0197
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.fragment.app.FragmentActivity r3 = r11.getActivity()
            r0.<init>(r3)
            r12.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r12 = r11.f281793d
            if (r12 == 0) goto L_0x0193
            mw2.j r0 = new mw2.j
            r0.<init>(r11)
            r12.mo17043c(r0)
            aw2.a r12 = r11.f281797h
            java.lang.String r0 = "mPresenter"
            if (r12 == 0) goto L_0x018f
            java.lang.String r2 = r11.f281798i
            iw2.a r12 = (iw2.C98804a) r12
            java.lang.String r3 = "userName"
            gy3.C87412m.m108594g(r2, r3)
            r12.f289657e = r2
            long r2 = r12.f289660h
            r12.mo138181b(r2)
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r3 = 191(0xbf, float:2.68E-43)
            r2.mo123455a(r3, r12)
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r3 = 3926(0xf56, float:5.501E-42)
            r2.mo123455a(r3, r12)
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r3 = 764(0x2fc, float:1.07E-42)
            r2.mo123455a(r3, r12)
            aw2.a r12 = r11.f281797h
            if (r12 == 0) goto L_0x018b
            iw2.a r12 = (iw2.C98804a) r12
            r12.mo138180a()
            aw2.a r12 = r11.f281797h
            if (r12 == 0) goto L_0x0187
            iw2.a r12 = (iw2.C98804a) r12
            com.tencent.mm.plugin.story.model.StoryCore$h r0 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.mo134194l()
            iw2.b r1 = new iw2.b
            r1.<init>(r12)
            r0.post(r1)
            return
        L_0x0187:
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x018b:
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x018f:
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x0193:
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0197:
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x019b:
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x019f:
            java.lang.String r12 = "mStoryAlbumAdapter"
            gy3.C87412m.m108603p(r12)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.album.StoryAlbumUI.dealContentView(android.view.View):void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c64;
    }

    /* renamed from: k */
    public void mo126116k() {
        C100007a aVar = this.f281796g;
        if (aVar != null) {
            aVar.f293011j = true;
            if (true ^ aVar.f293009h.isEmpty()) {
                aVar.notifyDataSetChanged();
                return;
            }
            return;
        }
        C87412m.m108603p("mStoryAlbumAdapter");
        throw null;
    }

    /* renamed from: m */
    public void mo126117m(List<C100013c> list) {
        C87412m.m108594g(list, "datas");
        Log.m105924i("MicroMsg.StoryAlbumUI", "onLoadFinish datas.size=" + list.size());
        C100007a aVar = this.f281796g;
        if (aVar != null) {
            Log.m105924i("MicroMsg.StoryAlbumAdapter", "updateDatas");
            aVar.f293009h.clear();
            aVar.f293009h.addAll(list);
            Iterator<C100013c> it = aVar.f293009h.iterator();
            while (it.hasNext()) {
                aVar.f293012n += it.next().f293027b.size();
            }
            if (!list.isEmpty()) {
                aVar.f293009h.add(new C100013c(aVar.f293005d, (List) null, 2, (C8480h) null));
            }
            aVar.notifyDataSetChanged();
            if (list.isEmpty()) {
                TextView textView = this.f281794e;
                if (textView != null) {
                    textView.setVisibility(0);
                    RecyclerView recyclerView = this.f281793d;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                    } else {
                        C87412m.m108603p("mRecyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mStoryNoDataTv");
                    throw null;
                }
            } else {
                TextView textView2 = this.f281794e;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    RecyclerView recyclerView2 = this.f281793d;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                    } else {
                        C87412m.m108603p("mRecyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mStoryNoDataTv");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("mStoryAlbumAdapter");
            throw null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105918d("MicroMsg.StoryAlbumUI", "onActivityResult requestCode=" + i + " resultCode=" + i2);
        if (i == 1) {
            C92163a aVar = this.f281797h;
            if (aVar != null) {
                ((C98804a) aVar).mo138180a();
            } else {
                C87412m.m108603p("mPresenter");
                throw null;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f7545j9);
        setBackBtn(new C100017g(this));
    }

    public void onDestroy() {
        super.onDestroy();
        C92163a aVar = this.f281797h;
        if (aVar != null) {
            C98804a aVar2 = (C98804a) aVar;
            C86709a0.m107529k().f251779b.mo123470p(191, aVar2);
            C86709a0.m107529k().f251779b.mo123470p(3926, aVar2);
            C86709a0.m107529k().f251779b.mo123470p(764, aVar2);
            return;
        }
        C87412m.m108603p("mPresenter");
        throw null;
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
