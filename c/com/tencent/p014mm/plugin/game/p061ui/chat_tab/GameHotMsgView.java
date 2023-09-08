package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GameMessageStorageNotifyEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GameLifeSessionStruct;
import com.tencent.p014mm.game.report.C40306c;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.pluginsdk.event.IListenerMStorage;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import cz1.C7143c;
import di3.C86312j;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tl3.C78039a;
import xy1.C15912f;
import xy1.C15913g;
import xy1.C53472h;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView */
public class GameHotMsgView extends MRecyclerView {

    /* renamed from: I1 */
    public static final /* synthetic */ int f114219I1 = 0;

    /* renamed from: C1 */
    public Context f114220C1;

    /* renamed from: D1 */
    public long f114221D1;

    /* renamed from: E1 */
    public long f114222E1;

    /* renamed from: F1 */
    public C42254c f114223F1;

    /* renamed from: G1 */
    public MStorage.IOnStorageChange f114224G1 = new C42252a();

    /* renamed from: H1 */
    public IListenerMStorage f114225H1 = new IListenerMStorage() {
        /* renamed from: e */
        public void mo25931e(IEvent iEvent) {
            if (iEvent instanceof GameMessageStorageNotifyEvent) {
                GameHotMsgView gameHotMsgView = GameHotMsgView.this;
                int i = GameHotMsgView.f114219I1;
                gameHotMsgView.mo66303B1();
            }
        }
    };

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView$a */
    public class C42252a implements MStorage.IOnStorageChange {
        public C42252a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (mStorageEventData.obj instanceof C7143c) {
                GameHotMsgView gameHotMsgView = GameHotMsgView.this;
                int i = GameHotMsgView.f114219I1;
                gameHotMsgView.mo66303B1();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView$b */
    public class C42253b implements C53472h.C53473a {
        public C42253b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView$c */
    public class C42254c extends RecyclerView.C16613e<C42255a> {

        /* renamed from: d */
        public int f114229d;

        /* renamed from: e */
        public List<C42256d> f114230e = new LinkedList();

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView$c$a */
        public class C42255a extends RecyclerView.C16631z {

            /* renamed from: A */
            public boolean f114232A = true;

            /* renamed from: B */
            public ImageView f114233B;

            /* renamed from: C */
            public TextView f114234C;

            /* renamed from: D */
            public TextView f114235D;

            /* renamed from: E */
            public TextView f114236E;

            /* renamed from: z */
            public Map<String, Boolean> f114238z = new HashMap();

            public C42255a(View view) {
                super(view);
                this.f114233B = (ImageView) view.findViewById(C0966R.C0970id.b0r);
                this.f114234C = (TextView) view.findViewById(C0966R.C0970id.b0s);
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.l08);
                this.f114235D = textView;
                textView.setBackgroundResource(C45081s1.m49932a(GameHotMsgView.this.f114220C1));
                this.f114236E = (TextView) view.findViewById(C0966R.C0970id.l0c);
            }
        }

        public C42254c() {
        }

        public int getItemCount() {
            return ((LinkedList) this.f114230e).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C42255a aVar = (C42255a) zVar;
            C42256d dVar = (C42256d) ((LinkedList) this.f114230e).get(i2);
            aVar.f44854d.setOnClickListener(new C42294f(aVar, dVar, i2));
            aVar.f114235D.setVisibility(8);
            aVar.f114236E.setVisibility(8);
            C7143c cVar = dVar.f114240e;
            if (cVar != null) {
                C78039a.m94189a(aVar.f114233B, cVar.field_talker);
                aVar.f114234C.setText(dVar.f114240e.f25116G);
                if (dVar.f114240e.field_unReadCount > 0) {
                    aVar.f114235D.setVisibility(0);
                    int i3 = dVar.f114240e.field_unReadCount;
                    if (i3 > 99) {
                        aVar.f114235D.setText("");
                        aVar.f114235D.setBackgroundResource(C0966R.raw.badge_count_more);
                    } else {
                        aVar.f114235D.setText(String.valueOf(i3));
                        aVar.f114235D.setBackgroundResource(C45081s1.m49933b(GameHotMsgView.this.f114220C1, i3));
                    }
                }
                if (!((HashMap) aVar.f114238z).containsKey(Util.nullAsNil(dVar.f114240e.field_sessionId))) {
                    ((HashMap) aVar.f114238z).put(Util.nullAsNil(dVar.f114240e.field_sessionId), Boolean.TRUE);
                    C15912f X3 = ((C15913g) C86312j.m106911c(C15913g.class)).mo440X3(dVar.f114240e.field_selfUserName);
                    C7143c cVar2 = dVar.f114240e;
                    if (!(cVar2.f25115F == null || X3 == null)) {
                        C40306c.C40307a aVar2 = C40306c.f108374a;
                        int i4 = i2 + 1;
                        int i5 = C42254c.this.f114229d;
                        String str = cVar2.field_sessionId;
                        long D0 = (long) X3.mo422D0();
                        C7143c cVar3 = dVar.f114240e;
                        String str2 = cVar3.field_selfUserName;
                        long j = (long) cVar3.f25115F.field_accountType;
                        String str3 = cVar3.field_talker;
                        long l2 = cVar3.mo8333l2();
                        GameHotMsgView gameHotMsgView = GameHotMsgView.this;
                        String str4 = str2;
                        String str5 = str3;
                        long j2 = gameHotMsgView.f114221D1;
                        if (j2 <= 0) {
                            j2 = gameHotMsgView.f114222E1;
                        }
                        Integer valueOf = Integer.valueOf(dVar.f114240e.field_unReadCount);
                        aVar2.mo62989f(i4, 1, i5, str, D0, str4, j, str5, l2, (long) ((int) j2), (String) null, valueOf);
                    }
                }
            }
            if (aVar.f114232A) {
                aVar.f114232A = false;
                C42254c cVar4 = C42254c.this;
                int i6 = cVar4.f114229d;
                GameHotMsgView gameHotMsgView2 = GameHotMsgView.this;
                long j3 = gameHotMsgView2.f114221D1;
                if (j3 <= 0) {
                    j3 = gameHotMsgView2.f114222E1;
                }
                GameLifeSessionStruct gameLifeSessionStruct = new GameLifeSessionStruct();
                gameLifeSessionStruct.f107922d = 2;
                gameLifeSessionStruct.f107923e = 202;
                gameLifeSessionStruct.f107924f = 0;
                gameLifeSessionStruct.f107925g = 1;
                gameLifeSessionStruct.f107926h = (long) ((int) j3);
                gameLifeSessionStruct.f107933o = (long) i6;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("list_state", i6 == 0 ? 2 : 1);
                gameLifeSessionStruct.mo62729s(URLEncoder.encode(jSONObject.toString()));
                gameLifeSessionStruct.mo86054n();
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C42255a(LayoutInflater.from(GameHotMsgView.this.f114220C1).inflate(C0966R.C0971layout.awk, (ViewGroup) null));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView$d */
    public class C42256d implements Comparable<C42256d> {

        /* renamed from: d */
        public long f114239d;

        /* renamed from: e */
        public C7143c f114240e;

        public C42256d(GameHotMsgView gameHotMsgView, C42252a aVar) {
        }

        public int compareTo(Object obj) {
            return Long.compare(((C42256d) obj).f114239d, this.f114239d);
        }
    }

    public GameHotMsgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo23020y1();
    }

    /* renamed from: B1 */
    public final void mo66303B1() {
        ((C53472h) C86312j.m106911c(C53472h.class)).mo70722Ip(0, 15, new C42253b());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C53472h) C86312j.m106911c(C53472h.class)).mo70729i(this.f114224G1);
        IListenerMStorage.m48928f(GameMessageStorageNotifyEvent.class.getName(), this.f114225H1);
        Log.m105924i("MicroMsg.GameHotMsgView", "onAttachedToWindow");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((C53472h) C86312j.m106911c(C53472h.class)).mo70728g(this.f114224G1);
        IListenerMStorage.m48929g(GameMessageStorageNotifyEvent.class.getName(), this.f114225H1);
        Log.m105924i("MicroMsg.GameHotMsgView", "onDetachedFromWindow");
    }

    /* renamed from: y1 */
    public final void mo23020y1() {
        Context context = getContext();
        this.f114220C1 = context;
        this.f114221D1 = ((Activity) context).getIntent().getLongExtra("game_report_sourceid", 0);
        this.f114222E1 = ((Activity) this.f114220C1).getIntent().getLongExtra("game_report_ssid", 0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f114220C1);
        linearLayoutManager.mo16974W(0);
        setLayoutManager(linearLayoutManager);
        C42254c cVar = new C42254c();
        this.f114223F1 = cVar;
        setAdapter(cVar);
        mo66303B1();
    }

    public GameHotMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo23020y1();
    }
}
