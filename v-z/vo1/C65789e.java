package vo1;

import al1.C54127h;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: vo1.e */
public final class C65789e extends RecyclerView.C16613e<C65790a> {

    /* renamed from: d */
    public ArrayList<C54127h> f189232d;

    /* renamed from: vo1.e$a */
    public final class C65790a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65790a(C65789e eVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: F4 */
    public final void mo89838F4(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    childAt.animate().cancel();
                    if (childAt.hasTransientState()) {
                        Log.m105924i("FinderLiveReplayViewCallback", "[protectViewItemRecycleHealthy] child=" + childAt);
                    }
                    mo89838F4(childAt);
                }
            }
            view.animate().cancel();
        }
    }

    public int getItemCount() {
        ArrayList<C54127h> arrayList = this.f189232d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r5 = r0.f151977d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r8, int r9) {
        /*
            r7 = this;
            vo1.e$a r8 = (vo1.C65789e.C65790a) r8
            java.lang.String r0 = "vh"
            gy3.C87412m.m108594g(r8, r0)
            r0 = 0
            if (r9 < 0) goto L_0x0012
            int r1 = r7.getItemCount()
            if (r9 >= r1) goto L_0x0012
            r0 = 1
        L_0x0012:
            java.lang.String r1 = "FinderLiveReplayViewCallback"
            r2 = 0
            if (r0 == 0) goto L_0x0022
            java.util.ArrayList<al1.h> r0 = r7.f189232d
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r0.get(r9)
            al1.h r0 = (al1.C54127h) r0
            goto L_0x003c
        L_0x0022:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "getData invalid pos:"
            r0.append(r3)
            r0.append(r9)
            r3 = 33
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x003b:
            r0 = r2
        L_0x003c:
            android.view.View r3 = r8.f44854d
            r4 = 2131304229(0x7f091f25, float:1.8226595E38)
            android.view.View r3 = r3.findViewById(r4)
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r3 = (com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "replay_step2-1:bind view,"
            r4.append(r5)
            if (r0 == 0) goto L_0x005a
            com.tencent.mm.live.api.LiveConfig r5 = r0.f151977d
            if (r5 == 0) goto L_0x005a
            java.lang.String r5 = r5.f157076t
            goto L_0x005b
        L_0x005a:
            r5 = r2
        L_0x005b:
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            if (r0 == 0) goto L_0x006c
            com.tencent.mm.live.api.LiveConfig r5 = r0.f151977d
            if (r5 == 0) goto L_0x006c
            java.lang.String r5 = r5.f157053K
            goto L_0x006d
        L_0x006c:
            r5 = r2
        L_0x006d:
            r4.append(r5)
            java.lang.String r5 = ",pos:"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r9 = "(itemCount:"
            r4.append(r9)
            int r9 = r7.getItemCount()
            r4.append(r9)
            java.lang.String r9 = "),liveId:"
            r4.append(r9)
            if (r0 == 0) goto L_0x0095
            com.tencent.mm.live.api.LiveConfig r9 = r0.f151977d
            if (r9 == 0) goto L_0x0095
            long r5 = r9.f157064e
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
        L_0x0095:
            r4.append(r2)
            java.lang.String r9 = ",viewHolder:"
            r4.append(r9)
            int r8 = r8.hashCode()
            r4.append(r8)
            java.lang.String r8 = ",pluginLayout:"
            r4.append(r8)
            int r8 = r3.hashCode()
            r4.append(r8)
            java.lang.String r8 = ",size:"
            r4.append(r8)
            int r8 = r3.getPluginSize()
            r4.append(r8)
            r8 = 125(0x7d, float:1.75E-43)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            if (r0 == 0) goto L_0x00ce
            r3.bindData(r0)
            goto L_0x00d3
        L_0x00ce:
            java.lang.String r8 = "bind view err: data is null!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r8)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65789e.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "vg");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.ajm, (ViewGroup) null);
        FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = (FinderLiveReplayPluginLayout) inflate.findViewById(C0966R.C0970id.dyc);
        inflate.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        C65790a aVar = new C65790a(this, inflate);
        Log.m105924i("FinderLiveReplayViewCallback", "replay_step0-0 onCreateViewHolder viewHolder:" + aVar.hashCode() + ",pluginLayout:" + finderLiveReplayPluginLayout.hashCode() + ",size:" + finderLiveReplayPluginLayout.getPluginSize() + '}');
        return aVar;
    }

    public void onViewDetachedFromWindow(RecyclerView.C16631z zVar) {
        C65790a aVar = (C65790a) zVar;
        C87412m.m108594g(aVar, "holder");
        Log.m105924i("FinderLiveReplayViewCallback", "onViewDetachedFromWindow, " + aVar.hashCode());
        super.onViewDetachedFromWindow(aVar);
        View view = aVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        mo89838F4(view);
    }
}
