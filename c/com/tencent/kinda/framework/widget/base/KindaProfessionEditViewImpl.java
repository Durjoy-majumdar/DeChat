package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KProfessionEditView;
import com.tencent.kinda.gen.KProfessionEditViewOnSelectProfessionCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ProfessionSelectedEvent;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C9556a;
import te3.C49006ci3;
import te3.C49152di3;

public class KindaProfessionEditViewImpl extends MMKView<View> implements KProfessionEditView {
    private byte _hellAccFlag_;
    public KProfessionEditViewOnSelectProfessionCallback callback;
    /* access modifiers changed from: private */
    public LinearLayout mContainer;
    private Context mContext;
    /* access modifiers changed from: private */
    public Profession mCurSelectedProfession;
    /* access modifiers changed from: private */
    public EditText mEditText;
    /* access modifiers changed from: private */
    public IListener<ProfessionSelectedEvent> professionSelectedEventIListener = new IListener<ProfessionSelectedEvent>(C40008f.f107254d) {
        {
            this.__eventId = 843767027;
        }

        public boolean callback(ProfessionSelectedEvent professionSelectedEvent) {
            if (KindaWrapProfessionActivity.ACTIVITY_CLOSE_FLAG.equals(professionSelectedEvent.f193831d.f193832a)) {
                KindaProfessionEditViewImpl.this.professionSelectedEventIListener.dead();
                return false;
            }
            Log.m105924i(MMKView.TAG, "profession_name:" + professionSelectedEvent.f193831d.f193832a + " profession_type:" + professionSelectedEvent.f193831d.f193833b);
            KindaProfessionEditViewImpl kindaProfessionEditViewImpl = KindaProfessionEditViewImpl.this;
            ProfessionSelectedEvent.C67757a aVar = professionSelectedEvent.f193831d;
            Profession unused = kindaProfessionEditViewImpl.mCurSelectedProfession = new Profession(aVar.f193832a, aVar.f193833b);
            KindaProfessionEditViewImpl.this.mEditText.setText(KindaProfessionEditViewImpl.this.mCurSelectedProfession.f209290d);
            KindaProfessionEditViewImpl.this.mContainer.setContentDescription(KindaProfessionEditViewImpl.this.mCurSelectedProfession.f209290d);
            KindaProfessionEditViewImpl kindaProfessionEditViewImpl2 = KindaProfessionEditViewImpl.this;
            KProfessionEditViewOnSelectProfessionCallback kProfessionEditViewOnSelectProfessionCallback = kindaProfessionEditViewImpl2.callback;
            if (kProfessionEditViewOnSelectProfessionCallback == null) {
                return false;
            }
            kProfessionEditViewOnSelectProfessionCallback.onSelectProfession(kindaProfessionEditViewImpl2.mCurSelectedProfession.f209290d, KindaProfessionEditViewImpl.this.mCurSelectedProfession.f209291e);
            return false;
        }
    };
    private final List<Profession> professions = new ArrayList();

    public View createView(Context context) {
        EditText editText = new EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground((Drawable) null);
        this.mEditText.setHint(C0966R.string.f361551kq3);
        this.mEditText.setTextSize(0, MMKViewUtil.dpToPx(context, MMKViewUtil.getScaleSize(context) * 17.0f));
        this.mEditText.setPadding(0, 0, 0, 0);
        this.mContext = context;
        LayoutWrapper layoutWrapper = new LayoutWrapper(context, this.mEditText);
        this.mContainer = layoutWrapper;
        layoutWrapper.setContentDescription(context.getString(C0966R.string.f361551kq3));
        return this.mContainer;
    }

    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    public String getProfessionName() {
        Profession profession = this.mCurSelectedProfession;
        if (profession != null) {
            return profession.f209290d;
        }
        return null;
    }

    public int getProfessionType() {
        Profession profession = this.mCurSelectedProfession;
        if (profession != null) {
            return profession.f209291e;
        }
        return 0;
    }

    public void setData(ITransmitKvData iTransmitKvData) {
        C49152di3 di32 = new C49152di3();
        try {
            di32.parseFrom(iTransmitKvData.getBinary("profession_list"));
        } catch (Exception unused) {
            Log.m105920e(MMKView.TAG, "profession list parse failed");
        }
        this.professions.clear();
        Iterator<C49006ci3> it = di32.f132357d.iterator();
        while (it.hasNext()) {
            C49006ci3 next = it.next();
            this.professions.add(new Profession(next.f131737e, next.f131736d));
        }
    }

    public void setDefaultProfession(int i, String str) {
        this.mCurSelectedProfession = new Profession(str, i);
        this.mEditText.setText(str);
        this.mContainer.setContentDescription(this.mCurSelectedProfession.f209290d);
    }

    public void setFocus(boolean z) {
        if (z) {
            this.professionSelectedEventIListener.alive();
            Context context = this.mContext;
            if (context instanceof BaseFrActivity) {
                ((BaseFrActivity) context).hideTenpayKB();
                Intent intent = new Intent(this.mContext, KindaWrapProfessionActivity.class);
                List<Profession> list = this.professions;
                intent.putExtra("key_profession_list", (Parcelable[]) list.toArray(new Profession[list.size()]));
                Context context2 = this.mContext;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context3 = context2;
                C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/KindaProfessionEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context3, "com/tencent/kinda/framework/widget/base/KindaProfessionEditViewImpl", "setFocus", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    public void setOnSelectProfessionCallback(KProfessionEditViewOnSelectProfessionCallback kProfessionEditViewOnSelectProfessionCallback) {
        this.callback = kProfessionEditViewOnSelectProfessionCallback;
    }
}
