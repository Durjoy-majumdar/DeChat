package h51;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c51.C39890a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader_app.search.DownloadSearchListView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wechat.aff.ting.TingClientProto;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import g51.C45880a;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nd3.C47223a;
import p385u2.C111105a;
import z41.C53736a;

/* renamed from: h51.a */
public class C46004a extends RecyclerView.C16613e<C46005a> {

    /* renamed from: d */
    public Context f124052d;

    /* renamed from: e */
    public DownloadSearchListView f124053e;

    /* renamed from: f */
    public ArrayList<C46012e> f124054f = new ArrayList<>();

    /* renamed from: h51.a$a */
    public class C46005a extends RecyclerView.C16631z {

        /* renamed from: A */
        public View f124055A;

        /* renamed from: B */
        public View f124056B = this.f124071z.findViewById(C0966R.C0970id.j5p);

        /* renamed from: C */
        public TextView f124057C = ((TextView) this.f124071z.findViewById(C0966R.C0970id.j64));

        /* renamed from: D */
        public ImageView f124058D;

        /* renamed from: E */
        public View f124059E;

        /* renamed from: F */
        public ImageView f124060F;

        /* renamed from: G */
        public Button f124061G;

        /* renamed from: H */
        public TextView f124062H;

        /* renamed from: I */
        public LinearLayout f124063I;

        /* renamed from: J */
        public TextView f124064J;

        /* renamed from: K */
        public TextView f124065K;

        /* renamed from: L */
        public TextView f124066L;

        /* renamed from: M */
        public TextView f124067M;

        /* renamed from: N */
        public TextView f124068N;

        /* renamed from: P */
        public TextView f124069P;

        /* renamed from: z */
        public View f124071z;

