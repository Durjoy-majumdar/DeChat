package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.WCWebUpdater;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.mmsight.ui.SightSettingsUI */
public class SightSettingsUI extends MMActivity {

    /* renamed from: d */
    public ListView f201524d;

    /* renamed from: e */
    public C69847c f201525e;

    /* renamed from: f */
    public CaptureMMProxy f201526f;

    /* renamed from: g */
    public C96905d f201527g = new C96905d(this);

    /* renamed from: h */
    public LinkedList<C69849d> f201528h = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightSettingsUI$a */
    public class C69845a implements Runnable {
        public C69845a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.SightSettingsUI", "has connect");
            SightSettingsUI sightSettingsUI = SightSettingsUI.this;
            sightSettingsUI.f201528h.add(new C69849d("打开测试信息", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, new String[]{"Y", "N"}, new int[]{1, 0}));
            sightSettingsUI.f201528h.add(new C69849d("拍照方式", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_CAPTURE_TYPE_INT_SYNC, new String[]{"Image流", "预览帧"}, new int[]{1, 2}));
            sightSettingsUI.f201528h.add(new C69849d("CameraApi", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_CAMERA_API_INT_SYNC, new String[]{"Camera2", "Camera1"}, new int[]{2, 1}));
            sightSettingsUI.f201528h.add(new C69849d("对焦方案", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_FOCUS_INT_SYNC, new String[]{"System", "啊..."}, new int[]{1, 0}));
            sightSettingsUI.f201528h.add(new C69849d("裁剪方案", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_FFMMPEGCUT_INT_SYNC, new String[]{"default", "mediacodecv21", "mediacodecv", "ffmpeg"}, new int[]{-1, 1, 2, 3}));
            SightSettingsUI sightSettingsUI2 = sightSettingsUI;
            sightSettingsUI.f201528h.add(new C69849d("是否把双通音频压成单通道", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_COMPRESS_TO_SINGLE_CHANNEL_INT_SYNC, new String[]{"-1", "yes", "no"}, new int[]{-1, 1, 0}));
            sightSettingsUI.f201528h.add(new C69849d("Thread", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_THREADCOUNT_INT_SYNC, new String[]{"-1", "1", "2", "3", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN}, new int[]{-1, 1, 2, 3, 4, 5, 6}));
            sightSettingsUI.f201528h.add(new C69849d("裁剪预览MediaPlayer", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_CLIP_PREVIEW_MEDIA_PLAYER_INT_SYNC, new String[]{"default", "系统方案", "MediaCodec解码播放方案"}, new int[]{-1, 1, 2}));
            sightSettingsUI.f201528h.add(new C69849d("音频录制方案", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_AUDIO_RECORDER_TYPE_INT_SYNC, new String[]{"-1", "MediaCodec", "MediaRecorder"}, new int[]{-1, 1, 2}));
            SightSettingsUI sightSettingsUI3 = sightSettingsUI;
            sightSettingsUI.f201528h.add(new C69849d("预览裁剪方式", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_PREVIEW_CROP_INT_SYNC, new String[]{"跟随配置", "预览GPU裁剪", "预览CPU裁剪"}, new int[]{-1, 1, 2}));
            sightSettingsUI.f201528h.add(new C69849d("预设配置", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC, new String[]{"跟后台配置", "MediaCodec+540p录制", "MediaCodec+720p双倍码率录制+后期压缩", "FFMpeg+540p录制", "FFMpeg+720p双倍码率录制+后期压缩", "MediaCodec+720p原码率录制", "FFMpeg+720p原码率录制", "MediaCodec+1080p+实时压缩", "MediaCodec+1080p+实时压缩/旋转", "FFMpeg+1080p+实时压缩", "FFMpeg+1080p+实时压缩/旋转", "MediaCodec+1080p双倍码率+后压+实时压缩"}, new int[]{-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}));
            sightSettingsUI.f201528h.add(new C69849d("重编码抛异常到兜底逻辑", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_REMUX_THROW_ERROR_INT_SYNC, new String[]{"不抛异常", "抛异常"}, new int[]{-1, 1}));
            sightSettingsUI.f201528h.add(new C69849d("录制创建编码器抛异常", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_RECORD_THROW_ERROR_INT_SYNC, new String[]{"不抛异常", "抛异常"}, new int[]{-1, 1}));
            sightSettingsUI.f201528h.add(new C69849d("转码使用ffmpeg合成器", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_INT_SYNC, new String[]{"使用默认配置", "使用MP4V2", "使用FFMPEG"}, new int[]{-1, 1, 2}));
            sightSettingsUI.f201528h.add(new C69849d("拍摄使用ffmpeg合成器", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_CAPTURE_USE_FFMPEG_INT_SYNC, new String[]{"使用默认配置", "使用MP4V2", "使用FFMPEG"}, new int[]{-1, 1, 2}));
            sightSettingsUI.f201528h.add(new C69849d("ffmpeg合成器写入Codec PTS", C72994y1.C72995a.USERINFO_LOCAL_SIGHT_RECORD_USE_FFMPEG_CODEC_PTS_INT_SYNC, new String[]{"使用默认配置", "写入Codec pts", "不写入Codec pts，自己计算"}, new int[]{-1, 1, 2}));
            sightSettingsUI.f201524d = (ListView) sightSettingsUI.findViewById(C0966R.C0970id.fph);
            C69847c cVar = new C69847c();
            sightSettingsUI.f201525e = cVar;
            sightSettingsUI.f201524d.setAdapter(cVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightSettingsUI$b */
    public class C69846b implements MenuItem.OnMenuItemClickListener {
        public C69846b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SightSettingsUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightSettingsUI$c */
    public class C69847c extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightSettingsUI$c$a */
        public class C69848a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C69849d f201532d;

            public C69848a(C69847c cVar, C69849d dVar) {
                this.f201532d = dVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/SightSettingsUI$ChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C69849d dVar = this.f201532d;
                dVar.getClass();
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                int i = 0;
                while (true) {
                    String[] strArr = dVar.f201534b;
                    if (i < strArr.length) {
                        linkedList.add(strArr[i]);
                        linkedList2.add(Integer.valueOf(i));
                        i++;
                    } else {
                        C76879j.m92732c(SightSettingsUI.this, "", linkedList, linkedList2, "", new C69853y0(dVar));
                        C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/SightSettingsUI$ChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                }
            }
        }

        public C69847c() {
        }

        public int getCount() {
            return SightSettingsUI.this.f201528h.size();
        }

        public Object getItem(int i) {
            return SightSettingsUI.this.f201528h.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            String str;
            TextView textView = new TextView(SightSettingsUI.this);
            C69849d dVar = (C69849d) getItem(i);
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.f201533a);
            sb.append("->:");
            int intValue = ((Integer) SightSettingsUI.this.f201526f.get(dVar.f201536d, 0)).intValue();
            int i2 = 0;
            while (true) {
                int[] iArr = dVar.f201535c;
                if (i2 >= iArr.length) {
                    str = dVar.f201534b[0];
                    break;
                }
                if (intValue == iArr[i2]) {
                    String[] strArr = dVar.f201534b;
                    if (i2 < strArr.length) {
                        str = strArr[i2];
                        break;
                    }
                }
                i2++;
            }
            sb.append(str);
            textView.setText(sb.toString());
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setHeight(C76577a.m92151b(MMApplicationContext.getContext(), 50));
            if (i % 2 == 1) {
                textView.setBackgroundColor(Color.parseColor("#e2efda"));
            }
            textView.setOnClickListener(new C69848a(this, dVar));
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.SightSettingsUI$d */
    public class C69849d {

        /* renamed from: a */
        public String f201533a;

        /* renamed from: b */
        public String[] f201534b;

        /* renamed from: c */
        public int[] f201535c;

        /* renamed from: d */
        public C72994y1.C72995a f201536d;

        public C69849d(String str, C72994y1.C72995a aVar, String[] strArr, int[] iArr) {
            this.f201533a = str;
            this.f201534b = strArr;
            this.f201536d = aVar;
            this.f201535c = iArr;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bzu;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f201526f = new CaptureMMProxy(this.f201527g);
        this.f201527g.mo135257a(new C69845a());
        setBackBtn(new C69846b());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f201527g.mo135260d();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
