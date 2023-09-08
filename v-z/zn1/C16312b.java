package zn1;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import dp1.C7446m0;
import eb0.C31543z5;
import er1.C7878t0;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.List;
import java.util.Map;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k60.C60979d;
import o40.C61926c;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13604l;
import sx3.C90364q0;
import up1.C27696y;

/* renamed from: zn1.b */
public final class C16312b extends C60896i<C16313c> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d2f;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        long j;
        String str;
        C60905o oVar2 = oVar;
        C16313c cVar2 = (C16313c) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(cVar2, "item");
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.nmn);
        String str2 = cVar2.f43616d.f140920g;
        if (str2 == null || str2.length() == 0) {
            imageView.setImageResource(C0966R.color.BW_0_Alpha_0_1);
        } else {
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
            C11984n0 n0Var = new C11984n0(cVar2.f43616d.f140920g, C27696y.THUMB_IMAGE);
            C87412m.m108593f(imageView, "playListCover");
            f2.mo85957c(n0Var, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.MSG_THUMB));
        }
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.nmp);
        ((TextView) oVar2.mo85812D(C0966R.C0970id.nms)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(oVar2.f173499A, cVar2.f43616d.f140918e));
        long c = (C31543z5.m39453c() / 1000) - ((long) cVar2.f43616d.f140924n);
        Context context = oVar2.f173499A;
        long j2 = ((long) cVar2.f43616d.f140924n) * 1000;
        Map<String, List<String>> map = C7878t0.f26492a;
        synchronized (C7878t0.class) {
            if (j2 < 3600000) {
                str = "";
            } else {
                long a = C31543z5.m39451a();
                if (C7878t0.f26493b.containsKey(Long.valueOf(j2))) {
                    if (a - C7878t0.f26493b.get(Long.valueOf(j2)).longValue() >= 60000) {
                        C7878t0.f26493b.remove(Long.valueOf(j2));
                    } else if (C7878t0.f26494c.containsKey(Long.valueOf(j2))) {
                        str = C7878t0.f26494c.get(Long.valueOf(j2));
                    }
                }
                long j3 = a - j2;
                if (j3 < 0 && j3 > -3600000) {
                    j3 = 0;
                }
                if (j3 < 0) {
                    str = "" + DateFormat.format(context.getString(C0966R.string.f360810ez1), j2);
                    C7878t0.f26494c.put(Long.valueOf(j2), str);
                    C7878t0.f26493b.put(Long.valueOf(j2), Long.valueOf(a));
                } else if (j3 / 3600000 == 0) {
                    int i3 = (int) (j3 / 60000);
                    if (i3 < 1) {
                        i3 = 1;
                    }
                    str = context.getResources().getString(C0966R.string.es4, new Object[]{Integer.valueOf(i3)});
                    C7878t0.f26494c.put(Long.valueOf(j2), str);
                    C7878t0.f26493b.put(Long.valueOf(j2), Long.valueOf(a));
                } else if (j3 <= 86400000) {
                    int i4 = (int) (j3 / 3600000);
                    if (i4 < 1) {
                        i4 = 1;
                    }
                    str = context.getResources().getString(C0966R.string.f360792es0, new Object[]{Integer.valueOf(i4)});
                    C7878t0.f26494c.put(Long.valueOf(j2), str);
                    C7878t0.f26493b.put(Long.valueOf(j2), Long.valueOf(a));
                } else if (j3 <= 172800000) {
                    str = context.getString(C0966R.string.f360813f00);
                    C7878t0.f26494c.put(Long.valueOf(j2), str);
                    C7878t0.f26493b.put(Long.valueOf(j2), Long.valueOf(a));
                } else if (j3 <= 259200000) {
                    str = context.getString(C0966R.string.ezj);
                    C7878t0.f26494c.put(Long.valueOf(j2), str);
                    C7878t0.f26493b.put(Long.valueOf(j2), Long.valueOf(a));
                } else if (j3 <= 2592000000L) {
                    str = context.getResources().getQuantityString(C0966R.plurals.f7231l, (int) (j3 / 86400000), new Object[]{Integer.valueOf((int) (j3 / 86400000))});
                    C7878t0.f26494c.put(Long.valueOf(j2), str);
                    C7878t0.f26493b.put(Long.valueOf(j2), Long.valueOf(a));
                } else if (j3 <= 31536000000L) {
                    j = c;
                    str = context.getResources().getQuantityString(C0966R.plurals.f7232m, (int) (j3 / 2592000000L), new Object[]{Integer.valueOf((int) (j3 / 2592000000L))});
                    C7878t0.f26494c.put(Long.valueOf(j2), str);
                    C7878t0.f26493b.put(Long.valueOf(j2), Long.valueOf(a));
                } else {
                    j = c;
                    str = "" + DateFormat.format(context.getString(C0966R.string.f360810ez1), j2);
                    C7878t0.f26494c.put(Long.valueOf(j2), str);
                    C7878t0.f26493b.put(Long.valueOf(j2), Long.valueOf(a));
                }
            }
            j = c;
        }
        String string = oVar2.f173499A.getString(C0966R.string.f360735mx1);
        C87412m.m108593f(string, "holder.context.getString…g.finder_playlist_update)");
        if (j < 31536000) {
            str = str + string;
        }
        String string2 = oVar2.f173499A.getString(C0966R.string.mwv, new Object[]{Integer.valueOf(cVar2.f43616d.f140921h)});
        C87412m.m108593f(string2, "holder.context.getString…info.feed_count\n        )");
        String string3 = oVar2.f173499A.getString(C0966R.string.mww, new Object[]{str});
        C87412m.m108593f(string3, "holder.context.getString…   finalTimeStr\n        )");
        C87412m.m108593f(str, "finalTimeStr");
        if (str.length() > 0) {
            string2 = string2 + ' ' + string3;
        }
        textView.setText(string2);
        C7446m0 m0Var = C7446m0.f25635a;
        View view = oVar2.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C7446m0.m7572b(m0Var, view, "collection_card", 0, 0, C90364q0.m113147f(new C13604l("collection_id", C61926c.m72691p(cVar2.f43616d.f140917d)), new C13604l("collection_location_id", Integer.valueOf(i))), 12, (Object) null);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
