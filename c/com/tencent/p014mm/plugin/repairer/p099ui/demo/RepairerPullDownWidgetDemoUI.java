package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bj2.C0292a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uz2.C65488a0;
import uz2.C65490m;
import z04.C119027c;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "Landroid/view/View;", "e", "Landroid/view/View;", "getBtnSetDemo", "()Landroid/view/View;", "setBtnSetDemo", "(Landroid/view/View;)V", "btnSetDemo", "f", "getBtnSetMusic", "setBtnSetMusic", "btnSetMusic", "h", "getBtnOnPreOpen", "setBtnOnPreOpen", "btnOnPreOpen", "i", "getBtnOnPostOpen", "setBtnOnPostOpen", "btnOnPostOpen", "j", "getBtnOnPreClose", "setBtnOnPreClose", "btnOnPreClose", "n", "getBtnOnPostClose", "setBtnOnPostClose", "btnOnPostClose", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI */
public final class RepairerPullDownWidgetDemoUI extends BaseRepairerUI {

    /* renamed from: d */
    public FrameLayout f20491d;

    /* renamed from: e */
    public View f20492e;

    /* renamed from: f */
    public View f20493f;

    /* renamed from: g */
    public final C13601g f20494g = C36568h.m40985a(new C5118a(this));

    /* renamed from: h */
    public View f20495h;

    /* renamed from: i */
    public View f20496i;

    /* renamed from: j */
    public View f20497j;

    /* renamed from: n */
    public View f20498n;

    /* renamed from: o */
    public ImageView f20499o;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI$a */
    public static final class C5118a extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ RepairerPullDownWidgetDemoUI f20500d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5118a(RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
            super(0);
            this.f20500d = repairerPullDownWidgetDemoUI;
        }

