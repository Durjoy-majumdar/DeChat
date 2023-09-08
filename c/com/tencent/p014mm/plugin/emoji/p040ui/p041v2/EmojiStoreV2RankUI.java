package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.os.Bundle;
import android.widget.AbsListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.BaseEmojiStoreUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import i61.C98605n;
import j20.C117292a;
import j61.C46443q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import q61.C101038b;
import te3.C101754a80;
import te3.C101824o80;
import te3.C51976xh3;
import w51.C102336f;
import x51.C102554b;
import x51.C102562g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RankUI */
public class EmojiStoreV2RankUI extends BaseEmojiStoreUI {

    /* renamed from: I */
    public EmoticonStoreActionStruct f268831I = new EmoticonStoreActionStruct();

    /* renamed from: J */
    public boolean f268832J = true;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RankUI$a */
    public class C68864a implements AbsListView.OnScrollListener {
        public C68864a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RankUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RankUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RankUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0) {
                EmojiStoreV2RankUI.m117695j8(EmojiStoreV2RankUI.this);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RankUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RankUI$b */
    public class C68865b implements Runnable {
        public C68865b() {
        }

        public void run() {
            EmojiStoreV2RankUI.m117695j8(EmojiStoreV2RankUI.this);
        }
    }

    /* renamed from: j8 */
    public static void m117695j8(EmojiStoreV2RankUI emojiStoreV2RankUI) {
        emojiStoreV2RankUI.getClass();
        try {
            int firstVisiblePosition = emojiStoreV2RankUI.f268287i.getFirstVisiblePosition();
            int lastVisiblePosition = emojiStoreV2RankUI.f268287i.getLastVisiblePosition();
            if (lastVisiblePosition - firstVisiblePosition > 0) {
                LinkedList linkedList = new LinkedList();
                while (firstVisiblePosition < lastVisiblePosition) {
                    C102562g g = emojiStoreV2RankUI.f268288j.getItem(firstVisiblePosition);
                    if (g != null) {
                        C101824o80 o802 = g.f301983b;
                        if (o802 != null) {
                            linkedList.add(new C101038b(firstVisiblePosition + 1, o802.f299011x, o802));
                        }
                    }
                    firstVisiblePosition++;
                }
                EmoticonStoreActionStruct emoticonStoreActionStruct = emojiStoreV2RankUI.f268831I;
                emoticonStoreActionStruct.f265470f = 1;
                C101038b.f295826d.mo140508a(emoticonStoreActionStruct, linkedList);
                emojiStoreV2RankUI.f268831I.mo86054n();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.EmojiStoreV2RankUI", e, "", new Object[0]);
        }
    }

    /* renamed from: K7 */
    public void mo127642K7(int i, int i2, String str, C46443q qVar) {
        super.mo127642K7(i, i2, str, qVar);
        if (this.f268832J) {
            MMHandlerThread.postToMainThreadDelayed(new C68865b(), 300);
            this.f268832J = false;
        }
    }

    /* renamed from: N7 */
    public int mo127645N7() {
        return 5;
    }

    /* renamed from: R7 */
    public int mo127649R7() {
        return 10;
    }

    /* renamed from: S7 */
    public int mo127650S7() {
        return 105;
    }

    /* renamed from: U7 */
    public void mo127652U7(C102562g gVar, int i) {
        if (gVar == null) {
            Log.m105924i("MicroMsg.EmojiStoreV2RankUI", "item is null.");
        } else if (gVar.f301982a == C102562g.C102563a.cellset) {
            C101754a80 a802 = gVar.f301984c;
            if (a802 == null) {
                Log.m105924i("MicroMsg.EmojiStoreV2RankUI", "banner set is null. do nothing");
            } else {
                C98605n.m128199a(getContext(), a802, false);
            }
        } else {
            C101824o80 o802 = gVar.f301983b;
            if (o802 == null) {
                Log.m105924i("MicroMsg.EmojiStoreV2RankUI", "summary is null. do nothing");
                return;
            }
            this.f268831I.mo126613s(String.valueOf(i + 1));
            this.f268831I.mo126618x(o802.f298994d);
            this.f268831I.mo126614t(o802.f299011x);
            EmoticonStoreActionStruct emoticonStoreActionStruct = this.f268831I;
            emoticonStoreActionStruct.f265470f = 3;
            emoticonStoreActionStruct.mo126615u(String.valueOf(EmojiLogic.m117482m(o802.f298993D)));
            this.f268831I.mo126617w(String.valueOf(EmojiLogic.m117484o(o802.f298993D)));
            this.f268831I.mo126616v(EmojiLogic.m117483n(o802.f298993D));
            this.f268831I.mo86054n();
            C98605n.m128202d(getContext(), o802, false, 5, gVar.f301987f, gVar.f301986e, getIntent().getStringExtra("to_talker_name"), 105, this.f268831I);
        }
    }

    /* renamed from: a8 */
    public C102554b mo127658a8() {
        return new C102336f(getContext());
    }

    public int getForceOrientation() {
        return 1;
    }

    public void initView() {
        super.initView();
        setMMTitle((int) C0966R.string.c8y);
        this.f268287i.setOnScrollListener(new C68864a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C115669n.INSTANCE.mo160131h(12740, 4, "", "", "", 5, 5);
        EmoticonStoreActionStruct emoticonStoreActionStruct = this.f268831I;
        emoticonStoreActionStruct.f265469e = 3;
        this.f268301z.f268245k = emoticonStoreActionStruct;
        long currentTimeMillis = System.currentTimeMillis();
        C51976xh3 xh32 = new C51976xh3();
        xh32.f144663f = currentTimeMillis;
        this.f268831I.f265468d = currentTimeMillis;
        Log.m105925i("MicroMsg.EmojiStoreV2RankUI", "initeData: %s", Long.valueOf(currentTimeMillis));
        try {
            this.f268296u = xh32.toByteArray();
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.EmojiStoreV2RankUI", e, "", new Object[0]);
        }
    }
}
