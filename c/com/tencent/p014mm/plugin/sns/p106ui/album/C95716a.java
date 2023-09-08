package com.tencent.p014mm.plugin.sns.p106ui.album;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96315x6;
import com.tencent.p014mm.plugin.sns.p106ui.LoadingMoreView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI;
import com.tencent.p014mm.plugin.sns.p106ui.album.C95725b;
import com.tencent.p014mm.plugin.sns.p106ui.album.C95727c;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C9556a;
import kg3.C76577a;
import os2.C100400e0;
import te3.C101804kv2;
import te3.C50660oc0;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.album.a */
public class C95716a extends RecyclerView.C16613e {

    /* renamed from: d */
    public List<C95719c> f279163d = new ArrayList();

    /* renamed from: e */
    public Context f279164e;

    /* renamed from: f */
    public String f279165f = "";

    /* renamed from: g */
    public String f279166g = "";

    /* renamed from: h */
    public String f279167h = "";

    /* renamed from: i */
    public boolean f279168i = false;

    /* renamed from: j */
    public boolean f279169j = false;

    /* renamed from: n */
    public long f279170n = 0;

    /* renamed from: o */
    public int f279171o = 0;

    /* renamed from: p */
    public boolean f279172p = false;

    /* renamed from: q */
    public String f279173q = "";

    /* renamed from: r */
    public C95725b f279174r = null;

    /* renamed from: s */
    public C95727c.C95728a f279175s = null;

    /* renamed from: t */
    public C95718b f279176t;

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.a$a */
    public class C95717a implements C95725b.C95726a {
        public C95717a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.a$b */
    public interface C95718b {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.a$c */
    public static class C95719c {

        /* renamed from: a */
        public List<SnsInfo> f279178a = new ArrayList();

        /* renamed from: b */
        public String f279179b = "";

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumInfo");
            StringBuilder sb = new StringBuilder();
            for (SnsInfo next : this.f279178a) {
                sb.append("\t[localId=");
                sb.append(next.localid);
                sb.append(", snsId=");
                sb.append(next.field_snsId);
                sb.append("\n");
            }
            String str = this.f279179b + "\n" + sb.toString();
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumInfo");
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.a$d */
    public class C95720d extends RecyclerView.C16631z {

        /* renamed from: z */
        public LoadingMoreView f279181z = null;