        public Object invoke() {
            return (Button) this.f20500d.findViewById(C0966R.C0970id.amd);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI$b */
    public static final class C5119b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPullDownWidgetDemoUI f20501d;

        public C5119b(RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
            this.f20501d = repairerPullDownWidgetDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20501d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI$c */
    public static final class C5120c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RepairerPullDownWidgetDemoUI f20502d;

        public C5120c(RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
            this.f20502d = repairerPullDownWidgetDemoUI;
        }

        public final void run() {
            C65490m mVar = new C65490m();
            mVar.f188445d = 0;
            mVar.f188446e = 1;
            RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI = this.f20502d;
            View view = repairerPullDownWidgetDemoUI.f20492e;
            if (view == null) {
                C87412m.m108603p("btnSetDemo");
                throw null;
            } else if (repairerPullDownWidgetDemoUI.f20491d != null) {
                new C65488a0();
                view.setOnClickListener(new C0292a0(repairerPullDownWidgetDemoUI));
                RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI2 = this.f20502d;
                View view2 = repairerPullDownWidgetDemoUI2.f20493f;
                if (view2 == null) {
                    C87412m.m108603p("btnSetMusic");
                    throw null;
                } else if (repairerPullDownWidgetDemoUI2.f20491d != null) {
                    repairerPullDownWidgetDemoUI2.getClass();
                    C65488a0 a0Var = new C65488a0();
                    a0Var.f188439d = "1";
                    a0Var.f188441f = "<MusicVideoStatusOpenParams>\n<FinderMVSongInfo>\n    <songName>永不失联的爱（《小妖的金色城堡》戏剧主题曲）</songName>\n    <singer>周兴哲</singer>\n    <musicDataUrl>http://c6.y.qq.com/rsc/fcgi-bin/fcg_pyq_play.fcg?songid=&amp;songmid=004c4CEB3jfz7a&amp;songtype=1&amp;fromtag=46&amp;uin=414367047&amp;code=85A88</musicDataUrl>\n    <musicAppId>wx5aa333606550dfd5</musicAppId>\n    <musicWebUrl>https://i.y.qq.com/v8/playsong.html?platform=11&amp;appshare=android_qq&amp;appversion=10090506&amp;hosteuin=7e6PoiCloevl&amp;songmid=004c4CEB3jfz7a&amp;type=0&amp;appsongtype=1&amp;_wv=1&amp;source=weixin&amp;ADTAG=wxfshare</musicWebUrl>\n    <songId>qqmusic_202550561</songId>\n    <lyric>[ti:永不失联的爱&#x20;(原创概念版)&#x20;(《小妖的金色城堡》戏剧主题曲)]&#x0A;[ar:周兴哲]&#x0A;[al:永不失联的爱]&#x0A;[by:]&#x0A;[offset:0]&#x0A;[00:00.00]永不失联的爱&#x20;(Unbreakable&#x20;Love)&#x20;-&#x20;周兴哲&#x20;(Eric&#x20;Chou)&#x0A;[00:04.61]词：饶雪漫&#x0A;[00:09.22]曲：周兴哲&#x0A;[00:13.83]编曲：吕圣斐&#x0A;[00:18.44]制作人：袁伟翔/吕圣斐&#x0A;[00:23.05]亲爱的你躲在哪里发呆&#x0A;[00:27.31]&#x0A;[00:28.79]有什么心事还无法释怀&#x0A;[00:32.75]&#x0A;[00:34.37]我们总把人生想得太坏&#x0A;[00:38.23]&#x0A;[00:39.99]像旁人不允许我们的怪&#x0A;[00:44.09]&#x0A;[00:45.69]每一片与众不同的云彩&#x0A;[00:49.79]&#x0A;[00:51.38]都需要找到天空去存在&#x0A;[00:55.15]&#x0A;[00:56.96]我们都习惯了原地徘徊&#x0A;[01:01.18]&#x0A;[01:02.61]却无法习惯被依赖&#x0A;[01:07.05]&#x0A;[01:08.97]你给我&#x20;这一辈子都不想失联的爱&#x0A;[01:15.07]&#x0A;[01:15.60]相信爱的征途就是星辰大海&#x0A;[01:20.62]美好剧情&#x20;不会更改&#x0A;[01:25.82]是命运最好的安排&#x0A;[01:30.95]&#x0A;[01:31.50]你是我&#x0A;[01:33.30]这一辈子都不想失联的爱&#x0A;[01:37.55]&#x0A;[01:38.27]何苦残忍逼我把手轻轻放开&#x0A;[01:43.18]请快回来&#x20;想听你说&#x0A;[01:48.43]说你还在&#x0A;[01:51.75]&#x0A;[02:16.17]走过陪你看流星的天台&#x0A;[02:20.17]&#x0A;[02:21.71]熬过失去你漫长的等待&#x0A;[02:25.87]&#x0A;[02:27.36]好担心没人懂你的无奈&#x0A;[02:31.57]&#x0A;[02:32.97]离开我谁还把你当小孩&#x0A;[02:36.97]&#x0A;[02:38.79]我猜你一定也会想念我&#x0A;[02:42.81]&#x0A;[02:44.23]也怕我失落在茫茫人海&#x0A;[02:48.15]&#x0A;[02:49.90]没关系只要你肯回头望&#x0A;[02:54.05]&#x0A;[02:55.52]会发现我一直都在&#x0A;[03:00.34]&#x0A;[03:01.93]你给我&#x20;这一辈子都不想失联的爱&#x0A;[03:07.86]&#x0A;[03:08.77]你的每条讯息都是心跳节拍&#x0A;[03:13.55]每秒都想&#x20;拥你入怀&#x0A;[03:18.78]全世界你最可爱&#x0A;[03:23.87]&#x0A;[03:24.59]你是我&#x20;这一辈子都不想失联的爱&#x0A;[03:30.46]&#x0A;[03:31.08]就算你的呼吸远在千山之外&#x0A;[03:36.09]请你相信&#x20;我给的爱&#x0A;[03:41.35]值得你爱</lyric>\n    <albumName>如果雨之后</albumName>\n    <albumUrl>http://y.gtimg.cn/music/photo_new/T002R500x500M000003xoLyf0Xj3Oe_1.jpg</albumUrl>\n    <genre>Rock&#x20;摇滚</genre>\n    <publicTime></publicTime>\n    <publicTimeS>1513267200</publicTimeS>\n    <extraInfo></extraInfo>\n    <identification></identification>\n    <duration>259668</duration>\n</FinderMVSongInfo>\n<musicShareItem><mvObjectId>13537773606918162528</mvObjectId><mvNonceId>15477112920566613854</mvNonceId><mvCoverUrl>http://wxapp.tc.qq.com/251/20350/stodownload?encfilekey=XGocBFxVWK5dcyOOqpEU47RpBHQIvlhnZAn5bY8k59AkoMZb59VXcoicCFuH0s5rRCp5Z1h5hKiankTWKpgUx9ZibFQzPzclxLw4TX0HWicNo05LGEDUA4zrPSKKbUrH7Ldx8AuVNRpLeAo0RqQ97zykBSLemflAfuicgVZbiabVMjqlxlg4p3W4kLSQ&amp;adaptivelytrans=0&amp;bizid=1023&amp;dotrans=0&amp;hy=SH&amp;idx=1&amp;m=7764a411e365bbfe048f079b2d6ec8fe&amp;token=x5Y29zUxcibDL4kjgECWmgYIjC6afK7YsLITpOickQAibbibrd2icfwEBtuIlrLkGpqoN</mvCoverUrl><mvMakerFinderNickname>大型精分现场-</mvMakerFinderNickname><mvSingerName></mvSingerName><mvAlbumName></mvAlbumName><mvMusicGenre></mvMusicGenre><mvIssueDate>0</mvIssueDate><mvIdentification></mvIdentification><musicDuration>0</musicDuration><mvExtInfo>null</mvExtInfo></musicShareItem>\n</MusicVideoStatusOpenParams>";
                    view2.setOnClickListener(new C0292a0(repairerPullDownWidgetDemoUI2));
                    RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI3 = this.f20502d;
                    Object value = ((C36570n) repairerPullDownWidgetDemoUI3.f20494g).getValue();
                    C87412m.m108593f(value, "<get-btnSetFinder>(...)");
                    View view3 = (View) value;
                    RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI4 = this.f20502d;
                    if (repairerPullDownWidgetDemoUI4.f20491d != null) {
                        repairerPullDownWidgetDemoUI4.getClass();
                        C65488a0 a0Var2 = new C65488a0();
                        a0Var2.f188439d = "1";
                        byte[] bytes = "{\"feedId\":\"13548507870956427363\",\"nickname\":\"搞笑的马姐姐\",\"mediaType\":4,\"mediaList\":[{\"mediaType\":4,\"url\":\"http:\\/\\/wxapp.tc.qq.com\\/251\\/20302\\/stodownload?encfilekey=RBfjicXSHKCOONJnTbRmmlD8cOQPXE48ibk28aQkWiaibPAGmnFwfiaicdHzFmC8Xib3lp8wQDcurfFsIeXsIrJOxZM3cgnjEIcGTrGJGFaibCribvBkJJR44jzK9rrQzfic57CbT848ojDEhMRdzxSqFkTmUP16TdvK0l6In2kibMNTKL2GkU&adaptivelytrans=0&bizid=1023&dotrans=770&hy=SH&idx=1&m=78f2191d4f3bc58cc1c3cada01d963a5&scene=0\",\"url_token\":\"&token=x5Y29zUxcibBS38aOqRFIQ87WbwiblzFWMZdS4fA6BXnzibn4thdqic58QmQ8OLUibHhwibMV4vg3Vuck\",\"thumbUrl\":\"http:\\/\\/wxapp.tc.qq.com\\/251\\/20304\\/stodownload?encfilekey=jEXicia3muM3GjTlk1Z3kYCefzc4VU4EASuOwDeckXh5Rug76ZL97cxCCpvaFtHBsGREKibHnyTyzttmgvYvrgVzfuXsoUl1hqyK7Vkna0qvyzo7icfnWniaahDQTGHlxQ4ACJsIFics7seddFBsjibc0N2iaiaibY1T3AA2AqR5dWUvforxA&adaptivelytrans=0&bizid=1023&dotrans=0&hy=SH&idx=1&m=38713687ec5f097bd8969a30b083fc46\",\"thumb_url_token\":\"&token=cztXnd9GyrHT1jF33iahtW5WKoMicnJlTUZCMdAJYQKoJ5W9KsBSCfBWd5dic7zQcCL\",\"decodeKey\":\"840422575\",\"width\":576,\"height\":1024,\"videoDuration\":20,\"mediaId\":\"finder_video_xV0_8d2f73ca02ea8d0128babfa43c63d7bc\",\"mediaPath\":\"\\/storage\\/emulated\\/0\\/Android\\/data\\/com.tencent.mm\\/MicroMsg\\/7ea3dbb6194e65c68e99b7065d4a74e8\\/finder\\/video\\/finder_video_xV0_8d2f73ca02ea8d0128babfa43c63d7bc\",\"fileFormat\":\"xV0\",\"thumbUrlToken\":\"&token=cztXnd9GyrHT1jF33iahtW5WKoMicnJlTUZCMdAJYQKoJ5W9KsBSCfBWd5dic7zQcCL\",\"thumbPath\":\"\\/storage\\/emulated\\/0\\/Android\\/data\\/com.tencent.mm\\/MicroMsg\\/7ea3dbb6194e65c68e99b7065d4a74e8\\/finder\\/image\\/finder_image_thumb_image_8d2f73ca02ea8d0128babfa43c63d7bc\"}]}".getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        a0Var2.f188441f = Base64.encodeToString(bytes, 0, bytes.length, 0);
                        view3.setOnClickListener(new C0292a0(repairerPullDownWidgetDemoUI3));
                        return;
                    }
                    C87412m.m108603p("layoutContainer");
                    throw null;
                } else {
                    C87412m.m108603p("layoutContainer");
                    throw null;
                }
            } else {
                C87412m.m108603p("layoutContainer");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI$d */
    public static final class C5121d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPullDownWidgetDemoUI f20503d;

        public C5121d(RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
            this.f20503d = repairerPullDownWidgetDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f20503d.getClass();
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI$e */
    public static final class C5122e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPullDownWidgetDemoUI f20504d;

        public C5122e(RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
            this.f20504d = repairerPullDownWidgetDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f20504d.getClass();
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI$f */
    public static final class C5123f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPullDownWidgetDemoUI f20505d;

        public C5123f(RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
            this.f20505d = repairerPullDownWidgetDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f20505d.getClass();
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI$g */
    public static final class C5124g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPullDownWidgetDemoUI f20506d;

        public C5124g(RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
            this.f20506d = repairerPullDownWidgetDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f20506d.getClass();
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsb;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("下拉背景Demo");
        setBackBtn(new C5119b(this));
        View findViewById = findViewById(C0966R.C0970id.fkf);
        C87412m.m108593f(findViewById, "findViewById(R.id.layout_container)");
        this.f20491d = (FrameLayout) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.amc);
        C87412m.m108593f(findViewById2, "findViewById(R.id.btn_set_demo)");
        setBtnSetDemo(findViewById2);
        View findViewById3 = findViewById(C0966R.C0970id.ame);
        C87412m.m108593f(findViewById3, "findViewById(R.id.btn_set_music)");
        setBtnSetMusic(findViewById3);
        View findViewById4 = findViewById(C0966R.C0970id.am5);
        C87412m.m108593f(findViewById4, "findViewById(R.id.btn_onPreOpen)");
        setBtnOnPreOpen(findViewById4);
        View findViewById5 = findViewById(C0966R.C0970id.f357590am3);
        C87412m.m108593f(findViewById5, "findViewById(R.id.btn_onPostOpen)");
        setBtnOnPostOpen(findViewById5);
        View findViewById6 = findViewById(C0966R.C0970id.am4);
        C87412m.m108593f(findViewById6, "findViewById(R.id.btn_onPreClose)");
        setBtnOnPreClose(findViewById6);
        View findViewById7 = findViewById(C0966R.C0970id.f357589am2);
        C87412m.m108593f(findViewById7, "findViewById(R.id.btn_onPostClose)");
        setBtnOnPostClose(findViewById7);
        View findViewById8 = findViewById(C0966R.C0970id.fcd);
        C87412m.m108593f(findViewById8, "findViewById(R.id.iv_back)");
        this.f20499o = (ImageView) findViewById8;
        ((C119157j) C119157j.f356862d).mo183895z(new C5120c(this));
        View view = this.f20495h;
        if (view != null) {
            view.setOnClickListener(new C5121d(this));
            View view2 = this.f20496i;
            if (view2 != null) {
                view2.setOnClickListener(new C5122e(this));
                View view3 = this.f20497j;
                if (view3 != null) {
                    view3.setOnClickListener(new C5123f(this));
                    View view4 = this.f20498n;
                    if (view4 != null) {
                        view4.setOnClickListener(new C5124g(this));
                        C20828a b = C20828a.m22825b();
                        ImageView imageView = this.f20499o;
                        if (imageView != null) {
                            b.mo32518g("https://www.dasouji.com/wp-content/uploads/2019/08/@93kumi93-5.jpg", imageView);
                        } else {
                            C87412m.m108603p("ivBack");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("btnOnPostClose");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("btnOnPreClose");
                    throw null;
                }
            } else {
                C87412m.m108603p("btnOnPostOpen");
                throw null;
            }
        } else {
            C87412m.m108603p("btnOnPreOpen");
            throw null;
        }
    }

    public final void setBtnOnPostClose(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f20498n = view;
    }

    public final void setBtnOnPostOpen(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f20496i = view;
    }

    public final void setBtnOnPreClose(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f20497j = view;
    }

    public final void setBtnOnPreOpen(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f20495h = view;
    }

    public final void setBtnSetDemo(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f20492e = view;
    }

    public final void setBtnSetMusic(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f20493f = view;
    }
}