        /* renamed from: h51.a$a$a */
        public class C46006a implements View.OnClickListener {
            public C46006a(C46004a aVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C46004a.this.f124053e.mo64047C1();
                C45880a.m51163b(13, TingClientProto.TingScene.TingScene_ChatMusicSearch_VALUE, 21, 81, "", "", "");
                C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: h51.a$a$b */
        public class C46007b implements View.OnClickListener {
            public C46007b(C46004a aVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C46012e eVar = (C46012e) view.getTag();
                C46004a.this.f124053e.mo64048D1(eVar.f124082b);
                C45880a.m51163b(13, TingClientProto.TingScene.TingScene_ChatMusicSearch_VALUE, eVar.f124090j, 81, "", "", "");
                C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: h51.a$a$c */
        public class C46008c implements View.OnClickListener {
            public C46008c(C46004a aVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C46012e eVar = (C46012e) view.getTag();
                C46004a.this.f124053e.mo64046B1(eVar.f124082b);
                if (C46004a.this.f124052d.getResources().getString(C0966R.string.g4y).equals(C46005a.this.f124061G.getText().toString())) {
                    C39890a.m42669b(C46004a.this.f124052d, eVar.f124096p, eVar.f124084d, eVar.f124097q);
                    C45880a.m51163b(13, 1303, eVar.f124090j, 22, eVar.f124084d, "", "");
                } else if (C46004a.this.f124052d.getResources().getString(C0966R.string.frb).equals(C46005a.this.f124061G.getText().toString())) {
                    C53736a d = C40933j.m44315d(eVar.f124084d);
                    if (d == null) {
                        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (C86013q1.m106450k(d.field_filePath)) {
                        C39890a.m42668a(d.field_downloadId, false, (C47223a) null);
                        C45880a.m51163b(13, 1303, eVar.f124090j, 44, eVar.f124084d, "", "");
                    }
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("appId", eVar.f124084d);
                    intent.addFlags(67108864);
                    ((C45547h) C86312j.m106911c(C45547h.class)).p30(C46004a.this.f124052d, intent, (C45544c) null);
                    C45880a.m51163b(13, 1303, eVar.f124090j, 23, eVar.f124084d, "", "");
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C46005a(View view) {
            super(view);
            this.f124071z = view;
            this.f124055A = view.findViewById(C0966R.C0970id.j5m);
            ((TextView) this.f124071z.findViewById(C0966R.C0970id.ewd)).setOnClickListener(new C46006a(C46004a.this));
            ImageView imageView = (ImageView) this.f124071z.findViewById(C0966R.C0970id.j5a);
            this.f124058D = imageView;
            imageView.setOnClickListener(new C46007b(C46004a.this));
            this.f124059E = this.f124071z.findViewById(C0966R.C0970id.j6v);
            this.f124060F = (ImageView) this.f124071z.findViewById(C0966R.C0970id.f6037vj);
            Button button = (Button) this.f124071z.findViewById(C0966R.C0970id.f358467fa3);
            this.f124061G = button;
            button.setOnClickListener(new C46008c(C46004a.this));
            this.f124062H = (TextView) this.f124071z.findViewById(C0966R.C0970id.f6057w4);
            this.f124063I = (LinearLayout) this.f124071z.findViewById(C0966R.C0970id.f6069wf);
            this.f124064J = (TextView) this.f124071z.findViewById(C0966R.C0970id.f6065wb);
            this.f124065K = (TextView) this.f124071z.findViewById(C0966R.C0970id.mdf);
            this.f124066L = (TextView) this.f124071z.findViewById(C0966R.C0970id.m9t);
            this.f124067M = (TextView) this.f124071z.findViewById(C0966R.C0970id.m9u);
            this.f124068N = (TextView) this.f124071z.findViewById(C0966R.C0970id.m_i);
            this.f124069P = (TextView) this.f124071z.findViewById(C0966R.C0970id.m_j);
        }

        /* renamed from: y */
        public final void mo71422y(int i) {
            if (i == C0966R.string.frb) {
                this.f124061G.setBackgroundResource(C0966R.C0969drawable.f4656j8);
                this.f124061G.setTextColor(C111105a.m151500b(C46004a.this.f124052d, C0966R.color.al6));
            } else {
                this.f124061G.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                this.f124061G.setTextColor(C111105a.m151500b(C46004a.this.f124052d, C0966R.color.Brand_90));
            }
            this.f124061G.setText(i);
        }
    }

    public C46004a(Context context, DownloadSearchListView downloadSearchListView) {
        this.f124052d = context;
        this.f124053e = downloadSearchListView;
    }

    public int getItemCount() {
        return this.f124054f.size();
    }

    public int getItemViewType(int i) {
        return this.f124054f.get(i).f124081a;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        C46005a aVar = (C46005a) zVar;
        C46012e eVar = this.f124054f.get(i);
        aVar.getClass();
        int i2 = eVar.f124081a;
        if (i2 == 1) {
            View view = aVar.f124055A;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = aVar.f124056B;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = aVar.f124059E;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i2 == 2) {
            View view7 = aVar.f124055A;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view9 = aVar.f124056B;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view11 = aVar.f124059E;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(8);
            View view12 = view11;
            C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            aVar.f124057C.setText(eVar.f124082b);
            aVar.f124058D.setTag(eVar);
        } else if (i2 == 3) {
            View view13 = aVar.f124055A;
            C9556a aVar8 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar8.mo10233c(8);
            View view14 = view13;
            C117292a.m165358d(view14, aVar8.mo10232b(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view15 = aVar.f124056B;
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(8);
            View view16 = view15;
            C117292a.m165358d(view16, aVar9.mo10232b(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view17 = aVar.f124059E;
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(0);
            View view18 = view17;
            C117292a.m165358d(view18, aVar10.mo10232b(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view17.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view18, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C20828a.m22825b().mo32518g(eVar.f124086f, aVar.f124060F);
            aVar.f124062H.setText(Html.fromHtml(eVar.f124085e));
            aVar.f124063I.removeAllViews();
            if (!Util.isNullOrNil((List) eVar.f124087g)) {
                int i3 = 0;
                while (i3 < ((LinkedList) eVar.f124087g).size() && i3 <= 2) {
                    View inflate = LayoutInflater.from(C46004a.this.f124052d).inflate(C0966R.C0971layout.f360029c82, (ViewGroup) null);
                    ((TextView) inflate.findViewById(C0966R.C0970id.kee)).setText((CharSequence) ((LinkedList) eVar.f124087g).get(i3));
                    aVar.f124063I.addView(inflate);
                    i3++;
                }
            }
            TextView textView = aVar.f124064J;
            long j = eVar.f124088h;
            if (j >= 1073741824) {
                str = String.format("%.1fGB", new Object[]{Float.valueOf(((((float) j) / 1024.0f) / 1024.0f) / 1024.0f)});
            } else if (j >= 1048576) {
                str = String.format("%.1fMB", new Object[]{Float.valueOf((((float) j) / 1024.0f) / 1024.0f)});
            } else {
                str = String.format("%.2fMB", new Object[]{Float.valueOf((((float) j) / 1024.0f) / 1024.0f)});
            }
            textView.setText(str);
            aVar.f124061G.setTag(eVar);
            int i4 = eVar.f124083c;
            if (i4 == 1) {
                aVar.mo71422y(C0966R.string.c0e);
            } else if (i4 == 2) {
                aVar.mo71422y(C0966R.string.g4y);
            } else if (i4 == 3) {
                aVar.mo71422y(C0966R.string.k7_);
            } else if (i4 == 4) {
                aVar.mo71422y(C0966R.string.frb);
            }
            TextView textView2 = aVar.f124065K;
            textView2.setText(C46004a.this.f124052d.getResources().getString(C0966R.string.lu_) + eVar.f124091k);
            TextView textView3 = aVar.f124066L;
            textView3.setText(C46004a.this.f124052d.getResources().getString(C0966R.string.m19) + eVar.f124092l);
            TextView textView4 = aVar.f124067M;
            textView4.setText(Html.fromHtml(eVar.f124085e + " " + eVar.f124093m));
            aVar.f124068N.setOnClickListener(new C46009b(aVar, eVar));
            aVar.f124069P.setOnClickListener(new C46010c(aVar, eVar));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46005a(LayoutInflater.from(this.f124052d).inflate(C0966R.C0971layout.bvd, viewGroup, false));
    }
}
