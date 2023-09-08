package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gy3.C87412m;
import i61.C76300m;
import j20.C117292a;
import j61.C33520k;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import n61.C100077a0;
import n61.C100079b0;
import n61.C100083c0;
import n61.C100086d0;
import n61.C100090f;
import n61.C100102v;
import n61.C100103w;
import n61.C100104x;
import n61.C100105y;
import n61.C100106z;
import ob0.C11385n;
import ob0.C117747y;
import p61.C100645f0;
import p61.C100656i0;
import p61.C100659j0;
import p61.C100674s;
import p61.C100684y;
import p910lj.C76701a;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C101800k70;
import te3.C51755vy1;
import yl0.C91481e;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "<init>", "()V", "a", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI */
public final class EmojiStoreV3SingleProductAlbumUI extends MMActivity implements C11385n {

    /* renamed from: z */
    public static final /* synthetic */ int f269019z = 0;

    /* renamed from: d */
    public final String f269020d = "MicroMsg.EmojiStoreV3SingleProductAlbumUI";

    /* renamed from: e */
    public EmojiStoreV3SingleProductRecyclerView f269021e;

    /* renamed from: f */
    public C100674s f269022f;

    /* renamed from: g */
    public View f269023g;

    /* renamed from: h */
    public String f269024h = "";

    /* renamed from: i */
    public String f269025i = "";

    /* renamed from: j */
    public String f269026j = "";

    /* renamed from: n */
    public String f269027n = "";

    /* renamed from: o */
    public int f269028o = 6;

    /* renamed from: p */
    public String f269029p = "";

    /* renamed from: q */
    public int f269030q = -1;

    /* renamed from: r */
    public byte[] f269031r;

    /* renamed from: s */
    public C93267a f269032s = C93267a.NEED_LOAD_MORE;

    /* renamed from: t */
    public boolean f269033t = true;

    /* renamed from: u */
    public int f269034u = -1;

    /* renamed from: v */
    public boolean f269035v = true;

    /* renamed from: w */
    public boolean f269036w;

    /* renamed from: x */
    public boolean f269037x;

    /* renamed from: y */
    public final int f269038y = 2002;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI$a */
    public enum C93267a {
        NEED_LOAD_MORE,
        FINISH,
        LOADING
    }

    /* renamed from: H7 */
    public final void mo127896H7() {
        if (this.f269032s != C93267a.FINISH) {
            Log.m105918d(this.f269020d, "try to pre load more");
            setBounceEnabled(false);
            EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = this.f269021e;
            if (emojiStoreV3SingleProductRecyclerView != null) {
                emojiStoreV3SingleProductRecyclerView.post(new C100086d0(this));
            }
            mo127897I7();
        }
    }

    /* renamed from: I7 */
    public final void mo127897I7() {
        if (C93267a.NEED_LOAD_MORE == this.f269032s) {
            C86709a0.m107529k().f251779b.mo123460f(new C33520k(5, 0, 0, (String) null, this.f269030q, this.f269031r));
            this.f269032s = C93267a.LOADING;
        }
    }

