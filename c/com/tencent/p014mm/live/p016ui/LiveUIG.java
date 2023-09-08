package com.tencent.p014mm.live.p016ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/live/ui/LiveUIG;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "b", "c", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.ui.LiveUIG */
public final class LiveUIG extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f108407g = 0;

    /* renamed from: d */
    public final LinkedList<C40334c> f108408d = new LinkedList<>();

    /* renamed from: e */
    public C40330a f108409e;

    /* renamed from: f */
    public ListView f108410f;

    /* renamed from: com.tencent.mm.live.ui.LiveUIG$a */
    public final class C40330a extends BaseAdapter {

        /* renamed from: com.tencent.mm.live.ui.LiveUIG$a$a */
        public static final class C40331a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C40334c f108412d;

            /* renamed from: e */
            public final /* synthetic */ TextView f108413e;

            public C40331a(C40334c cVar, TextView textView) {
                this.f108412d = cVar;
                this.f108413e = textView;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/live/ui/LiveUIG$ChoiceAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f108412d.mo63028b(this.f108413e);
                C117292a.m165361g(this, "com/tencent/mm/live/ui/LiveUIG$ChoiceAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C40330a() {
        }

        public int getCount() {
            return LiveUIG.this.f108408d.size();
        }

        public Object getItem(int i) {
            C40334c cVar = LiveUIG.this.f108408d.get(i);
            C87412m.m108593f(cVar, "selectsList[position]");
            return cVar;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C87412m.m108594g(viewGroup, "parent");
            TextView textView = new TextView(LiveUIG.this);
            C40334c cVar = (C40334c) getItem(i);
            textView.setTag(cVar);
            textView.setText(cVar.mo63027a() + "->:" + cVar.value());
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setHeight(C76577a.m92151b(MMApplicationContext.getContext(), 50));
            if (i % 2 == 1) {
                textView.setBackgroundColor(Color.parseColor("#e2efda"));
            }
            textView.setOnClickListener(new C40331a(cVar, textView));
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.live.ui.LiveUIG$b */
    public final class C40332b implements C40334c {

        /* renamed from: a */
        public String f108414a;

        /* renamed from: b */
        public C72994y1.C72995a f108415b;

        /* renamed from: c */
        public String[] f108416c;

        /* renamed from: d */
        public Object f108417d;

        /* renamed from: e */
        public final /* synthetic */ LiveUIG f108418e;

        /* renamed from: com.tencent.mm.live.ui.LiveUIG$b$a */
        public static final class C40333a implements C76879j.C76888o {

            /* renamed from: a */
            public final /* synthetic */ C40332b f108419a;

            /* renamed from: b */
            public final /* synthetic */ LiveUIG f108420b;

            public C40333a(C40332b bVar, LiveUIG liveUIG) {
                this.f108419a = bVar;
                this.f108420b = liveUIG;
            }

            /* renamed from: a */
            public final void mo5759a(int i, int i2) {
                try {
                    Object obj = this.f108419a.f108417d;
                    if (obj instanceof long[]) {
                        C85801v1 i3 = C86709a0.m107535s().mo121142i();
                        C40332b bVar = this.f108419a;
                        C72994y1.C72995a aVar = bVar.f108415b;
                        Object obj2 = bVar.f108417d;
                        C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.LongArray");
                        i3.mo119677K(aVar, Long.valueOf(((long[]) obj2)[i]));
                    } else if (obj instanceof int[]) {
                        C85801v1 i4 = C86709a0.m107535s().mo121142i();
                        C40332b bVar2 = this.f108419a;
                        C72994y1.C72995a aVar2 = bVar2.f108415b;
                        Object obj3 = bVar2.f108417d;
                        C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.IntArray");
                        i4.mo119677K(aVar2, Integer.valueOf(((int[]) obj3)[i]));
                    }
                    C40330a aVar3 = this.f108420b.f108409e;
                    if (aVar3 != null) {
                        aVar3.notifyDataSetChanged();
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicorMsg.LiveSettingUI", e, "", new Object[0]);
                }
            }
        }

        public C40332b(LiveUIG liveUIG, String str, C72994y1.C72995a aVar, String[] strArr, Object obj) {
            C87412m.m108594g(str, "_showtitle");
            C87412m.m108594g(aVar, "_key");
            C87412m.m108594g(strArr, "_items");
            C87412m.m108594g(obj, "_vals");
            this.f108418e = liveUIG;
            this.f108414a = str;
            this.f108415b = aVar;
            this.f108416c = strArr;
            this.f108417d = obj;
        }

        /* renamed from: a */
        public String mo63027a() {
            return this.f108414a;
        }

        /* renamed from: b */
        public void mo63028b(View view) {
            C87412m.m108594g(view, "view");
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            int length = this.f108416c.length;
            for (int i = 0; i < length; i++) {
                linkedList.add(this.f108416c[i]);
                linkedList2.add(Integer.valueOf(i));
            }
            LiveUIG liveUIG = this.f108418e;
            C76879j.m92732c(liveUIG, "", linkedList, linkedList2, "", new C40333a(this, liveUIG));
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: long[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String value() {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f108417d
                boolean r0 = r0 instanceof long[]
                r1 = 0
                if (r0 == 0) goto L_0x0019
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r2 = r10.f108415b
                r3 = 0
                long r2 = r0.mo119673G(r2, r3)
                int r0 = (int) r2
                goto L_0x0027
            L_0x0019:
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r2 = r10.f108415b
                int r0 = r0.mo119689j(r2, r1)
            L_0x0027:
                r2 = -1
                java.lang.Object r3 = r10.f108417d
                boolean r4 = r3 instanceof int[]
                r5 = 0
                if (r4 == 0) goto L_0x0032
                int[] r3 = (int[]) r3
                goto L_0x0033
            L_0x0032:
                r3 = r5
            L_0x0033:
                if (r3 == 0) goto L_0x0045
                int r4 = r3.length
                r6 = 0
                r7 = 0
            L_0x0038:
                if (r6 >= r4) goto L_0x0045
                r8 = r3[r6]
                int r9 = r7 + 1
                if (r8 != r0) goto L_0x0041
                r2 = r7
            L_0x0041:
                int r6 = r6 + 1
                r7 = r9
                goto L_0x0038
            L_0x0045:
                java.lang.Object r3 = r10.f108417d
                boolean r4 = r3 instanceof long[]
                if (r4 == 0) goto L_0x004e
                r5 = r3
                long[] r5 = (long[]) r5
            L_0x004e:
                if (r5 == 0) goto L_0x0062
                int r3 = r5.length
                r4 = r2
                r2 = 0
            L_0x0053:
                if (r1 >= r3) goto L_0x0061
                r6 = r5[r1]
                int r8 = r2 + 1
                int r7 = (int) r6
                if (r7 != r0) goto L_0x005d
                r4 = r2
            L_0x005d:
                int r1 = r1 + 1
                r2 = r8
                goto L_0x0053
            L_0x0061:
                r2 = r4
            L_0x0062:
                if (r2 < 0) goto L_0x006c
                java.lang.String[] r0 = r10.f108416c
                int r1 = r0.length
                if (r2 >= r1) goto L_0x006c
                r0 = r0[r2]
                goto L_0x006e
            L_0x006c:
                java.lang.String r0 = ""
            L_0x006e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.p016ui.LiveUIG.C40332b.value():java.lang.String");
        }
    }

    /* renamed from: com.tencent.mm.live.ui.LiveUIG$c */
    public interface C40334c {
        /* renamed from: a */
        String mo63027a();

        /* renamed from: b */
        void mo63028b(View view);

        String value();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b7a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.f358582fx1);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ListView");
        this.f108410f = (ListView) findViewById;
        this.f108409e = new C40330a();
        ListView listView = this.f108410f;
        C87412m.m108591d(listView);
        C40330a aVar = this.f108409e;
        if (aVar != null) {
            listView.setAdapter(aVar);
            this.f108408d.add(new C40332b(this, "Live Mode 开关", C72994y1.C72995a.USERINFO_LIVE_MODE_INT_SYNC, new String[]{WeChatBrands.Business.GROUP_OPEN, "close", "default"}, new int[]{1, 2, 0}));
            this.f108408d.add(new C40332b(this, "Live DebugView 开关", C72994y1.C72995a.USERINFO_LIVE_DEBUG_VIEW_INT_SYNC, new String[]{WeChatBrands.Business.GROUP_OPEN, "close", "default"}, new int[]{1, 2, 0}));
            this.f108408d.add(new C40332b(this, "主播自定义房间id", C72994y1.C72995a.USERINFO_LIVE_ANCHOR_CUSTOM_ROOM_ID_INT_SYNC, new String[]{WeChatBrands.Business.GROUP_OPEN, "close", "default"}, new int[]{1, 2, 0}));
            this.f108408d.add(new C40332b(this, "观众自定义房间id", C72994y1.C72995a.USERINFO_LIVE_VISITOR_CUSTOM_ROOM_ID_INT_SYNC, new String[]{WeChatBrands.Business.GROUP_OPEN, "close", "default"}, new int[]{1, 2, 0}));
            this.f108408d.add(new C40332b(this, "Live Entrance 开关", C72994y1.C72995a.USERINFO_LIVE_ENTRANCE_INT_SYNC, new String[]{WeChatBrands.Business.GROUP_OPEN, "close", "default"}, new int[]{1, 2, 0}));
            this.f108408d.add(new C40332b(this, "观众首次微信群直播功能使用条款", C72994y1.C72995a.USERINFO_LIVE_FIRST_VISITOR_INT_SYNC, new String[]{WeChatBrands.Business.GROUP_OPEN, "close"}, new int[]{1, 0}));
            return;
        }
        C87412m.m108603p("adapter");
        throw null;
    }
}
