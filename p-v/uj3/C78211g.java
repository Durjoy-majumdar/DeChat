package uj3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.presenter.C73787b;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.plugin.fav.p047ui.C68924p1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kv1.C99254i;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: uj3.g */
public class C78211g extends RecyclerView.C16613e {

    /* renamed from: f */
    public static C78219f f229160f;

    /* renamed from: g */
    public static C78220g f229161g;

    /* renamed from: d */
    public Context f229162d;

    /* renamed from: e */
    public String f229163e;

    /* renamed from: uj3.g$a */
    public class C78212a extends RecyclerView.C16631z {
        public C78212a(C78211g gVar, View view) {
            super(view);
        }
    }

    /* renamed from: uj3.g$b */
    public static class C78213b extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f229164A;

        /* renamed from: B */
        public TextView f229165B;

        /* renamed from: C */
        public TextView f229166C;

        /* renamed from: D */
        public View f229167D;

        /* renamed from: z */
        public ImageView f229168z;

        /* renamed from: uj3.g$b$a */
        public class C78214a implements View.OnClickListener {
            public C78214a(C78213b bVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (C78211g.f229160f != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    C78211g.f229160f.mo102834b(view, intValue, ((C73787b) C78211g.f229161g).mo102842q(intValue));
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: uj3.g$b$b */
        public class C78215b implements View.OnLongClickListener {
            public C78215b(C78213b bVar) {
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                if (C78211g.f229160f != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    C78211g.f229160f.mo102833a(view, intValue, ((C73787b) C78211g.f229161g).mo102842q(intValue));
                }
                C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        public C78213b(View view) {
            super(view);
            this.f229167D = view;
            this.f229168z = (ImageView) view.findViewById(C0966R.C0970id.cuc);
            this.f229164A = (TextView) view.findViewById(C0966R.C0970id.cvu);
            this.f229165B = (TextView) view.findViewById(C0966R.C0970id.cwv);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.cww);
            this.f229166C = textView;
            textView.setSingleLine(false);
            this.f229166C.setMaxLines(2);
            view.setOnClickListener(new C78214a(this));
            view.setOnLongClickListener(new C78215b(this));
        }

        /* renamed from: y */
        public void mo108236y(TextView textView, String str) {
            if (!Util.isNullOrNil(str)) {
                textView.setText(C99254i.m129306c(textView.getContext(), textView.getText(), str));
            }
        }
    }

    /* renamed from: uj3.g$d */
    public static class C78217d extends C78216c {
        public C78217d(long j) {
            this.f229169a = j;
        }

        /* renamed from: a */
        public int mo102836a() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: d */
        public boolean mo102837d(String str) {
            return false;
        }
    }

    /* renamed from: uj3.g$e */
    public class C78218e extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f229178z;

        public C78218e(C78211g gVar, View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.f357830bz2);
            this.f229178z = textView;
            textView.setTextColor(gVar.f229162d.getResources().getColor(C0966R.color.f3373qe));
            view.findViewById(C0966R.C0970id.br8).setBackgroundColor(gVar.f229162d.getResources().getColor(C0966R.color.f3370q9));
        }
    }

    /* renamed from: uj3.g$f */
    public interface C78219f {
        /* renamed from: a */
        void mo102833a(View view, int i, C78216c cVar);

        /* renamed from: b */
        void mo102834b(View view, int i, C78216c cVar);
    }

    /* renamed from: uj3.g$g */
    public interface C78220g {
        /* renamed from: f */
        void mo102826f(C78213b bVar, int i, int i2);

        /* renamed from: o */
        RecyclerView.C16631z mo102829o(ViewGroup viewGroup, int i);
    }

    /* renamed from: uj3.g$h */
    public static class C78221h extends C78216c {
        /* renamed from: a */
        public int mo102836a() {
            return 2147483646;
        }
    }