        public C95720d(View view) {
            super(view);
            this.f279181z = (LoadingMoreView) view.findViewById(C0966R.C0970id.jre);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.a$e */
    public static class C95721e {

        /* renamed from: a */
        public int f279182a = 0;

        /* renamed from: b */
        public C101804kv2 f279183b = null;
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.a$f */
    public class C95722f extends RecyclerView.C16631z {

        /* renamed from: com.tencent.mm.plugin.sns.ui.album.a$f$a */
        public class C95723a implements View.OnClickListener {
            public C95723a(C95716a aVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/album/SnsAlbumAdapter$SnsAlbumTimelineHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumTimelineHolder$1");
                C95716a aVar = C95716a.this;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("goMyTimeline", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                Intent intent = new Intent(aVar.f279164e, SnsUserUI.class);
                intent.putExtra("sns_userName", aVar.f279167h);
                intent.putExtra("sns_rpt_scene", 21);
                Context context = aVar.f279164e;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/album/SnsAlbumAdapter", "goMyTimeline", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumAdapter", "goMyTimeline", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                SnsMethodCalculate.markEndTimeMs("goMyTimeline", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumTimelineHolder$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumAdapter$SnsAlbumTimelineHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C95722f(View view) {
            super(view);
            ((TextView) view.findViewById(C0966R.C0970id.f5749nk)).setOnClickListener(new C95723a(C95716a.this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.a$g */
    public class C95724g extends RecyclerView.C16631z {

        /* renamed from: F */
        public static final /* synthetic */ int f279186F = 0;

        /* renamed from: A */
        public TextView f279187A = null;

        /* renamed from: B */
        public TextView f279188B = null;

        /* renamed from: C */
        public RecyclerView f279189C = null;

        /* renamed from: D */
        public GridLayoutManager f279190D = null;

        /* renamed from: z */
        public C95727c f279192z = null;

        public C95724g(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.jrc);
            this.f279187A = textView;
            textView.setTextSize(0, C95716a.m122533G4(C95716a.this).getResources().getDimension(C0966R.dimen.f3634s));
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.jrj);
            this.f279188B = textView2;
            textView2.setTextSize(0, C95716a.m122533G4(C95716a.this).getResources().getDimension(C0966R.dimen.f3634s));
            this.f279189C = (RecyclerView) view.findViewById(C0966R.C0970id.jri);
            this.f279190D = new GridLayoutManager(C95716a.m122533G4(C95716a.this), 3);
            C95727c cVar = new C95727c();
            this.f279192z = cVar;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            C95727c.C95728a aVar = C95716a.this.f279175s;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            SnsMethodCalculate.markStartTimeMs("setOnGridItemClickListener", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            cVar.f279200e = aVar;
            SnsMethodCalculate.markEndTimeMs("setOnGridItemClickListener", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        }
    }

    public C95716a(Context context, String str, C95718b bVar) {
        this.f279164e = context;
        this.f279176t = bVar;
        SnsMethodCalculate.markStartTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(this.f279164e.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), this.f279164e);
        Log.m105918d("MicroMsg.SnsAlbumAdapter", "filterLan temp " + loadApplicationLanguage);
        if (loadApplicationLanguage.equals("zh_CN") || loadApplicationLanguage.equals("en") || loadApplicationLanguage.equals("zh_TW")) {
            SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        } else {
            loadApplicationLanguage.equals("zh_HK");
            SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        }
        this.f279167h = str;
        C86709a0.m107528h();
        if (this.f279167h.equals((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null))) {
            this.f279168i = true;
        }
        this.f279174r = new C95725b(new C95717a(), this.f279167h, this.f279168i);
        mo133170w5(0);
        Log.m105925i("MicroMsg.SnsAlbumAdapter", "limitId=%s", this.f279166g);
        mo133169u5(false);
    }

    /* renamed from: F4 */
    public static /* synthetic */ List m122532F4(C95716a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        List<C95719c> list = aVar.f279163d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return list;
    }

    /* renamed from: G4 */
    public static /* synthetic */ Context m122533G4(C95716a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        Context context = aVar.f279164e;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return context;
    }

    /* renamed from: O4 */
    public void mo133167O4() {
        long j;
        SnsMethodCalculate.markStartTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        Log.m105924i("MicroMsg.SnsAlbumAdapter", "i addSize ");
        if (((ArrayList) this.f279163d).size() > 1) {
            List<C95719c> list = this.f279163d;
            List<SnsInfo> list2 = ((C95719c) ((ArrayList) list).get(((ArrayList) list).size() - 2)).f279178a;
            if (!list2.isEmpty()) {
                j = list2.get(list2.size() - 1).field_snsId;
                mo133170w5(j);
                SnsMethodCalculate.markEndTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            }
        }
        j = 0;
        mo133170w5(j);
        SnsMethodCalculate.markEndTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }

    /* renamed from: g5 */
    public void mo133168g5(String str) {
        SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        mo133169u5(true);
        SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }

    public int getItemCount() {
        SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        int size = ((ArrayList) this.f279163d).size();
        SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return size;
    }

    public int getItemViewType(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        int i2 = "loading".equals(((C95719c) ((ArrayList) this.f279163d).get(i)).f279179b) ? 1 : "my_timeline".equals(((C95719c) ((ArrayList) this.f279163d).get(i)).f279179b) ? 2 : 0;
        SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return i2;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        RecyclerView.C16631z zVar2 = zVar;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        Log.m105919d("MicroMsg.SnsAlbumAdapter", "onBindViewHolder %s", Integer.valueOf(i));
        if (zVar2 instanceof C95720d) {
            C95720d dVar = (C95720d) zVar2;
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
            Log.m105918d("MicroMsg.SnsAlbumAdapter", "SnsAlbumLoadingHolder onBind");
            SnsMethodCalculate.markStartTimeMs("checkLoadingMoreView", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
            C95716a aVar = C95716a.this;
            SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            boolean z = aVar.f279172p;
            SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            if (z) {
                dVar.f279181z.setVisibility(0);
                LoadingMoreView loadingMoreView = dVar.f279181z;
                C95716a aVar2 = C95716a.this;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                String str = aVar2.f279173q;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                loadingMoreView.mo132182b(0, str);
            } else {
                dVar.f279181z.setVisibility(0);
            }
            SnsMethodCalculate.markEndTimeMs("checkLoadingMoreView", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
            SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumLoadingHolder");
        } else if (zVar2 instanceof C95724g) {
            C95724g gVar = (C95724g) zVar2;
            gVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            C95719c cVar = (C95719c) ((ArrayList) m122532F4(C95716a.this)).get(i2);
            C95719c cVar2 = i2 > 1 ? (C95719c) ((ArrayList) m122532F4(C95716a.this)).get(i2 - 1) : null;
            int head = cVar.f279178a.get(0).getHead();
            int head2 = cVar2 == null ? 0 : cVar2.f279178a.get(0).getHead();
            SnsMethodCalculate.markStartTimeMs("handleDateTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            int i3 = head / 10000;
            int i4 = head2 / 10000;
            Log.m105919d("MicroMsg.SnsAlbumAdapter", "handleDateTv prehead=%s head=%s", Integer.valueOf(head2), Integer.valueOf(head));
            if ((head2 != 0 || i3 == C96315x6.m123540f()) && (head2 == 0 || i3 == i4)) {
                gVar.f279187A.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = gVar.f44854d.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = C76577a.m92155f(gVar.f279187A.getContext(), C0966R.dimen.f3623g);
                    gVar.f44854d.setLayoutParams(marginLayoutParams);
                }
            } else {
                gVar.f279187A.setText(String.format(m122533G4(C95716a.this).getResources().getString(C0966R.string.f361397jk1), new Object[]{Integer.valueOf(i3)}));
                gVar.f279187A.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = gVar.f44854d.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (head2 != 0) {
                        marginLayoutParams2.topMargin = C76577a.m92151b(gVar.f279187A.getContext(), 70);
                    } else {
                        marginLayoutParams2.topMargin = C76577a.m92155f(gVar.f279187A.getContext(), C0966R.dimen.f3623g);
                    }
                    gVar.f44854d.setLayoutParams(marginLayoutParams2);
                }
            }
            SnsMethodCalculate.markEndTimeMs("handleDateTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            String str2 = cVar.f279179b;
            SnsMethodCalculate.markStartTimeMs("handleTimeTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            if (str2.contains("/")) {
                String[] split = str2.split("/");
                if (split.length > 1) {
                    gVar.f279188B.setText(split[1]);
                }
            } else {
                gVar.f279188B.setText(str2);
            }
            SnsMethodCalculate.markEndTimeMs("handleTimeTv", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            SnsMethodCalculate.markStartTimeMs("handleGrid", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            gVar.f279189C.setLayoutManager(gVar.f279190D);
            gVar.f279189C.setAdapter(gVar.f279192z);
            C95727c cVar3 = gVar.f279192z;
            List<SnsInfo> list = cVar.f279178a;
            cVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("updateItemsData", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            ((ArrayList) cVar3.f279199d).clear();
            for (SnsInfo next : list) {
                Iterator<C101804kv2> it = next.getTimeLine().ContentObj.f298427h.iterator();
                while (it.hasNext()) {
                    C95721e eVar = new C95721e();
                    eVar.f279182a = next.localid;
                    eVar.f279183b = it.next();
                    ((ArrayList) cVar3.f279199d).add(eVar);
                }
            }
            cVar3.notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("updateItemsData", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
            SnsMethodCalculate.markEndTimeMs("handleGrid", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
            SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumViewHolder");
        } else if (zVar2 instanceof C95722f) {
            ((C95722f) zVar2).getClass();
            SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumTimelineHolder");
            SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$SnsAlbumTimelineHolder");
        }
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        Log.m105919d("MicroMsg.SnsAlbumAdapter", "onCreateViewHolder %s", Integer.valueOf(i));
        RecyclerView.C16631z dVar = i == 1 ? new C95720d(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359998c23, viewGroup, false)) : i == 2 ? new C95722f(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c25, viewGroup, false)) : new C95724g(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359997c22, viewGroup, false));
        SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        return dVar;
    }

    /* renamed from: u5 */
    public void mo133169u5(boolean z) {
        SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        Log.m105924i("MicroMsg.SnsAlbumAdapter", "limitSeq " + this.f279166g);
        C95725b bVar = this.f279174r;
        if (bVar != null) {
            String str = this.f279166g;
            boolean z2 = this.f279169j;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
            Log.m105924i("MicroMsg.SnsAlbumAdapterHelper", "limitSeq " + str);
            bVar.f279195e = str;
            bVar.f279196f = z2;
            bVar.mo133228a(z);
            SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
        }
        SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }

    /* renamed from: w5 */
    public final void mo133170w5(long j) {
        SnsMethodCalculate.markStartTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
        int i = C94866e1.dy0().mo6418i(this.f279167h);
        C100400e0 Yx0 = C94866e1.Yx0();
        String str = this.f279167h;
        boolean z = this.f279168i;
        Yx0.getClass();
        SnsMethodCalculate.markStartTimeMs("getUserMinSeqByLimitForHistory", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long b002 = Yx0.b00(Yx0.Wa0(false, str, z, false), j, i, false);
        SnsMethodCalculate.markEndTimeMs("getUserMinSeqByLimitForHistory", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        String p0 = C102236a0.m134763p0(b002);
        if (this.f279165f.equals("")) {
            this.f279166g = p0;
        } else {
            this.f279166g = p0.compareTo(this.f279165f) < 0 ? p0 : this.f279165f;
        }
        C50660oc0 l2 = C94866e1.Xx0().mo139782Yt(this.f279167h).mo139769l2();
        long j2 = l2.f139085e;
        if (j2 == 0) {
            Log.m105925i("MicroMsg.SnsAlbumAdapter", "updateLimieSeq getListId=%s limit=%s minSeq=%s mRespMinSeq=%s mLimitSeq=%s faluts.Min=%s faluts.Max=%s", Long.valueOf(j), Integer.valueOf(i), p0, this.f279165f, this.f279166g, Long.valueOf(l2.f139085e), Long.valueOf(l2.f139084d));
            SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            return;
        }
        String p05 = C102236a0.m134763p0(j2);
        if (this.f279166g.equals("")) {
            this.f279166g = p05;
            Log.m105925i("MicroMsg.SnsAlbumAdapter", "updateLimitSeq getListId=%s limit=%s minSeq=%s mRespMinSeq=%s mLimitSeq=%s faluts.Min=%s faluts.Max=%s", Long.valueOf(j), Integer.valueOf(i), p0, this.f279165f, this.f279166g, Long.valueOf(l2.f139085e), Long.valueOf(l2.f139084d));
            SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            return;
        }
        Log.m105925i("MicroMsg.SnsAlbumAdapter", "updateLimieSeq getListId=%s limit=%s minSeq=%s mRespMinSeq=%s mLimitSeq=%s faluts.Min=%s faluts.Max=%s", Long.valueOf(j), Integer.valueOf(i), p0, this.f279165f, this.f279166g, Long.valueOf(l2.f139085e), Long.valueOf(l2.f139084d));
        if (p05.compareTo(this.f279166g) <= 0) {
            p05 = this.f279166g;
        }
        this.f279166g = p05;
        SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
    }
}
