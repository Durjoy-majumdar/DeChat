package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPreviewReportStruct;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.story.p108ui.StoryBrowseUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import jw2.C99069d;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import xv2.C102775d;
import xv2.C79003c;

/* renamed from: com.tencent.mm.ui.contact.CategoryTipView */
public class CategoryTipView extends RelativeLayout implements C79003c {

    /* renamed from: h */
    public static final /* synthetic */ int f218466h = 0;

    /* renamed from: d */
    public TextView f218467d = null;

    /* renamed from: e */
    public int f218468e = 0;

    /* renamed from: f */
    public long f218469f = 0;

    /* renamed from: g */
    public String f218470g = "";

    /* renamed from: com.tencent.mm.ui.contact.CategoryTipView$a */
    public class C74369a implements View.OnClickListener {
        public C74369a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/CategoryTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (Util.ticksToNow(CategoryTipView.this.f218469f) < 1000) {
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/CategoryTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            CategoryTipView.this.f218469f = Util.currentTicks();
            if (CategoryTipView.this.mo103330d()) {
                StoryPreviewReportStruct storyPreviewReportStruct = C99069d.f290421d;
                storyPreviewReportStruct.f266280t = storyPreviewReportStruct.mo86045b("SessionId", CategoryTipView.this.f218470g, true);
                C99069d.f290421d.f266265e = 6;
                Context context = CategoryTipView.this.getContext();
                try {
                    ArrayList arrayList2 = new ArrayList(new ArrayList());
                    int i = StoryBrowseUI.f281780h;
                    Intent intent = new Intent(context, StoryBrowseUI.class);
                    intent.putExtra("user_list", arrayList2);
                    intent.putExtra("delete_when_first_empty", false);
                    intent.putExtra("gallery_session_id", (String) null);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/story/api/LaunchStory", "startStoryBrowse", "(Landroid/content/Context;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/story/api/LaunchStory", "startStoryBrowse", "(Landroid/content/Context;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (ClassNotFoundException e) {
                    Log.printErrStackTrace("LaunchStory", e, "startStoryBrowse failed", new Object[0]);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/CategoryTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.CategoryTipView$b */
    public class C74370b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f218472d;

        public C74370b(int i) {
            this.f218472d = i;
        }

        public void run() {
            CategoryTipView categoryTipView = CategoryTipView.this;
            int i = this.f218472d;
            int i2 = CategoryTipView.f218466h;
            categoryTipView.getClass();
            Log.m105919d("MicroMsg.CategoryTipView", "%s invalidateByStatus %s", categoryTipView, Integer.valueOf(i));
            categoryTipView.mo103328b(i);
            categoryTipView.invalidate();
        }
    }

    public CategoryTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo103329c();
    }

    /* renamed from: a */
    public void mo103327a(int i) {
        Log.m105919d("MicroMsg.CategoryTipView", "%s mStatus=%s newStatus=%s", this, Integer.valueOf(this.f218468e), Integer.valueOf(i));
        if (getVisibility() == 0 && mo103330d() && this.f218468e != i) {
            post(new C74370b(i));
        }
    }

    /* renamed from: b */
    public void mo103328b(int i) {
        this.f218468e = i;
        if (mo103330d()) {
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("StoryShouldShowEntraceInFavorFriend", 1);
            if (b == 1 && (i & 1) != 0) {
                Log.m105925i("MicroMsg.CategoryTipView", "%s showStoryCategory has new story %s", this, Integer.valueOf(b));
                setVisibility(0);
                this.f218467d.setVisibility(0);
                Drawable drawable = getContext().getResources().getDrawable(C0966R.raw.icon_outlined_one_day_video_blue);
                drawable.setBounds(0, 0, C76577a.m92151b(getContext(), 20), C76577a.m92151b(getContext(), 20));
                this.f218467d.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                this.f218467d.invalidate();
            } else if (b != 1 || (i & 2) == 0) {
                setVisibility(8);
                this.f218467d.setVisibility(8);
            } else {
                Log.m105925i("MicroMsg.CategoryTipView", "%s showStoryCategory has story %s", this, Integer.valueOf(b));
                setVisibility(0);
                this.f218467d.setVisibility(0);
                Drawable e = C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_one_day_video, getContext().getResources().getColor(C0966R.color.f3133gi));
                e.setBounds(0, 0, C76577a.m92151b(getContext(), 20), C76577a.m92151b(getContext(), 20));
                this.f218467d.setCompoundDrawables((Drawable) null, (Drawable) null, e, (Drawable) null);
                this.f218467d.invalidate();
            }
        } else {
            setVisibility(8);
            this.f218467d.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo103329c() {
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6363cs, this, true);
        this.f218467d = (TextView) findViewById(C0966R.C0970id.bqs);
        setOnClickListener(new C74369a());
        ((C102775d) C86312j.m106911c(C102775d.class)).mo134166TA().mo105643c(new WeakReference(this));
    }

    /* renamed from: d */
    public final boolean mo103330d() {
        Object tag = getTag();
        boolean z = tag != null && (tag instanceof Integer) && ((Integer) tag).intValue() == 32;
        Log.m105919d("MicroMsg.CategoryTipView", "%s isFavourHeader=%s", this, Boolean.valueOf(z));
        return z;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = true;
        Object[] objArr = new Object[1];
        if (i != 0) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105919d("MicroMsg.CategoryTipView", "visibility == View.VISIBLE : %s", objArr);
        if (i == 0) {
            this.f218470g = C74928u.m89762a(String.valueOf(6));
        }
    }

    public CategoryTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo103329c();
    }
}
