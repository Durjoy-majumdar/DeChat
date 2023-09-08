package s61;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.emoji.p040ui.C93201n;
import com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI;
import com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI$$e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import q61.C101037a;
import s61.C101543c;
import te3.C101824o80;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: s61.a */
public class C101540a<I extends C101543c> extends RecyclerView.C16631z {

    /* renamed from: A */
    public I f297278A;

    /* renamed from: z */
    public C101542b f297279z;

    /* renamed from: s61.a$a */
    public static final class C101541a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101540a<I> f297280d;

        public C101541a(C101540a<I> aVar) {
            this.f297280d = aVar;
        }

        public final void onClick(View view) {
            int i;
            int i2;
            int i3;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/widget/preview/BasePreviewEmotionViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101540a<I> aVar = this.f297280d;
            C101542b bVar = aVar.f297279z;
            if (bVar != null) {
                aVar.mo17363j();
                I i4 = this.f297280d.f297278A;
                CustomSmileyPreviewUI$$e customSmileyPreviewUI$$e = (CustomSmileyPreviewUI$$e) bVar;
                if (i4 != null) {
                    if (Util.isNullOrNil(customSmileyPreviewUI$$e.f268372a.f268364z.field_groupId)) {
                        i3 = 2;
                        i2 = 2;
                        i = 38;
                    } else {
                        i3 = 1;
                        i2 = 1;
                        i = 37;
                    }
                    int type = i4.getType();
                    if (type != 1) {
                        if (type != 2) {
                            if (type == 3) {
                                customSmileyPreviewUI$$e.f268372a.mo127675L7(i);
                                C101037a.m132404b("", "", 4, customSmileyPreviewUI$$e.f268372a.f268364z.getMd5(), i2);
                            }
                        } else if (i4 instanceof C101545e) {
                            C101824o80 o802 = ((C101545e) i4).f297281a;
                            if (o802 == null) {
                                Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "onClickByShowingType detail error, EmotionSummary null");
                            } else {
                                Intent K7 = customSmileyPreviewUI$$e.f268372a.mo127674K7(o802, i);
                                CustomSmileyPreviewUI customSmileyPreviewUI = customSmileyPreviewUI$$e.f268372a;
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(K7);
                                CustomSmileyPreviewUI customSmileyPreviewUI2 = customSmileyPreviewUI;
                                C117292a.m165358d(customSmileyPreviewUI2, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$21", "onClick", "(Lcom/tencent/mm/plugin/emoji/ui/v3/widget/preview/BasePreviewEmotionViewHolder;ILcom/tencent/mm/plugin/emoji/ui/v3/widget/preview/IPreviewEmotionItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                customSmileyPreviewUI.startActivity((Intent) aVar2.mo10231a(0));
                                C117292a.m165359e(customSmileyPreviewUI2, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$21", "onClick", "(Lcom/tencent/mm/plugin/emoji/ui/v3/widget/preview/BasePreviewEmotionViewHolder;ILcom/tencent/mm/plugin/emoji/ui/v3/widget/preview/IPreviewEmotionItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                C101037a.m132404b("", o802.f298994d, 3, customSmileyPreviewUI$$e.f268372a.f268364z.getMd5(), i2);
                            }
                        }
                    } else if (i4 instanceof C101552m) {
                        EmojiInfo emojiInfo = ((C101552m) i4).f297296a;
                        if (emojiInfo == null) {
                            Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "half dialog action error, EmojiInfo null");
                        } else {
                            customSmileyPreviewUI$$e.f268372a.setRequestedOrientation(1);
                            C119179t tVar = C119157j.f356862d;
                            C93201n nVar = new C93201n(customSmileyPreviewUI$$e, emojiInfo, i);
                            C119157j jVar = (C119157j) tVar;
                            jVar.getClass();
                            jVar.mo183892w(nVar, 0, false);
                            C101037a.m132405c(emojiInfo, 0, 0, 0, i);
                            C101037a.m132404b(emojiInfo.getMd5(), emojiInfo.field_groupId, i3, customSmileyPreviewUI$$e.f268372a.f268364z.getMd5(), i2);
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/widget/preview/BasePreviewEmotionViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101540a(View view, C101542b bVar) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f297279z = bVar;
        view.setOnClickListener(new C101541a(this));
    }

    /* renamed from: y */
    public void mo141016y(C101543c cVar) {
        C87412m.m108594g(cVar, "dataItem");
        this.f297278A = cVar;
    }
}
