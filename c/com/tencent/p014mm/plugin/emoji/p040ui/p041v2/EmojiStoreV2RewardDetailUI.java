package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.SquareImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86312j;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import i61.C98601f;
import j20.C117292a;
import j61.C46442p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ob0.C11385n;
import ob0.C117747y;
import p441aq.C92054g;
import pe3.C47465a;
import te3.C49528g80;
import te3.C51178rz1;
import te3.C51759vz1;
import u61.C101964h;
import wh3.C38142q;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI */
public class EmojiStoreV2RewardDetailUI extends MMActivity implements C11385n, AbsListView.OnScrollListener {

    /* renamed from: d */
    public String f110587d;

    /* renamed from: e */
    public String f110588e;

    /* renamed from: f */
    public String f110589f;

    /* renamed from: g */
    public String f110590g;

    /* renamed from: h */
    public View f110591h;

    /* renamed from: i */
    public ImageView f110592i;

    /* renamed from: j */
    public TextView f110593j;

    /* renamed from: n */
    public TextView f110594n;

    /* renamed from: o */
    public TextView f110595o;

    /* renamed from: p */
    public View f110596p;

    /* renamed from: q */
    public ListView f110597q;

    /* renamed from: r */
    public View f110598r;

    /* renamed from: s */
    public C41066c f110599s;

    /* renamed from: t */
    public C51759vz1 f110600t;

    /* renamed from: u */
    public byte[] f110601u;

    /* renamed from: v */
    public C46442p f110602v;

    /* renamed from: w */
    public boolean f110603w = false;

    /* renamed from: x */
    public int f110604x = -1;

    /* renamed from: y */
    public MMHandler f110605y = new C2218a();

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI$a */
    public class C2218a extends MMHandler {
        public C2218a() {
        }

