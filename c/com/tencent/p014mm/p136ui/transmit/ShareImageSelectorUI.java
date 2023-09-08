package com.tencent.p014mm.p136ui.transmit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.SelectContactUI;
import com.tencent.p014mm.p136ui.tools.ShowImageUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import p755xs.C102720b;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI */
public class ShareImageSelectorUI extends MMActivity implements AdapterView.OnItemClickListener {

    /* renamed from: n */
    public static int f24781n = 1;

    /* renamed from: d */
    public int f24782d = 2;

    /* renamed from: e */
    public String f24783e;

    /* renamed from: f */
    public View f24784f;

    /* renamed from: g */
    public ImageView f24785g;

    /* renamed from: h */
    public ListView f24786h;

    /* renamed from: i */
    public View.OnClickListener f24787i = new C7024a();

    /* renamed from: j */
    public MMHandler f24788j = new C7025b();

    /* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI$a */
    public class C7024a implements View.OnClickListener {
        public C7024a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/transmit/ShareImageSelectorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ShareImageSelectorUI shareImageSelectorUI = ShareImageSelectorUI.this;
            int i = ShareImageSelectorUI.f24781n;
            shareImageSelectorUI.getClass();
            Intent intent = new Intent(shareImageSelectorUI, ShowImageUI.class);
            intent.putExtra("key_image_path", shareImageSelectorUI.f24783e);
            intent.putExtra("show_menu", false);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            ShareImageSelectorUI shareImageSelectorUI2 = shareImageSelectorUI;
            C117292a.m165358d(shareImageSelectorUI2, aVar.mo10232b(), "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            shareImageSelectorUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(shareImageSelectorUI2, "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/transmit/ShareImageSelectorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI$b */
    public class C7025b extends MMHandler {
        public C7025b() {
        }

        public void handleMessage(Message message) {
            ShareImageSelectorUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI$c */
    public class C7026c implements MenuItem.OnMenuItemClickListener {
        public C7026c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShareImageSelectorUI shareImageSelectorUI = ShareImageSelectorUI.this;
            int i = ShareImageSelectorUI.f24781n;
            shareImageSelectorUI.mo8059K7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI$d */
    public class C7027d implements DialogInterface.OnClickListener {
        public C7027d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ShareImageSelectorUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI$e */
    public class C7028e implements DialogInterface.OnClickListener {
        public C7028e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (ShareImageSelectorUI.f24781n == 1) {
                ShareImageSelectorUI.this.mo8060L7();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI$f */
    public class C7029f implements C76879j.C11180n {
        public C7029f() {
        }

        /* renamed from: j */
        public void mo782j(int i) {
            if (i == 0) {
                ShareImageSelectorUI shareImageSelectorUI = ShareImageSelectorUI.this;
                int i2 = ShareImageSelectorUI.f24781n;
                shareImageSelectorUI.mo8057I7();
            } else if (i == 1) {
                ShareImageSelectorUI shareImageSelectorUI2 = ShareImageSelectorUI.this;
                int i3 = ShareImageSelectorUI.f24781n;
                shareImageSelectorUI2.mo8058J7();
            } else if (i == 2) {
                ShareImageSelectorUI shareImageSelectorUI3 = ShareImageSelectorUI.this;
                int i4 = ShareImageSelectorUI.f24781n;
                shareImageSelectorUI3.mo8056H7();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI$g */
    public class C7030g implements DialogInterface.OnCancelListener {
        public C7030g() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            ShareImageSelectorUI shareImageSelectorUI = ShareImageSelectorUI.this;
            int i = ShareImageSelectorUI.f24781n;
            shareImageSelectorUI.mo8059K7();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI$h */
    public class C7031h extends BaseAdapter {

        /* renamed from: d */
        public C7032a[] f24796d = {new C7032a(this, C0966R.string.bwm, C0966R.raw.share_to_friend_icon), new C7032a(this, C0966R.string.bwn, C0966R.raw.find_more_friend_photograph_icon), new C7032a(this, C0966R.string.bwl, C0966R.raw.more_my_favorite)};

        /* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI$h$a */
        public class C7032a {

            /* renamed from: a */
            public int f24798a;

            /* renamed from: b */
            public int f24799b;

            public C7032a(C7031h hVar, int i, int i2) {
                this.f24798a = i;
                this.f24799b = i2;
            }
        }

        public C7031h() {
        }

        public int getCount() {
            return 3;
        }

        public Object getItem(int i) {
            return this.f24796d[i];
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C7033i iVar;
            if (view == null || view.getTag() == null) {
                view = LayoutInflater.from(ShareImageSelectorUI.this.getContext()).inflate(C0966R.C0971layout.f359977bz0, (ViewGroup) null);
                iVar = new C7033i(ShareImageSelectorUI.this, view);
            } else {
                iVar = (C7033i) view.getTag();
            }
            C7032a aVar = this.f24796d[i];
            if (aVar != null) {
                iVar.f24801b.setText(aVar.f24798a);
                iVar.f24800a.setImageResource(aVar.f24799b);
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI$i */
    public class C7033i {

        /* renamed from: a */
        public MMImageView f24800a;

        /* renamed from: b */
        public TextView f24801b;

        public C7033i(ShareImageSelectorUI shareImageSelectorUI, View view) {
            this.f24800a = (MMImageView) view.findViewById(C0966R.C0970id.fak);
            this.f24801b = (TextView) view.findViewById(C0966R.C0970id.fbz);
        }
    }

    /* renamed from: H7 */
    public final void mo8056H7() {
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C96787m0.m124252f(doFavoriteEvent, 6, this.f24783e);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264684i = this;
        aVar.f264688m = 52;
        doFavoriteEvent.publish();
        C115669n.INSTANCE.mo160131h(11048, 3, 0, 0);
        MMHandler mMHandler = this.f24788j;
        if (mMHandler != null) {
            mMHandler.sendEmptyMessageDelayed(0, 800);
        }
    }

    /* renamed from: I7 */
    public final void mo8057I7() {
        Intent intent = new Intent(this, SelectContactUI.class);
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219168i);
        intent.putExtra("titile", getString(C0966R.string.f7493hr));
        intent.putExtra("list_type", 11);
        intent.putExtra("shareImage", true);
        intent.putExtra("shareImagePath", this.f24783e);
        startActivityForResult(intent, 1001);
    }

    /* renamed from: J7 */
    public final void mo8058J7() {
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", this.f24783e);
        intent.putExtra("need_result", true);
        C88144b.m109795m(getContext(), "sns", ".ui.SnsUploadUI", intent, 1002);
    }

    /* renamed from: K7 */
    public final void mo8059K7() {
        C76879j.m92714H(getContext(), getString(C0966R.string.bwi), getString(C0966R.string.bwk), true, new C7027d(), new C7028e());
    }

    /* renamed from: L7 */
    public final void mo8060L7() {
        C76879j.m92735f(getContext(), getString(C0966R.string.gru), new String[]{getString(C0966R.string.bwm), getString(C0966R.string.bwn), getString(C0966R.string.bwl)}, (String) null, "", true, new C7029f(), new C7030g());
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.byz;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105919d("MicroMsg.ShareImageSelectorUI", "requestCode:%d , resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 1001) {
            if (i != 1002) {
                Log.m105928w("MicroMsg.ShareImageSelectorUI", "unknow result");
            } else if (i2 == -1) {
                C76701a.makeText((Context) getContext(), (int) C0966R.string.bjc, 0).show();
                finish();
            } else {
                Log.m105928w("MicroMsg.ShareImageSelectorUI", "user cancle");
            }
        } else if (i2 == -1) {
            ArrayList<String> arrayList = null;
            if (intent != null) {
                arrayList = intent.getStringArrayListExtra("Select_Contact");
            }
            if (arrayList != null && arrayList.size() == 1) {
                Intent intent2 = new Intent(this, ChattingUI.class);
                intent2.putExtra("Chat_User", arrayList.get(0));
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            finish();
        } else {
            Log.m105928w("MicroMsg.ShareImageSelectorUI", "user cancle");
        }
    }

    public void onBackPressed() {
        mo8059K7();
    }

    public void onCreate(Bundle bundle) {
        int intValue;
        super.onCreate(bundle);
        Object e = C97625j3.m125812b().mo105906u().mo119684e(229635, (Object) null);
        if ((e instanceof Integer) && ((intValue = ((Integer) e).intValue()) == 0 || intValue == 1)) {
            f24781n = intValue;
        }
        setMMTitle((int) C0966R.string.gru);
        setBackBtn(new C7026c());
        this.f24782d = getIntent().getIntExtra("Select_Conv_Type", 2);
        this.f24783e = getIntent().getStringExtra("intent_extra_image_path");
        this.f24784f = findViewById(C0966R.C0970id.gkm);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f39);
        this.f24785g = imageView;
        imageView.setOnClickListener(this.f24787i);
        this.f24786h = (ListView) findViewById(C0966R.C0970id.foz);
        this.f24786h.setAdapter(new C7031h());
        this.f24786h.setOnItemClickListener(this);
        Log.m105919d("MicroMsg.ShareImageSelectorUI", "mSelectType:%s ImagePath:%s", this.f24782d + "", this.f24783e);
        if (f24781n == 1) {
            setTitleVisibility(8);
            this.f24786h.setVisibility(8);
            this.f24785g.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.f24785g.setPadding(0, 0, 0, 0);
            this.f24785g.setOnClickListener((View.OnClickListener) null);
            this.f24784f.setBackgroundColor(getResources().getColor(C0966R.color.f3278lx));
            mo8060L7();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap Ou = ((C102720b) C86312j.m106911c(C102720b.class)).mo142105Ou(this.f24783e);
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(this.f24783e);
        Log.m105919d("MicroMsg.ShareImageSelectorUI", "cpan [onCreate]degree:%d", Integer.valueOf(exifOrientation));
        Bitmap rotate = BitmapUtil.rotate(Ou, (float) exifOrientation);
        if (rotate != null && !rotate.isRecycled()) {
            this.f24785g.setImageBitmap(rotate);
        }
        Log.m105919d("MicroMsg.ShareImageSelectorUI", "cpan[onCreate] Read Bitmap Time:%s", (System.currentTimeMillis() - currentTimeMillis) + "'");
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/transmit/ShareImageSelectorUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i == 0) {
            mo8057I7();
        } else if (i == 1) {
            mo8058J7();
        } else if (i != 2) {
            Log.m105920e("MicroMsg.ShareImageSelectorUI", "unknow postion.");
        } else {
            mo8056H7();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onResume() {
        super.onResume();
        if (f24781n == 1) {
            mo8060L7();
        }
    }
}
