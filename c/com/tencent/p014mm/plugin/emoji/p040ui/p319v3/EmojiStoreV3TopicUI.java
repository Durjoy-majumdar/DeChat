package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import android.os.Bundle;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.model.C41053r;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.BaseEmojiStoreUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j61.C46443q;
import java.util.LinkedList;
import kotlin.Metadata;
import q61.C101037a;
import q61.C101038b;
import te3.C101792j80;
import te3.C101824o80;
import w51.C102336f;
import x51.C102554b;
import x51.C102562g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3TopicUI;", "Lcom/tencent/mm/plugin/emoji/ui/BaseEmojiStoreUI;", "<init>", "()V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TopicUI */
public final class EmojiStoreV3TopicUI extends BaseEmojiStoreUI {

    /* renamed from: I */
    public final String f269046I = "MicroMsg.EmojiStoreV3TopicUI";

    /* renamed from: J */
    public String f269047J = "";

    /* renamed from: K */
    public byte[] f269048K;

    /* renamed from: L */
    public String f269049L;

    /* renamed from: M */
    public int f269050M = -1;

    /* renamed from: N7 */
    public int mo127645N7() {
        return this.f269050M;
    }

    /* renamed from: O7 */
    public EmoticonStoreActionStruct mo127646O7(int i, C101038b bVar) {
        EmoticonStoreActionStruct emoticonStoreActionStruct = new EmoticonStoreActionStruct();
        emoticonStoreActionStruct.f265469e = 4;
        emoticonStoreActionStruct.f265474j = (long) this.f269050M;
        emoticonStoreActionStruct.f265468d = C101037a.f295825a;
        emoticonStoreActionStruct.f265470f = i;
        if (i == 1) {
            try {
                int firstVisiblePosition = this.f268287i.getFirstVisiblePosition();
                int lastVisiblePosition = this.f268287i.getLastVisiblePosition();
                if (lastVisiblePosition - firstVisiblePosition <= 0) {
                    String str = this.f269046I;
                    Log.m105924i(str, "getEmoticonStoreActionStruct failed, start:" + firstVisiblePosition + ", end:" + lastVisiblePosition);
                    return emoticonStoreActionStruct;
                }
                LinkedList linkedList = new LinkedList();
                while (firstVisiblePosition < lastVisiblePosition) {
                    C102562g g = this.f268288j.getItem(firstVisiblePosition);
                    if (g != null) {
                        C101824o80 o802 = g.f301983b;
                        if (o802 != null) {
                            String str2 = o802.f298996f;
                            C87412m.m108593f(str2, "summary.PackName");
                            linkedList.add(new C101038b(firstVisiblePosition + 1, str2, o802));
                        }
                    }
                    firstVisiblePosition++;
                }
                C101038b.f295826d.mo140508a(emoticonStoreActionStruct, linkedList);
            } catch (Exception e) {
                Log.printErrStackTrace(this.f269046I, e, "", new Object[0]);
            }
        } else if ((i == 2 || i == 3 || i == 4) && bVar != null) {
            C101824o80 o803 = bVar.f295829c;
            C101792j80 j802 = null;
            emoticonStoreActionStruct.mo126618x(o803 != null ? o803.f298994d : null);
            emoticonStoreActionStruct.mo126613s(String.valueOf(bVar.f295827a));
            emoticonStoreActionStruct.mo126614t(bVar.f295828b);
            C101824o80 o804 = bVar.f295829c;
            emoticonStoreActionStruct.mo126615u(String.valueOf(EmojiLogic.m117482m(o804 != null ? o804.f298993D : null)));
            C101824o80 o805 = bVar.f295829c;
            emoticonStoreActionStruct.mo126617w(String.valueOf(EmojiLogic.m117484o(o805 != null ? o805.f298993D : null)));
            C101824o80 o806 = bVar.f295829c;
            if (o806 != null) {
                j802 = o806.f298993D;
            }
            emoticonStoreActionStruct.mo126616v(EmojiLogic.m117483n(j802));
        }
        return emoticonStoreActionStruct;
    }

    /* renamed from: P7 */
    public byte[] mo127647P7() {
        return this.f269048K;
    }

    /* renamed from: R7 */
    public int mo127649R7() {
        String str = this.f269049L;
        return str == null || str.length() == 0 ? 13 : 14;
    }

    /* renamed from: S7 */
    public int mo127650S7() {
        return 5;
    }

    /* renamed from: W7 */
    public void mo127654W7(C41053r rVar, boolean z, boolean z2) {
        super.mo127654W7(rVar, z, z2);
    }

    /* renamed from: Y7 */
    public boolean mo127656Y7() {
        return false;
    }

    /* renamed from: a8 */
    public C102554b mo127658a8() {
        return new C102336f(getContext());
    }

    /* renamed from: b8 */
    public void mo127659b8(int i, C101038b bVar) {
        mo127646O7(i, bVar).mo86054n();
    }

    /* renamed from: c8 */
    public void mo127660c8(C46443q qVar) {
        if (qVar != null) {
            qVar.f125107j = this.f269049L;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public void initView() {
        super.initView();
        setMMTitle(this.f269047J);
        super.initView();
        showOptionMenu(0, false);
    }

    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("topic_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f269047J = stringExtra;
        getIntent().getIntExtra("topic_id", -1);
        getIntent().getStringExtra("topic_ad_url");
        getIntent().getStringExtra("topic_icon_url");
        getIntent().getStringExtra("topic_desc");
        this.f269048K = getIntent().getByteArrayExtra("emotion_list_buf");
        this.f269049L = getIntent().getStringExtra("extra_ip_set_key");
        this.f269050M = getIntent().getIntExtra("entrance_scene", 11);
        super.onCreate(bundle);
        C115669n.INSTANCE.mo160131h(12740, 3, "", "", 0, Integer.valueOf(this.f269050M), 11);
    }

    public void onResume() {
        super.onResume();
    }
}
