package w51;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C93101b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.StoreBannerEmojiView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import i61.C98605n;
import ic0.C98661k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import nj3.C100122e1;
import te3.C101824o80;

/* renamed from: w51.i */
public class C102344i extends C100122e1 implements View.OnClickListener {

    /* renamed from: e */
    public LinkedList<C93101b> f301440e;

    /* renamed from: f */
    public Context f301441f;

    /* renamed from: g */
    public int f301442g = 0;

    /* renamed from: h */
    public boolean f301443h = false;

    /* renamed from: i */
    public ArrayList<String> f301444i = new ArrayList<>();

    /* renamed from: j */
    public C102346b f301445j = new C102346b((C102345a) null);

    /* renamed from: w51.i$b */
    public static class C102346b implements C98661k {

        /* renamed from: a */
        public C102344i f301446a;

        /* renamed from: w51.i$b$a */
        public class C102347a implements Runnable {
            public C102347a() {
            }

            public void run() {
                C102344i iVar = C102346b.this.f301446a;
                if (iVar != null) {
                    iVar.notifyDataSetChanged();
                }
            }
        }

        public C102346b(C102345a aVar) {
        }

        /* renamed from: a */
        public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
            Log.m105925i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "onImageLoadComplete url:%s", str);
            MMHandlerThread.postToMainThread(new C102347a());
        }
    }

    /* renamed from: w51.i$c */
    public class C102348c {

        /* renamed from: a */
        public StoreBannerEmojiView f301448a;

        public C102348c(C102344i iVar, View view) {
            this.f301448a = (StoreBannerEmojiView) view.findViewById(C0966R.C0970id.ce7);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.hdx);
            this.f301448a.setDefaultImageResource(0);
        }
    }

    public C102344i(Context context, LinkedList<C93101b> linkedList) {
        if (linkedList != null) {
            this.f301441f = context;
            LinkedList<C93101b> linkedList2 = new LinkedList<>();
            this.f301440e = linkedList2;
            linkedList2.addAll(linkedList);
            this.f301445j.f301446a = this;
            return;
        }
        throw new IllegalAccessError("must has emoji banner list");
    }

    public int getCount() {
        LinkedList<C93101b> linkedList = this.f301440e;
        if (linkedList == null) {
            return 0;
        }
        if (linkedList.size() == 1) {
            return 1;
        }
        return this.f301440e.size() * 60;
    }

    public int getItemPosition(Object obj) {
        int i = this.f301442g;
        if (i <= 0) {
            return super.getItemPosition(obj);
        }
        this.f301442g = i - 1;
        return -2;
    }

    public void notifyDataSetChanged() {
        if (!this.f301443h) {
            this.f301442g = getCount();
            super.notifyDataSetChanged();
            return;
        }
        Log.m105924i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "has destroy need to notify");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/adapter/EmojiStoreVpHeaderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C93101b bVar = this.f301440e.get(((Integer) view.getTag(C0966R.C0970id.cfp)).intValue());
        if (bVar != null) {
            if (bVar.f268229c) {
                C98605n.m128199a(this.f301441f, bVar.f268227a, true);
            } else {
                C101824o80 o802 = bVar.f268228b.f145151d;
                if (o802 != null) {
                    Log.m105919d("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "productId %s", o802.f298994d);
                    C115669n.INSTANCE.mo160131h(11929, 0);
                    C98605n.m128201c(this.f301441f, o802, false, 15, -1, -1, "", 8);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreVpHeaderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
