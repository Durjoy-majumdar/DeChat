package ve1;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55014f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import cy3.C58003b;
import di3.C86312j;
import er1.C7832m3;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C46547x1;
import jq3.C60896i;
import jq3.C60905o;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C49946j51;
import up1.C65412c;
import up1.C65426w0;

/* renamed from: ve1.w */
public final class C14670w extends C60896i<C55014f> {

    /* renamed from: ve1.w$a */
    public static final class C14671a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C55014f f40590d;

        /* renamed from: e */
        public final /* synthetic */ C14670w f40591e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f40592f;

        public C14671a(C55014f fVar, C14670w wVar, C60905o oVar) {
            this.f40590d = fVar;
            this.f40591e = wVar;
            this.f40592f = oVar;
        }

        public final void onClick(View view) {
            Throwable th;
            Class cls = FinderCommonFeatureService.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentFailedNotifyConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C65412c Ex0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Ex0();
            long j = this.f40590d.f154475d;
            Log.m105924i("Finder.FinderActionStorage", "markUnsentCommentsCanRemove " + j);
            C65412c Ex02 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Ex0();
            String str = Ex02.f188253e + " WHERE actionType = 1 and feedId = " + j + " and state = -1 ORDER BY postTime DESC";
            C49712hj1 hj12 = null;
            Cursor rawQuery = Ex02.f188252d.rawQuery(str, (String[]) null, 2);
            LinkedList<C65426w0> linkedList = new LinkedList<>();
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        C65426w0 w0Var = new C65426w0();
                        w0Var.convertFrom(rawQuery);
                        linkedList.add(w0Var);
                    } while (rawQuery.moveToNext());
                }
                C13598b0 b0Var = C13598b0.f38549a;
                C58003b.m67160a(rawQuery, (Throwable) null);
                Log.m105924i("Finder.FinderActionStorage", "getAllFailedCommentsByFeedId " + j + ' ' + str + " listsize:" + linkedList);
                for (C65426w0 w0Var2 : linkedList) {
                    w0Var2.field_canRemove = 1;
                    Ex0.mo89494Yt(w0Var2.field_localCommentId, w0Var2, true);
                }
                C55014f fVar = this.f40590d;
                fVar.f154477f = 1;
                C14670w wVar = this.f40591e;
                C60905o oVar = this.f40592f;
                long j2 = fVar.f154475d;
                String str2 = fVar.f154476e;
                wVar.getClass();
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar.mo12873f(context);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                new C46547x1(j2, str2, 5, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, hj12, 0, (C49946j51) null, false, 122816, (C8480h) null).mo9225i().mo123062e(new C14653v(oVar, j2));
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentFailedNotifyConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } catch (Throwable th4) {
                Throwable th5 = th4;
                C58003b.m67160a(rawQuery, th);
                throw th5;
            }
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6243h;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public void mo44e(C60905o oVar, C55014f fVar, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(fVar, "item");
        if (fVar.f154477f == 1) {
            oVar.mo85817I(C0966R.C0970id.f358781h20, 8);
        } else {
            oVar.mo85817I(C0966R.C0970id.f358781h20, 0);
            View D = oVar.mo85812D(C0966R.C0970id.f358781h20);
            ViewGroup.LayoutParams layoutParams = D.getLayoutParams();
            C85875k4.m106189j0(((TextView) oVar.mo85812D(C0966R.C0970id.gsz)).getPaint(), 0.8f);
            int n = C7832m3.f26372a.mo8946n();
            if (layoutParams.width < n) {
                layoutParams.width = n;
                D.setLayoutParams(layoutParams);
            }
        }
        oVar.mo85812D(C0966R.C0970id.f358781h20).setOnClickListener(new C14671a(fVar, this, oVar));
    }
}
