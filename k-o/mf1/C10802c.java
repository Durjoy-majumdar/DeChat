package mf1;

import android.content.Context;
import android.view.View;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedStickyEvent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.Iterator;
import je1.C9385w3;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C77407n;
import vp1.C65834e;

/* renamed from: mf1.c */
public final class C10802c implements C11385n {

    /* renamed from: d */
    public BaseFinderFeedLoader f32286d;

    /* renamed from: e */
    public int f32287e;

    /* renamed from: f */
    public Context f32288f;

    /* renamed from: g */
    public C77407n f32289g;

    /* renamed from: h */
    public BaseFinderFeed f32290h;

    /* renamed from: mf1.c$a */
    public static final class C10803a implements C76912y0.C61776j {

        /* renamed from: a */
        public static final C10803a f32291a = new C10803a();

        /* renamed from: a */
        public final void mo596a(View view) {
            ((WeImageView) view.findViewById(C0966R.C0970id.kpx)).setImageResource(C0966R.raw.icons_filled_top_off);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        r10 = r10.event;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11041a(android.content.Context r8, boolean r9, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r10) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "feed"
            gy3.C87412m.m108594g(r10, r0)
            r7.f32288f = r8
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r4 = r0.mo90662O5()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r10.mo3513o()
            long r0 = r0.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r10 = r10.objectDesc
            if (r10 == 0) goto L_0x002d
            te3.ef1 r10 = r10.event
            if (r10 == 0) goto L_0x002d
            long r2 = r10.f132898d
            goto L_0x002f
        L_0x002d:
            r2 = 0
        L_0x002f:
            if (r9 == 0) goto L_0x0033
            r9 = 3
            goto L_0x0034
        L_0x0033:
            r9 = 4
        L_0x0034:
            je1.w3 r10 = new je1.w3
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            rs1.s8 r0 = r0.mo12873f(r8)
            if (r0 == 0) goto L_0x004b
            te3.hj1 r0 = r0.mo12861q3()
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r6 = r0
            r1 = r10
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            android.content.res.Resources r9 = r8.getResources()
            r0 = 2131830090(0x7f11254a, float:1.9293168E38)
            java.lang.String r9 = r9.getString(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r10.mo85584j1(r8, r9, r0)
            ob0.b0 r8 = f40.C86709a0.m107524d()
            r8.mo123460f(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mf1.C10802c.mo11041a(android.content.Context, boolean, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        C9385w3 w3Var;
        int i3;
        DataBuffer dataListJustForAdapter;
        Object obj;
        boolean z;
        if (i2 == -4061) {
            str2 = MMApplicationContext.getContext().getString(C0966R.string.eq9);
            C87412m.m108593f(str2, "getContext().getString(R…ed_failed_private_reason)");
        } else if (i2 == -4060) {
            str2 = MMApplicationContext.getContext().getString(C0966R.string.eq_);
            C87412m.m108593f(str2, "getContext().getString(R…icky_feed_failed_reason1)");
        } else if (i2 != -4057) {
            if (i2 == 0 && (yVar instanceof C9385w3) && ((i3 = w3Var.f29316g) == 3 || i3 == 4)) {
                boolean z2 = i3 == 3;
                Long l = (w3Var = (C9385w3) yVar).f29317h;
                long longValue = l != null ? l.longValue() : 0;
                int e = z2 ? C31543z5.m39455e() : 0;
                FinderItem e2 = C65834e.f189316a.mo89871e(longValue);
                if (e2 != null) {
                    e2.setStickyTime(e);
                }
                BaseFinderFeedLoader baseFinderFeedLoader = this.f32286d;
                if (!(baseFinderFeedLoader == null || (dataListJustForAdapter = baseFinderFeedLoader.getDataListJustForAdapter()) == null)) {
                    Iterator it = dataListJustForAdapter.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        C0740i2 i2Var = (C0740i2) obj;
                        C87412m.m108592e(i2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        if (((BaseFinderFeed) i2Var).getItemId() == longValue) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    C0740i2 i2Var2 = (C0740i2) obj;
                    if (i2Var2 != null) {
                        ((BaseFinderFeed) i2Var2).mo3513o().getFinderObject().stickyTime = e;
                    }
                }
                FeedStickyEvent feedStickyEvent = new FeedStickyEvent();
                FeedStickyEvent.C1040a aVar = feedStickyEvent.f9169d;
                aVar.f9172c = 1001;
                aVar.f9170a = longValue;
                aVar.f9171b = e;
                feedStickyEvent.publish();
                Context context = this.f32288f;
                if (context != null) {
                    if (z2) {
                        C76912y0.m92766e(context, context.getString(C0966R.string.eqa), C10784a.f32255a);
                    } else {
                        C76912y0.m92766e(context, context.getString(C0966R.string.d2v), C10792b.f32272a);
                    }
                }
            }
            str2 = "";
        } else {
            str2 = MMApplicationContext.getContext().getString(C0966R.string.eq8, new Object[]{Integer.valueOf(this.f32287e)});
            C87412m.m108593f(str2, "getContext().getString(R…imit_reason, maxTopCount)");
        }
        if (!Util.isNullOrNil(str2)) {
            C76912y0.m92766e(MMApplicationContext.getContext(), str2, C10803a.f32291a);
        }
    }
}