        public void handleMessage(Message message) {
            View view;
            int i = message.what;
            if (i == 1001) {
                View view2 = EmojiStoreV2RewardDetailUI.this.f110598r;
                if (view2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i == 1002 && (view = EmojiStoreV2RewardDetailUI.this.f110598r) != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI$b */
    public class C41065b implements MenuItem.OnMenuItemClickListener {
        public C41065b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EmojiStoreV2RewardDetailUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI$c */
    public class C41066c extends BaseAdapter {

        /* renamed from: d */
        public LinkedList<C49528g80> f110607d;

        /* renamed from: e */
        public boolean f110608e = false;

        /* renamed from: f */
        public int f110609f = 1;

        /* renamed from: g */
        public Context f110610g;

        /* renamed from: h */
        public int f110611h;

        /* renamed from: i */
        public int f110612i;

        /* renamed from: j */
        public Bitmap f110613j = null;

        public C41066c(Context context) {
            this.f110610g = context;
            this.f110612i = C76577a.m92157h(EmojiStoreV2RewardDetailUI.this.getContext(), C0966R.dimen.a3l);
            int A = C76577a.m92145A(EmojiStoreV2RewardDetailUI.this.getContext()) - (C76577a.m92157h(EmojiStoreV2RewardDetailUI.this.getContext(), C0966R.dimen.f3895i6) * 2);
            int i = this.f110612i;
            int h = C76577a.m92157h(EmojiStoreV2RewardDetailUI.this.getContext(), C0966R.dimen.f3906ig);
            int i2 = A / (i + h);
            this.f110609f = (A - (i2 * i)) - ((i2 + -1) * h) > i ? i2 + 1 : i2;
            int A2 = C76577a.m92145A(this.f110610g);
            int i3 = this.f110609f;
            this.f110611h = (int) (((float) (A2 - (this.f110612i * i3))) / (((float) i3) + 1.0f));
            try {
                this.f110613j = BackwardSupportUtil.BitmapFactory.decodeStream(this.f110610g.getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
            } catch (IOException unused) {
                Log.m105925i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "decode stream default avatar failed. %s", Util.getStack());
            }
        }

        /* renamed from: a */
        public void mo64117a(LinkedList<C49528g80> linkedList) {
            if (this.f110607d == null) {
                this.f110607d = new LinkedList<>();
            }
            if (this.f110608e) {
                this.f110607d.clear();
                this.f110608e = false;
            }
            this.f110607d.addAll(linkedList);
            notifyDataSetChanged();
        }

        public int getCount() {
            LinkedList<C49528g80> linkedList = this.f110607d;
            int size = linkedList == null ? 0 : linkedList.size();
            return size > 0 ? (int) Math.ceil((double) (((float) size) / ((float) this.f110609f))) : size;
        }

        public Object getItem(int i) {
            LinkedList<C49528g80> linkedList = this.f110607d;
            if (linkedList == null || i >= linkedList.size()) {
                return null;
            }
            return this.f110607d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LinearLayout linearLayout;
            C41067d dVar;
            C20937c cVar;
            if (view == null || view.getTag() == null) {
                LinearLayout linearLayout2 = new LinearLayout(this.f110610g);
                AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2);
                linearLayout2.setBackgroundResource(C0966R.C0969drawable.ayq);
                linearLayout2.setOrientation(0);
                linearLayout2.setLayoutParams(layoutParams);
                linearLayout2.setPadding(0, 0, 0, this.f110611h);
                dVar = new C41067d(EmojiStoreV2RewardDetailUI.this);
                dVar.f110615a = linearLayout2;
                linearLayout2.setTag(dVar);
                for (int i2 = 0; i2 < this.f110609f; i2++) {
                    int i3 = this.f110612i;
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, i3);
                    layoutParams2.leftMargin = this.f110611h;
                    dVar.f110615a.addView(new SquareImageView(this.f110610g, (AttributeSet) null), i2, layoutParams2);
                }
                linearLayout = linearLayout2;
            } else {
                dVar = (C41067d) view.getTag();
                linearLayout = view;
            }
            int i4 = 0;
            while (true) {
                int i5 = this.f110609f;
                if (i4 >= i5) {
                    return linearLayout;
                }
                int i6 = (i5 * i) + i4;
                SquareImageView squareImageView = (SquareImageView) dVar.f110615a.getChildAt(i4);
                LinkedList<C49528g80> linkedList = this.f110607d;
                C49528g80 g802 = (linkedList == null || i6 >= linkedList.size()) ? null : this.f110607d.get(i6);
                if (g802 != null) {
                    squareImageView.setVisibility(0);
                    if (!Util.isNullOrNil(g802.f133921d)) {
                        C20828a b = C20828a.m22825b();
                        String str = g802.f133921d;
                        String str2 = EmojiStoreV2RewardDetailUI.this.f110587d;
                        int i7 = this.f110612i;
                        int i8 = C98601f.f289098a;
                        String p = EmojiLogic.m117485p(C101964h.m134224f(), str2, str);
                        if (!Util.isNullOrNil(p)) {
                            C20937c.C20939b bVar = new C20937c.C20939b();
                            bVar.f59345a = true;
                            bVar.f59346b = true;
                            bVar.f59350f = p;
                            bVar.f59355k = i7;
                            bVar.f59354j = i7;
                            cVar = bVar.mo32666a();
                        } else {
                            Log.m105928w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
                            cVar = null;
                        }
                        b.mo32519h(str, squareImageView, cVar);
                    } else {
                        squareImageView.setImageBitmap(this.f110613j);
                    }
                } else {
                    squareImageView.setVisibility(8);
                }
                i4++;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI$d */
    public class C41067d {

        /* renamed from: a */
        public LinearLayout f110615a;

        public C41067d(EmojiStoreV2RewardDetailUI emojiStoreV2RewardDetailUI) {
        }
    }

    /* renamed from: e4 */
    public final void mo64113e4(boolean z) {
        if (!this.f110603w && this.f110604x != 0) {
            this.f110602v = new C46442p(this.f110587d, this.f110601u);
            C86709a0.m107529k().f251779b.mo123460f(this.f110602v);
            this.f110603w = true;
            if (z) {
                this.f110605y.sendEmptyMessageDelayed(1002, 200);
            }
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a2y;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.c9e);
        setBackBtn(new C41065b());
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a2z, (ViewGroup) null);
        this.f110591h = inflate;
        this.f110592i = (ImageView) inflate.findViewById(C0966R.C0970id.c2x);
        this.f110593j = (TextView) this.f110591h.findViewById(C0966R.C0970id.i3w);
        this.f110594n = (TextView) this.f110591h.findViewById(C0966R.C0970id.c2y);
        this.f110595o = (TextView) this.f110591h.findViewById(C0966R.C0970id.isg);
        this.f110596p = findViewById(C0966R.C0970id.iwc);
        this.f110597q = (ListView) findViewById(C0966R.C0970id.euq);
        View inflate2 = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a2i, (ViewGroup) null);
        this.f110598r = inflate2;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = inflate2;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f110597q.addHeaderView(this.f110591h);
        this.f110597q.addFooterView(this.f110598r);
        C41066c cVar = new C41066c(this);
        this.f110599s = cVar;
        this.f110597q.setAdapter(cVar);
        this.f110597q.setOnScrollListener(this);
    }

    public void onCreate(Bundle bundle) {
        C38142q qVar;
        super.onCreate(bundle);
        this.f110587d = getIntent().getStringExtra("extra_id");
        this.f110588e = getIntent().getStringExtra("extra_name");
        this.f110589f = getIntent().getStringExtra("extra_iconurl");
        this.f110590g = getIntent().getStringExtra("name");
        initView();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2 h = C30790w2.m39221h();
        synchronized (h.f82769a) {
            qVar = h.f82777i;
        }
        this.f110600t = qVar.mo61539jo(this.f110587d);
        this.f110602v = new C46442p(this.f110587d, this.f110601u);
        C86709a0.m107529k().f251779b.mo123460f(this.f110602v);
        C20828a b = C20828a.m22825b();
        String str = this.f110589f;
        b.mo32519h(str, this.f110592i, C98601f.m128139d(this.f110587d, str));
        this.f110593j.setText(this.f110588e);
        this.f110594n.setText(this.f110590g);
        C51759vz1 vz12 = this.f110600t;
        if (vz12 != null) {
            this.f110595o.setText(getString(C0966R.string.c9f, new Object[]{Integer.valueOf(vz12.f143783e)}));
        }
        C86709a0.m107529k().f251779b.mo123455a(299, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(299, this);
        C20828a.m22825b().mo32525n(0);
    }

    public void onPause() {
        super.onPause();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        View view;
        this.f110603w = false;
        View view2 = this.f110598r;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "loadMoreFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f110605y.removeMessages(1002);
            this.f110605y.sendEmptyMessageDelayed(1001, 200);
        }
        if (yVar.getType() == 299) {
            C46442p pVar = (C46442p) yVar;
            boolean z = true;
            if (i == 0 || i == 4) {
                this.f110601u = pVar.f125099f;
                if (i2 == 0) {
                    this.f110604x = 0;
                    C47465a aVar2 = pVar.f125097d.f127056b.f127083a;
                    if (((C51178rz1) aVar2) != null) {
                        this.f110599s.mo64117a(((C51178rz1) aVar2).f141232e);
                    }
                } else if (i2 == 2) {
                    this.f110604x = 2;
                    C47465a aVar3 = pVar.f125097d.f127056b.f127083a;
                    if (((C51178rz1) aVar3) != null) {
                        this.f110599s.mo64117a(((C51178rz1) aVar3).f141232e);
                    }
                    C41066c cVar = this.f110599s;
                    if (!(cVar == null || (view = this.f110591h) == null)) {
                        int i3 = cVar.f110612i + cVar.f110611h;
                        int height = view.getHeight();
                        int j = C76577a.m92159j(this);
                        Log.m105925i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "item:%d header:%d window:%d", Integer.valueOf(i3), Integer.valueOf(height), Integer.valueOf(j));
                        if (j > (i3 * this.f110599s.getCount()) + height) {
                            z = false;
                        }
                    }
                    if (!z) {
                        mo64113e4(false);
                    }
                } else if (i2 == 3) {
                    this.f110604x = 1;
                    this.f110601u = null;
                    this.f110599s.f110608e = true;
                    mo64113e4(false);
                }
            } else {
                Log.m105929w("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "unknow errType:%d", Integer.valueOf(i));
            }
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            if (this.f110604x == 0 || this.f110603w) {
                Log.m105918d("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "No More List.");
                C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            mo64113e4(true);
            Log.m105924i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "[onScrollStateChanged] loadMoreData.");
            C20828a.m22825b().mo32525n(i);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