    public C78211g(Context context, C78220g gVar) {
        f229161g = gVar;
        this.f229162d = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = ((com.tencent.p014mm.p136ui.chatting.presenter.C73787b) r0).f216572i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getItemCount() {
        /*
            r5 = this;
            uj3.g$g r0 = f229161g
            r1 = 0
            if (r0 != 0) goto L_0x0007
        L_0x0005:
            r0 = 0
            goto L_0x0012
        L_0x0007:
            com.tencent.mm.ui.chatting.presenter.b r0 = (com.tencent.p014mm.p136ui.chatting.presenter.C73787b) r0
            java.util.ArrayList<uj3.g$c> r0 = r0.f216572i
            if (r0 != 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            int r0 = r0.size()
        L_0x0012:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            uj3.g$g r3 = f229161g
            r4 = 1
            if (r3 != 0) goto L_0x001c
            r3 = 1
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r1] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2[r4] = r1
            java.lang.String r1 = "MicroMsg.MediaHistoryListAdapter"
            java.lang.String r3 = " null == mIDetail?%s getItemCount:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uj3.C78211g.getItemCount():int");
    }

    public int getItemViewType(int i) {
        return ((C73787b) f229161g).mo102842q(i).mo102836a();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        int itemViewType = getItemViewType(i);
        C78216c q = ((C73787b) f229161g).mo102842q(i);
        if (itemViewType == Integer.MAX_VALUE) {
            C78216c q2 = ((C73787b) f229161g).mo102842q(i + 1);
            if (i != getItemCount() - 1) {
                if (C74763a.m89510e().mo103933a(new Date(q2.f229169a)) == C74763a.m89510e().mo103933a(new Date(q.f229169a))) {
                    C78218e eVar = (C78218e) zVar;
                    eVar.f229178z.setVisibility(0);
                    eVar.f229178z.setText(C74763a.m89510e().mo103936d(new Date(q.f229169a), this.f229162d));
                    return;
                }
            }
            ((C78218e) zVar).f229178z.setVisibility(8);
        } else if (itemViewType != 2147483646) {
            C78213b bVar = (C78213b) zVar;
            bVar.f229167D.setTag(Integer.valueOf(i));
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(bVar.f229168z, q.f229173e);
            TextView textView = bVar.f229164A;
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = this.f229162d;
            if (Util.isNullOrNil(this.f229163e)) {
                str = Util.isNullOrNil(q.f229175g) ? Util.isNullOrNil(q.f229176h) ? q.f229174f : q.f229176h : q.f229175g;
            } else if (Util.isNullOrNil(q.f229175g)) {
                if (Util.isNullOrNil(q.f229176h)) {
                    str = q.f229174f;
                } else if (Util.isNullOrNil(q.f229174f) || !q.f229174f.contains(this.f229163e)) {
                    str = q.f229176h;
                } else {
                    str = q.f229176h + "(" + q.f229174f + ")";
                }
            } else if (!Util.isNullOrNil(q.f229176h) && q.f229176h.contains(this.f229163e)) {
                str = q.f229175g + "(" + q.f229176h + ")";
            } else if (Util.isNullOrNil(q.f229174f) || !q.f229174f.contains(this.f229163e)) {
                str = q.f229175g;
            } else {
                str = q.f229175g + "(" + q.f229174f + ")";
            }
            textView.setText(hVar.yp0(context, str, bVar.f229164A.getTextSize()));
            bVar.f229165B.setText(C68924p1.m81173b(this.f229162d, q.f229169a));
            bVar.f229166C.setText(q.f229171c);
            f229161g.mo102826f(bVar, i, itemViewType);
            if (!Util.isNullOrNil(this.f229163e)) {
                bVar.mo108236y(bVar.f229164A, this.f229163e);
                bVar.mo108236y(bVar.f229166C, this.f229163e);
            }
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == Integer.MAX_VALUE ? new C78218e(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.au4, viewGroup, false)) : i == 2147483646 ? new C78212a(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ata, viewGroup, false)) : f229161g.mo102829o(viewGroup, i);
    }

    /* renamed from: uj3.g$c */
    public static abstract class C78216c {

        /* renamed from: a */
        public long f229169a;

        /* renamed from: b */
        public int f229170b;

        /* renamed from: c */
        public String f229171c;

        /* renamed from: d */
        public long f229172d;

        /* renamed from: e */
        public String f229173e;

        /* renamed from: f */
        public String f229174f;

        /* renamed from: g */
        public String f229175g;

        /* renamed from: h */
        public String f229176h;

        /* renamed from: i */
        public Pattern f229177i = Pattern.compile("[._a-zA-Z0-9]+");

        public C78216c() {
        }

        /* renamed from: a */
        public int mo102836a() {
            return this.f229170b;
        }

        /* renamed from: b */
        public boolean mo108239b(String str) {
            char[] charArray = str.toCharArray();
            for (char c : charArray) {
                if (c >= 19968 && c <= 40891) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public boolean mo108240c(String str, String str2) {
            if (Util.isNullOrNil(str2)) {
                return false;
            }
            Matcher matcher = this.f229177i.matcher(str2);
            boolean z = false;
            while (matcher.find()) {
                String group = matcher.group();
                boolean startsWith = group.startsWith(str);
                Log.m105925i("MicroMsg.MediaHistoryListAdapter", "[isContains] search:%s group:%s", str, group);
                if (startsWith) {
                    return startsWith;
                }
                z = startsWith;
            }
            return z;
        }

        /* renamed from: d */
        public boolean mo102837d(String str) {
            if (!mo108239b(str)) {
                if (!Util.isNullOrNil(this.f229171c) && mo108240c(str, this.f229171c.toLowerCase())) {
                    return true;
                }
                if (!Util.isNullOrNil(this.f229174f) && mo108240c(str, this.f229174f.toLowerCase())) {
                    return true;
                }
                if (Util.isNullOrNil(this.f229176h) || !mo108240c(str, this.f229176h.toLowerCase())) {
                    return !Util.isNullOrNil(this.f229175g) && mo108240c(str, this.f229175g.toLowerCase());
                }
                return true;
            } else if (!Util.isNullOrNil(this.f229171c) && this.f229171c.toLowerCase().contains(str)) {
                return true;
            } else {
                if (!Util.isNullOrNil(this.f229174f) && this.f229174f.toLowerCase().contains(str)) {
                    return true;
                }
                if (Util.isNullOrNil(this.f229176h) || !this.f229176h.toLowerCase().contains(str)) {
                    return !Util.isNullOrNil(this.f229175g) && this.f229175g.toLowerCase().contains(str);
                }
                return true;
            }
        }

        public boolean equals(Object obj) {
            return (obj == null || !(obj instanceof C78216c)) ? super.equals(obj) : this.f229172d == ((C78216c) obj).f229172d;
        }

        public C78216c(long j, int i, String str, long j2, String str2, String str3, String str4, String str5) {
            this.f229169a = j;
            this.f229170b = i;
            this.f229171c = str;
            this.f229172d = j2;
            this.f229173e = str2;
            this.f229174f = str3;
            this.f229175g = str4;
            this.f229176h = str5;
        }
    }
}
