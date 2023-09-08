package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.gif.MMGIFException;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C86493v0;
import eb0.C97625j3;
import j20.C117292a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import p140cw.C7138g;
import p755xs.C102720b;
import qz1.C101331f;
import qz1.C22180d;

/* renamed from: com.tencent.mm.ui.tools.ShowImageUI */
public class ShowImageUI extends MMActivity {

    /* renamed from: h */
    public static final /* synthetic */ int f285330h = 0;

    /* renamed from: d */
    public boolean f285331d;

    /* renamed from: e */
    public MMGestureGallery f285332e;

    /* renamed from: f */
    public C97240c f285333f;

    /* renamed from: g */
    public boolean f285334g;

    /* renamed from: com.tencent.mm.ui.tools.ShowImageUI$a */
    public class C97238a implements MenuItem.OnMenuItemClickListener {
        public C97238a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShowImageUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShowImageUI$b */
    public class C97239b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.ui.tools.ShowImageUI$b$a */
        public class C7003a implements C76879j.C76888o {
            public C7003a() {
            }

            /* renamed from: a */
            public void mo5759a(int i, int i2) {
                int i3;
                int i4 = i2;
                if (i4 == 0) {
                    ShowImageUI showImageUI = ShowImageUI.this;
                    int i5 = ShowImageUI.f285330h;
                    String stringExtra = showImageUI.getIntent().getStringExtra("key_image_path");
                    int intExtra = showImageUI.getIntent().getIntExtra("key_compress_type", 0);
                    long longExtra = showImageUI.getIntent().getLongExtra("key_message_id", -1);
                    Intent intent = new Intent(showImageUI, MsgRetransmitUI.class);
                    intent.putExtra("Retr_File_Name", stringExtra);
                    intent.putExtra("Retr_Msg_Id", longExtra);
                    C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(longExtra);
                    C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
                    if (ImgUtil.isGif(stringExtra) || (b002.mo101020w3() && u != null && ((i3 = u.f195582i) == 2 || i3 == 6))) {
                        intent.putExtra("Retr_Msg_Type", 2);
                        intent.putExtra("Retr_Msg_content", b002.getContent());
                        if (u != null && u.f195582i == 2) {
                            String a = C86493v0.m107223a("msg_" + b002.mo108774y2());
                            C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                            c.mo120962i("prePublishId", "msg_" + b002.mo108774y2());
                            intent.putExtra("reportSessionId", a);
                        }
                    } else {
                        intent.putExtra("Retr_Msg_Type", 0);
                    }
                    intent.putExtra("Retr_Compress_Type", intExtra);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    ShowImageUI showImageUI2 = showImageUI;
                    C117292a.m165358d(showImageUI2, aVar.mo10232b(), "com/tencent/mm/ui/tools/ShowImageUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    showImageUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(showImageUI2, "com/tencent/mm/ui/tools/ShowImageUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (i4 == 1) {
                    ShowImageUI showImageUI3 = ShowImageUI.this;
                    showImageUI3.getClass();
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    long longExtra2 = showImageUI3.getIntent().getLongExtra("key_message_id", -1);
                    if (-1 == longExtra2) {
                        Log.m105928w("MicroMsg.ShowImageUI", "msg id error, try fav simple data");
                        C96787m0.m124252f(doFavoriteEvent, showImageUI3.getIntent().getIntExtra("key_favorite_source_type", 1), showImageUI3.getIntent().getStringExtra("key_image_path"));
                    } else {
                        C96787m0.m124255i(doFavoriteEvent, longExtra2);
                    }
                    doFavoriteEvent.f264674d.f264684i = showImageUI3;
                    doFavoriteEvent.publish();
                } else if (i4 == 2) {
                    ShowImageUI showImageUI4 = ShowImageUI.this;
                    int i6 = ShowImageUI.f285330h;
                    ((C7138g) C86312j.m106911c(C7138g.class)).he0(showImageUI4.getIntent().getStringExtra("key_image_path"), showImageUI4);
                } else if (i4 == 3) {
                    ShowImageUI showImageUI5 = ShowImageUI.this;
                    int i7 = ShowImageUI.f285330h;
                    long longExtra3 = showImageUI5.getIntent().getLongExtra("key_message_id", -1);
                    Intent intent2 = new Intent();
                    intent2.setClassName(showImageUI5, "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
                    intent2.putExtra("Retr_Msg_Id", longExtra3);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    ShowImageUI showImageUI6 = showImageUI5;
                    C117292a.m165358d(showImageUI6, aVar2.mo10232b(), "com/tencent/mm/ui/tools/ShowImageUI", "doSendMsgToDevice", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    showImageUI5.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(showImageUI6, "com/tencent/mm/ui/tools/ShowImageUI", "doSendMsgToDevice", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }

        public C97239b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            if (ShowImageUI.this.f285331d) {
                C88144b.m109788f("favorite");
                linkedList2.add(0);
                linkedList.add(ShowImageUI.this.getString(C0966R.string.i4e));
                linkedList2.add(1);
                linkedList.add(ShowImageUI.this.getString(C0966R.string.f361137hk2));
                linkedList2.add(2);
                linkedList.add(ShowImageUI.this.getString(C0966R.string.iaq));
            } else {
                linkedList2.add(0);
                linkedList.add(ShowImageUI.this.getString(C0966R.string.i4e));
                linkedList2.add(2);
                linkedList.add(ShowImageUI.this.getString(C0966R.string.iaq));
            }
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = ShowImageUI.this.getIntent().getLongExtra("key_message_id", -1);
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                linkedList2.add(3);
                linkedList.add(ShowImageUI.this.getString(C0966R.string.b_8));
            }
            C76879j.m92733d(ShowImageUI.this, "", linkedList, linkedList2, "", false, new C7003a());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShowImageUI$c */
    public class C97240c extends BaseAdapter {

        /* renamed from: d */
        public String f285337d;

        public C97240c(ShowImageUI showImageUI, C97238a aVar) {
        }

        public int getCount() {
            return 1;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            MultiTouchImageView multiTouchImageView;
            MMAnimateView mMAnimateView;
            if (ImgUtil.isGif(this.f285337d)) {
                Context context = viewGroup.getContext();
                String str = this.f285337d;
                new C101331f(str);
                mMAnimateView = (view == null || !(view instanceof MMAnimateView)) ? new MMAnimateView(context, (AttributeSet) null) : (MMAnimateView) view;
                mMAnimateView.mo129234u(str, true, str);
                C97244o1 o1Var = new C97244o1(this, mMAnimateView);
                try {
                    C22180d dVar = new C22180d(str);
                    mMAnimateView.setImageDrawable(dVar);
                    dVar.f62710D = Integer.MAX_VALUE;
                    dVar.f62712F = o1Var;
                } catch (MMGIFException e) {
                    try {
                        mMAnimateView.mo129224r(e);
                        if (e.getErrorCode() == 103) {
                            Bitmap decodeStream = BitmapUtil.decodeStream(C86013q1.m106423E(str));
                            if (decodeStream != null) {
                                decodeStream.setDensity(mMAnimateView.getEmojiDensity());
                                mMAnimateView.setImageBitmap(decodeStream);
                            } else {
                                Log.m105929w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed bitmap is null. show default and delete file. path:%s", str);
                                mMAnimateView.mo129221p();
                                C86013q1.m106447h(str);
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        Log.m105920e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + e2.toString());
                    }
                    Log.m105920e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + e.toString());
                } catch (IOException e3) {
                    Log.m105920e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed. %s" + e3.toString());
                }
                mMAnimateView.mo129237x();
                mMAnimateView.mo129236w();
                return mMAnimateView;
            }
            Bitmap Ou = ((C102720b) C86312j.m106911c(C102720b.class)).mo142105Ou(this.f285337d);
            int orientationInDegree = Exif.fromFile(this.f285337d).getOrientationInDegree();
            Log.m105919d("MicroMsg.ShowImageUI", "imagePath : %s degree : %d", this.f285337d, Integer.valueOf(orientationInDegree));
            Bitmap rotate = BitmapUtil.rotate(Ou, (float) orientationInDegree);
            if (rotate == null) {
                Log.m105928w("MicroMsg.ShowImageUI", "get image fail");
                if (view == null || (view instanceof MultiTouchImageView)) {
                    view = View.inflate(viewGroup.getContext(), C0966R.C0971layout.bza, (ViewGroup) null);
                }
                ((ImageView) view.findViewById(C0966R.C0970id.f4k)).setImageResource(C0966R.raw.download_image_icon);
                view.setLayoutParams(new Gallery.LayoutParams(-1, -1));
                return view;
            }
            Context context2 = viewGroup.getContext();
            if (view == null || !(view instanceof MultiTouchImageView)) {
                multiTouchImageView = new MultiTouchImageView(context2, rotate.getWidth(), rotate.getHeight());
            } else {
                multiTouchImageView = (MultiTouchImageView) view;
                int width = rotate.getWidth();
                int height = rotate.getHeight();
                multiTouchImageView.f348280o = width;
                multiTouchImageView.f348281p = height;
            }
            multiTouchImageView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            multiTouchImageView.setImageBitmap(rotate);
            multiTouchImageView.setMaxZoomDoubleTab(true);
            return multiTouchImageView;
            mMAnimateView.mo129221p();
            mMAnimateView.mo129237x();
            mMAnimateView.mo129236w();
            return mMAnimateView;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bz_;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setNavigationbarColor(getResources().getColor(C0966R.color.f3131gg));
        String stringExtra = getIntent().getStringExtra("key_title");
        if (!Util.isNullOrNil(stringExtra)) {
            setMMTitle(stringExtra);
        }
        this.f285331d = getIntent().getBooleanExtra("key_favorite", false);
        this.f285334g = getIntent().getBooleanExtra("show_menu", true);
        MMGestureGallery mMGestureGallery = (MMGestureGallery) findViewById(C0966R.C0970id.ehh);
        this.f285332e = mMGestureGallery;
        mMGestureGallery.setVerticalFadingEdgeEnabled(false);
        this.f285332e.setHorizontalFadingEdgeEnabled(false);
        C97240c cVar = new C97240c(this, (C97238a) null);
        this.f285333f = cVar;
        cVar.f285337d = getIntent().getStringExtra("key_image_path");
        this.f285332e.setAdapter(this.f285333f);
        setBackBtn(new C97238a());
        if (this.f285334g) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_share, new C97239b());
        }
    }
}