    /* renamed from: J7 */
    public final void mo127898J7(List<C101800k70> list, boolean z) {
        if (list == null || list.isEmpty()) {
            Log.m105924i(this.f269020d, "updateAdapterData failed, data error");
            return;
        }
        C100674s sVar = this.f269022f;
        if (sVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
            for (C101800k70 k702 : list) {
                C100659j0 j0Var = new C100659j0();
                j0Var.f294877a = k702;
                arrayList2.add(j0Var);
            }
            arrayList.addAll(arrayList2);
            if (z) {
                int itemCount = sVar.getItemCount();
                sVar.f294957e.addAll(arrayList);
                sVar.notifyItemRangeChanged(itemCount, arrayList.size());
                return;
            }
            sVar.f294957e.clear();
            sVar.f294957e.addAll(arrayList);
            sVar.notifyDataSetChanged();
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ckm;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            if (i2 == -1) {
                C75026b.m89951a(this, getContext().getString(C0966R.string.a2x));
            } else {
                String str = this.f269020d;
                Log.m105924i(str, "onActivityResult failed, START_SINGLE_PRODUCT_DIALOG, resultCode:" + i2);
            }
        } else if (i == this.f269038y) {
            if (i2 == -1) {
                String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
                if (!Util.isNullOrNil(stringExtra)) {
                    String str2 = this.f269020d;
                    Log.m105918d(str2, ".." + stringExtra);
                    C76300m.m91727c(this, stringExtra, 27, this.f269030q, this.f269024h, this.f269025i, this.f269026j, this.f269027n, this.f269028o);
                }
            } else {
                String str3 = this.f269020d;
                Log.m105924i(str3, "onActivityResult failed, SELECT_CONTACT_SHARED, resultCode:" + i2);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105918d(this.f269020d, "onCreate");
        Log.m105924i(this.f269020d, "handleIntent");
        this.f269030q = getIntent().getIntExtra("set_id", -1);
        String stringExtra = getIntent().getStringExtra("set_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f269024h = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("set_desc");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f269025i = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("set_iconURL");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f269026j = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("headurl");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f269027n = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("sns_object_data");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f269029p = stringExtra5;
        if (!Util.isNullOrNil(stringExtra5)) {
            this.f269030q = EmojiLogic.m117479j(this.f269029p);
            String k = EmojiLogic.m117480k(this.f269029p);
            C87412m.m108593f(k, "getEmojiPageTitle(snsObjectData)");
            this.f269024h = k;
            String h = EmojiLogic.m117477h(this.f269029p);
            C87412m.m108593f(h, "getEmojiPageIconUrl(snsObjectData)");
            this.f269026j = h;
            String g = EmojiLogic.m117476g(this.f269029p);
            C87412m.m108593f(g, "getEmojiPageDesc(snsObjectData)");
            this.f269025i = g;
            String i = EmojiLogic.m117478i(this.f269029p);
            C87412m.m108593f(i, "getEmojiPageSecondUrl(snsObjectData)");
            this.f269027n = i;
            this.f269028o = EmojiLogic.m117481l(this.f269029p);
        }
        this.f269034u = getIntent().getIntExtra("entrance_scene", CdnLogic.kMediaTypeFavoriteBigFile);
        setMMTitle("");
        setBackBtn(new C100079b0(this));
        setActionbarColor(C76577a.m92153d(getContext(), C0966R.color.BW_100));
        if (!C87412m.m108589b(this.f269026j, "")) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_share, new C100083c0(this));
        }
        View findViewById = findViewById(C0966R.C0970id.g2z);
        this.f269023g = findViewById;
        if (findViewById != null) {
            findViewById.setBackgroundResource(C0966R.color.BW_100);
        }
        this.f269021e = (EmojiStoreV3SingleProductRecyclerView) findViewById(C0966R.C0970id.f359221m73);
        C100656i0 i0Var = new C100656i0();
        int i2 = i0Var.f294934c;
        C100090f fVar = new C100090f((int) getResources().getDimension(C0966R.dimen.f3736cp), 0, C87412m.m108589b(this.f269024h, "") ^ true ? 1 : 0, i0Var);
        EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = this.f269021e;
        if (emojiStoreV3SingleProductRecyclerView != null) {
            emojiStoreV3SingleProductRecyclerView.setSizeResolver(i0Var);
        }
        EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView2 = this.f269021e;
        if (emojiStoreV3SingleProductRecyclerView2 != null) {
            emojiStoreV3SingleProductRecyclerView2.mo17085h0(fVar);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, i2);
        gridLayoutManager.f44666B = new C100103w(this, gridLayoutManager);
        EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView3 = this.f269021e;
        if (emojiStoreV3SingleProductRecyclerView3 != null) {
            emojiStoreV3SingleProductRecyclerView3.setLayoutManager(gridLayoutManager);
        }
        C100674s sVar = new C100674s(this, new ArrayList());
        this.f269022f = sVar;
        EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView4 = this.f269021e;
        if (emojiStoreV3SingleProductRecyclerView4 != null) {
            emojiStoreV3SingleProductRecyclerView4.setAdapter(sVar);
        }
        C100674s sVar2 = this.f269022f;
        if (sVar2 != null) {
            sVar2.f294962j = i2;
        }
        if (sVar2 != null) {
            sVar2.f294960h = new C100104x(this);
        }
        C100674s sVar3 = this.f269022f;
        if (sVar3 != null) {
            sVar3.f294961i = new C100105y(this);
        }
        C100674s sVar4 = this.f269022f;
        if (sVar4 != null) {
            sVar4.f294959g = new C100106z(this);
        }
        if (sVar4 != null) {
            sVar4.f294966q = new C100077a0(this);
        }
        View view = this.f269023g;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView5 = this.f269021e;
        if (emojiStoreV3SingleProductRecyclerView5 != null) {
            emojiStoreV3SingleProductRecyclerView5.setVisibility(8);
        }
        mo127897I7();
        C86709a0.m107529k().f251779b.mo123455a(C91481e.CTRL_INDEX, this);
        C115669n.INSTANCE.mo160131h(12740, 4, "", "", 0, Integer.valueOf(this.f269034u), 29);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105918d(this.f269020d, "onDestroy");
        C86709a0.m107529k().f251779b.mo123470p(C91481e.CTRL_INDEX, this);
    }

    public void onPause() {
        super.onPause();
        this.f269036w = true;
    }

    public void onResume() {
        super.onResume();
        if (this.f269036w && !this.f269037x) {
            this.f269036w = false;
            C100674s sVar = this.f269022f;
            if (sVar != null) {
                EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = this.f269021e;
                sVar.mo140112F4(emojiStoreV3SingleProductRecyclerView != null ? emojiStoreV3SingleProductRecyclerView.getLayoutManager() : null);
            }
        }
        this.f269037x = false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        List<C100684y> list;
        View view = this.f269023g;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductAlbumUI", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = this.f269021e;
        if (emojiStoreV3SingleProductRecyclerView != null) {
            emojiStoreV3SingleProductRecyclerView.setVisibility(0);
        }
        byte[] bArr = null;
        Integer valueOf = yVar != null ? Integer.valueOf(yVar.getType()) : null;
        String str2 = this.f269020d;
        Log.m105924i(str2, "type:" + valueOf + ", errType:" + i + ", errCode:" + i2);
        if (valueOf != null && valueOf.intValue() == 821) {
            C93267a aVar2 = C93267a.NEED_LOAD_MORE;
            C100674s sVar = this.f269022f;
            if ((sVar != null && sVar.getItemCount() == 0) && !C87412m.m108589b(this.f269024h, "")) {
                C100645f0 f0Var = new C100645f0();
                String str3 = this.f269025i;
                C87412m.m108594g(str3, "<set-?>");
                f0Var.f294843b = str3;
                String str4 = this.f269024h;
                C87412m.m108594g(str4, "<set-?>");
                f0Var.f294842a = str4;
                C100674s sVar2 = this.f269022f;
                if (!(sVar2 == null || (list = sVar2.f294957e) == null)) {
                    list.add(0, f0Var);
                }
                C100674s sVar3 = this.f269022f;
                if (sVar3 != null) {
                    sVar3.notifyItemChanged(0);
                }
            }
            C33520k kVar = yVar instanceof C33520k ? (C33520k) yVar : null;
            C51755vy1 j1 = kVar != null ? kVar.mo59184j1() : null;
            LinkedList<C101800k70> linkedList = j1 != null ? j1.f143767d : null;
            C100674s sVar4 = this.f269022f;
            if (sVar4 != null && (!sVar4.f294957e.isEmpty()) && ((C100684y) C110818d0.m150923U(sVar4.f294957e)).getType() == 8) {
                sVar4.notifyItemChanged(sVar4.getItemCount() - 1, Boolean.TRUE);
                sVar4.notifyItemRemoved(sVar4.getItemCount() - 1);
                sVar4.f294957e.remove(sVar4.getItemCount() - 1);
                Log.m105918d(sVar4.f294958f, "removeBottomLoadingUI");
            }
            setBounceEnabled(true);
            if (i == 0 || i == 4) {
                String str5 = this.f269020d;
                StringBuilder sb = new StringBuilder();
                sb.append("onSceneEnd data size:");
                sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
                Log.m105918d(str5, sb.toString());
                if (i2 == 0) {
                    this.f269032s = C93267a.FINISH;
                    mo127898J7(linkedList, true);
                } else if (i2 == 2) {
                    this.f269032s = aVar2;
                    mo127898J7(linkedList, true);
                } else if (i2 != 3) {
                    C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.c_z), 0).show();
                } else {
                    this.f269032s = aVar2;
                    mo127898J7(linkedList, false);
                }
            } else {
                C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.c_z), 0).show();
            }
            if (kVar != null) {
                bArr = kVar.f90755h;
            }
            this.f269031r = bArr;
            if (this.f269035v) {
                this.f269035v = false;
                this.f269036w = false;
                C119179t tVar = C119157j.f356862d;
                C100102v vVar = new C100102v(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(vVar, 500, false);
            }
            if (this.f269033t) {
                mo127896H7();
                this.f269033t = false;
            }
        }
    }
}
