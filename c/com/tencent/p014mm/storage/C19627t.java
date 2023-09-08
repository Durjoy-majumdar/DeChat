package com.tencent.p014mm.storage;

import android.database.Cursor;
import ce2.C28547d;
import com.tencent.p014mm.plugin.biz.C55579f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import e00.C20484c0;
import eb0.C75604z3;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import jw0.C9533e;
import kj2.C117407d;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;
import p227rn.C22240c0;
import p248ug.C52570c0;
import p564iq.C87790d;
import pe3.C47465a;
import rb0.C47970h0;
import rb0.C48009v0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C22503jo3;
import te3.hg4;
import te3.ig4;
import te3.re4;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.storage.t */
public final class C19627t {

    /* renamed from: A */
    public static long f55573A;

    /* renamed from: B */
    public static boolean f55574B;

    /* renamed from: C */
    public static long f55575C;

    /* renamed from: D */
    public static long f55576D;

    /* renamed from: E */
    public static boolean f55577E;

    /* renamed from: F */
    public static boolean f55578F;

    /* renamed from: G */
    public static boolean f55579G = true;

    /* renamed from: H */
    public static int f55580H = (BuildInfo.DEBUG ? 1 : 0);

    /* renamed from: I */
    public static float f55581I = 0.1f;

    /* renamed from: J */
    public static long f55582J = 100;

    /* renamed from: K */
    public static boolean f55583K;

    /* renamed from: L */
    public static final String f55584L = "  {\n  \"hint_txt\": \"创意-20200601_1\",\n  \"url\": \"http://e.cn.miaozhen.com/r/k=2173285&amp;p=7b4m8&amp;dx=__IPDX__&amp;rt=2&amp;pro=n&amp;vo=3cd6923c2&amp;vr=2&amp;o=https%3A%2F%2Fbqry3dlmx.act.qq.com%3FADTAG%3Dtx.wx.gzh.zd?weixinadkey=95e085c866db2ca4da4529b48423634da3737d13156ab08310b6c0d6b29adcaa89dc88172fab7fc8425d0e54f740947d&amp;gdt_vid=wx0p67bjetlwkdc200&amp;weixinadinfo=274376350.wx0p67bjetlwkdc200.75.1\",\n  \"type\": \"0\",\n  \"rl\": \"http://ad.wx.com:12638/cgi-bin/click?viewid=AQPMC0arUNf0CQPrHyjodCs5VFZMaHjNnFIkvHBOD390htHT0XdnqPm0BDH9MUkAoYB%2FfRByH7h%2FQQi2qWqz0QLZOGLM9Bso6lF8R1lt9UCYZgp52mrjKw2WxcN%2BAFL7nHFUUXOaZ4lsRVO3FZjYO0%2FcEz6vF%2BrurDtkNMXYELovcpgunw%2FBFFISwd51aammEdF8uXZUIVQDcU%2Bl4AZrNH3G%2FkRLptgyTuymd1XF86N57Hq4y9khOWAT%2FzVRPJg15eC3LNIe9EHfwYgAtIF58hJBBCqHGzylaZMQapirs0fWlA3nxLme5jCz8j6jiiYEGQZw1e6cPp9tBPMSjH2tOSpLgB0MYLsS5lXHbtgV%2Fq0aGJNqIrxB98G%2Fne473LTxtcmfpnbuEzz83FKEQmJvWwCkZ1Hdv%2BoMU78VGyUBju93WiHEgMZslX3jiKJ2gcIU3ql40m1RkoPbNeIY27ctHly%2Bwbyqp%2BkoNpr9uzDcvSPMOSxSsQ8u8m5adNKGQFVbC3rwtQ3rBgzyJSlD5mv0NqV%2FdE7PO4IbwfwZFSU%2BXrp42k4oUep1Xib5IZqGsj%2Ba0LRMgXdfpm%2F%2FzLMFMoTphu7exUWbRhX2%2ByK7wyC4jJYyYKcemQXO%2BeisMP7ELuqyORfqbUJSOgbZtsgl4zsfHFYz0%2FL%2F1LWzYTatNL65zTiTPA8opxB5BiZOXKTvyRfIvmX%2FcsMo0hz%2BgHoVZMUx2cPjWvrT7krP0h6UOg6Jl3ZaqrKhO4XAoZoV98xJg5sxMwPLeMCbYRgP1ihh5Dyqg7Ia189VXDWfjS7tfwOvSmvz5G4YvMZuXaBMxa89vN1W1QL7DppNAwChouNha0ACfdgBuyY5m4v9TIS%2Bn2jQ%2FuJO9qruZp59v9TRAkY8JN%2BRvyskcN%2FRTJuBOAo05lvaae76EeKSACD9jbstYfhZxRtp07XFFYYmtqKq8YtYtGAe3oNVI9QxII9y4ovw6apcYkh4u5T3ujfV2%2B82BaggnGoQf2Ihv2xxkZhRc%2FUhKISbD2iWveqd0egVgjwJLG%2FpNeqe22cUN%2FUImB0OOSbqe3tuwHtC3nuqg%2Bh1wxLklJo8s3cCkGcOG57TwSStqQ%2Bh2jBiQhrqetkhHhxOc4SQQMmV81i%2FNyeXAZM0s9o1uKnoROakPTo5j7rhcf5cbN%2FZNULpmEYaVTp85cdwk9cc4wxedVD8GXrtBG1WWHzR1Cq6Dnh9aAAKl%2BLw3Db%2Fpw6azbll0AfxDm%2F2PuI3JoXMWwM%2B8rHpv52Wd2XJtSkU5TLWWKUt6cDlbdRnNORO3w6K44IdaK%2BFcvZdn3YdawazK%2BneFfyzJtRYX6yNRDGkJ9Iuvm7YTzinp0%2Fk33OezBSzGjIxKClA2%2FrfZWZncoMpjwALmoHNGqVnj%2F21DaRFnu3zysSi%2BCrP7vOnY3kv6I4saVqPNfD%2FW43hs4zjGyPLrE%2FNJ7gb6Zi9P9vxfA%3D%3D\",\n  \"apurl\": \"http://ad.wx.com:12638/cgi-bin/exposure?viewid=AQPMC0arUNf0CQPrHyjodCs5VFZMaHjNnFIkvHBOD390htHT0XdnqPm0BDH9MUkAoYB%2FfRByH7h%2FQQi2qWqz0QLZOGLM9Bso6lF8R1lt9UCYZgp52mrjKw2WxcN%2BAFL7nHFUUXOaZ4lsRVO3FZjYO0%2FcEz6vF%2BrurDtkNMXYELovcpgunw%2FBFFISwd51aammEdF8uXZUIVQDcU%2Bl4AZrNH3G%2FkRLptgyTuymd1XF86N57Hq4y9khOWAT%2FzVRPJg15eC3LNIe9EHfwYgAtIF58hJBBCqHGzylaZMQapirs0fWlA3nxLme5jCz8j6jiiYEGQZw1e6cPp9tBPMSjH2tOSpLgB0MYLsS5lXHbtgV%2Fq0aGJNqIrxB98G%2Fne473LTxtcmfpnbuEzz83FKEQmJvWwCkZ1Hdv%2BoMU78VGyUBju93WiHEgMZslX3jiKJ2gcIU3ql40m1RkoPbNeIY27ctHly%2Bwbyqp%2BkoNpr9uzDcvSPMOSxSsQ8u8m5adNKGQFVbC3rwtQ3rBgzyJSlD5mv0NqV%2FdE7PO4IbwfwZFSU%2BXrp42k4oUep1Xib5IZqGsj%2Ba0LRMgXdfpm%2F%2FzLMFMoTphu7exUWbRhX2%2ByK7wyC4jJYyYKcemQXO%2BeisMP7ELuqyORfqbUJSOgbZtsgl4zsfHFYz0%2FL%2F1LWzYTatNL65zTiTPA8opxB5BiZOXKTvyRfIvmX%2FcsMo0hz%2BgHoVZMUx2cPjWvrT7krP0h6UOg6Jl3ZaqrKhO4XAoZoV98xJg5sxMwPLeMCbYRgP1ihh5Dyqg7Ia189VXDWfjS7tfwOvSmvz5G4YvMZuXaBMxa89vN1W1QL7DppNAwChouNha0ACfdgBuyY5m4v9TIS%2Bn2jQ%2FuJO9qruZp59v9TRAkY8JN%2BRvyskcN%2FRTJuBOAo05lvaae76EeKSACD9jbstYfhZxRtp07XFFYYmtqKq8YtYtGAe3oNVI9QxII9y4ovw6apcYkh4u5T3ujfV2%2B82BaggnGoQf2Ihv2xxkZhRc%2FUhKISbD2iWveqd0egVgjwJLG%2FpNeqe22cUN%2FUImB0OOSbqe3tuwHtC3nuqg%2Bh1wxLklJo8s3cCkGcOG57TwSStqQ%2Bh2jBiQhrqetkhHhxOc4SQQMmV81i%2FNyeXAZM0s9o1uKnoROakPTo5j7rhcf5cbN%2FZNULpmEYaVTp85cdwk9cc4wxedVD8GXrtBG1WWHzR1Cq6Dnh9aAAKl%2BLw3Db%2Fpw6azbll0AfxDm%2F2PuI3JoXMWwM%2B8rHpv52Wd2XJtSkU5TLWWKUt6cDlbdRnNORO3w6K44IdaK%2BFcvZdn3YdawazK%2BneFfyzJtRYX6yNRDGkJ9Iuvm7YTzinp0%2Fk33OezBSzGjIxKClA2%2FrfZWZncoMpjwALmoHNGqVnj%2F21DaRFnu3zysSi%2BCrP7vOnY3kv6I4saVqPNfD%2FW43hs4zjGyPLrE%2FNJ7gb6Zi9P9vxfA%3D%3D\",\n  \"traceid\": \"wx0p67bjetlwkdc200\",\n  \"group_id\": \"wx0p67bjetlwkdc200_wx0p67bjetlwkdc201\",\n  \"ticket\": \"\",\n  \"aid\": \"274376350\",\n  \"pathType\": \"ad\",\n  \"pt\": 2,\n  \"image_url\": \"http://wxsnsdythumb.wxs.qq.com/109/20204/snsvideodownload?m=7a9c01200bcb2dba6a07c98abad6a89d&amp;filekey=30340201010420301e02016d0402534804107a9c01200bcb2dba6a07c98abad6a89d0203012194040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303630313135323431323030306366656330313336666664393337383639343530393030303030303664&amp;bizid=1023\",\n  \"ad_desc\": \"\",\n  \"biz_appid\": \"wx2c1dad7332964d7d\",\n  \"biz_info\": {\n    \"user_name\": \"gh_f60cb6e1bbe0\",\n    \"nick_name\": \"新加坡旅游局\",\n    \"head_img\": \"http://wx.qlogo.cn/mmhead/Q3auHgzwzM7ibCaN09GMnHSZNhcA9G36v9vhgIUy8OYX4PmcPwvg5Mw/0\",\n    \"biz_uin\": 3580351467,\n    \"signature\": \"心想狮城\"\n  },\n  \"pos_type\": 0,\n  \"watermark_type\": 0,\n  \"logo\": \"\",\n  \"is_cpm\": 0,\n  \"dest_type\": 1,\n  \"material_width\": 690,\n  \"material_height\": 388,\n  \"ad_width\": 0,\n  \"ad_height\": 0,\n  \"use_new_protocol\": 2,\n  \"product_type\": 29,\n  \"material_type\": 0,\n  \"crt_exp_tid\": 0,\n  \"crt_exp_info\": \"\",\n  \"flow_exp_info\": \"[{&quot;exp_para&quot;:[{&quot;name&quot;:94574,&quot;value&quot;:&quot;fz&quot;}]}]\",\n  \"watermark_text\": \"活动推广\",\n  \"crt_size\": \"998\",\n  \"button_action\": \"{&quot;button_text&quot;:&quot;查看详情&quot;,&quot;jump_type&quot;:1,&quot;jump_url&quot;:&quot;http:\\\\/\\\\/e.cn.miaozhen.com\\\\/r\\\\/k=2173285&amp;p=7b4m8&amp;dx=__IPDX__&amp;rt=2&amp;pro=n&amp;vo=3cd6923c2&amp;vr=2&amp;o=https%3A%2F%2Fbqry3dlmx.act.qq.com%3FADTAG%3Dtx.wx.gzh.zd?weixinadkey=6d7c64459169785a1510691ed6578b66d61408173f47c29e364658492046fbd0f7f55ad59c1e22f9fc7b42b8c5a84314&amp;gdt_vid=wx0p67bjetlwkdc200&amp;weixinadinfo=274376350.wx0p67bjetlwkdc200.75.1&quot;,&quot;text_type&quot;:0}\",\n  \"shop_image\": [],\n  \"material_id_list\": [],\n  \"uxinfo\": \"274376350|wx0p67bjetlwkdc200|255437066|0|1594265023|0|0|72058780271891663||AgKTRVlIlM5171j831mAsV9KhXn1D6AO9t0OzsoUSabfNucHFl9DpvWA4VsIAsTV6Sg=|274376355\",\n  \"ext_info\": \"\",\n  \"ad_token\": \"e3e33b5e35db528bb081c41893ca14b2807a454eab3949815e663c37a38de2d32a0fb17d38d299f730fd35928b7f5bbf\",\n  \"crt_info\": \"[{&quot;image_url&quot;:&quot;http://wxsnsdythumb.wxs.qq.com/109/20204/snsvideodownload?m=7a9c01200bcb2dba6a07c98abad6a89d&amp;filekey=30340201010420301e02016d0402534804107a9c01200bcb2dba6a07c98abad6a89d0203012194040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303630313135323431323030306366656330313336666664393337383639343530393030303030303664&amp;bizid=1023&quot;,&quot;thumb_url&quot;:&quot;http://wxsnsdythumb.wxs.qq.com/109/20204/snsvideodownload?m=7a9c01200bcb2dba6a07c98abad6a89d&amp;filekey=30340201010420301e02016d0402534804107a9c01200bcb2dba6a07c98abad6a89d0203012194040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303630313135323431323030306366656330313336666664393337383639343530393030303030303664&amp;bizid=1023&quot;,&quot;height&quot;:540,&quot;width&quot;:960,&quot;size&quot;:74132,&quot;image_md5&quot;:&quot;7a9c01200bcb2dba6a07c98abad6a89d&quot;,&quot;materialId&quot;:&quot;102225575&quot;,&quot;card_info&quot;:{&quot;head_desc_type&quot;:1,&quot;mp_tag_type&quot;:0}}]\",\n  \"reranking_ext_info\": \"{\\\"tid\\\":2303720433,\\\"material_hash\\\":\\\"CMzm1scGEOCTyMQC\\\"}\",\n  \"ext_back_comm\": \"{&quot;pctr&quot;:0.0100109996274}\"\n}";

    /* renamed from: M */
    public static final String f55585M = "  {\n  \"hint_txt\": \"创意-20200619_1\",\n  \"url\": \"pages/Home/StartVideo?type=1&amp;channel=Display&amp;utm_campaign=Bzero1Rock2020&amp;utm_medium=Elegantbanner&amp;page=SeriesPlp&amp;id=24&amp;utm_source=Tencent&amp;utm_content=Krisvideo&amp;weixinadkey=227428a14b944e52c301d99d7769b9d5e6ccd7aa55aac2ca8ca514b5e77a73e83b1579fffef623a5d0972810be5e4fb7&amp;gdt_vid=wx0zfmndr7d35pjq00&amp;weixinadinfo=278576846.wx0zfmndr7d35pjq00.75.1\",\n  \"type\": \"0\",\n  \"rl\": \"http://ad.wx.com:12638/cgi-bin/click?viewid=AQMLjhK9%2BxvCL%2BbfVMG9545FYYZcjMHqO%2FH7kAcJXbOfJ3pI2lso5azF56NZsMbO9EO%2FpZavBO%2BR8alH3Ye8B%2BEbTJKOh7mYbYABZqI2z6CcOwXWVy2AXqo4vfRMXWJ50wY6kr9agFKX5HRWT84ry9jk0CtTy2msHQwO%2FnHjote3vTlUIaPU%2ByRtqbmU6XAa6tyFG5s6deOZgFBa%2Fd73mN1ed4kEmpTHPpxwM6ZyQu2oHU1ihOJkwHdwxdIiU2OAsfeusHQow2ZpIt9jMkFsXRbbeeRfl8ix3mE8pJwvHfVTTV7xl9VIN1nneiShpC59VJB9gXMk1hsGJ0D3zBvijgsvsP9la6CtLH82OqzCqCsWol6fkmiF7HnCYy7s%2FTx6Xvl%2F4rYCRASZMb1ze1N4vzX3ZgTrNtbWAZ2nYNgkajUfv0mrRNTmzMOEaGQBuyG%2BWRscyP%2FmRnjn322UguHb6doAKhC6aEBEmNzjCqwvfIhUB5Ic2thetrxWZeSZu9J3qJJoApv%2FTtUqyovAprpO5bpYDU2Wey%2FRDyzMUyDrgmKeyoCVUVBdxsotWfmee9D2v2V%2BzsfZT8nRP4T463aq5b9bU%2Bh%2Bs7AS2ZN0O0Mnx3pQJQmyHvEmtqbskbm33SaVbQ4HF8ZQYSema%2BNIPr4q0EdkYtzZumXyO0nhO5n09cLLlIzGtg7UcL%2B5GKRFvc9iUzTvvLTtYnIP6Y3kSj2cCu4684DljuUda1BHKdYx5cVH1g3gwb8AlKr9I7ds9Y%2FHf%2BMlxf2122JrKcenN%2FVKvhmzKDMBOhr%2FBsxdqLfmJqkoiYR%2BWKtO%2FrMNFz46GJbblhtf0tLs5%2FRyehTM6wtrClHEzVKafG0z7V17TSntDNkeoNtlgIPD%2BNEo94frMIPXXL1meuAkigvIjV6v4KYuHHOO6iHw83Ba%2BaHVKrzoMA7zz8Svjl8t9lJISj9v1fL9hzHGUwAXIsT%2FG380XdaI%2FU2qFN05tJrc3xWt8jL7Zesqm4SOYTeT6OVWLdNWpOGEkjQYN1E6%2FKy1AnKvEJf7l2PqGC7XyQGJhw8B5PEsy7kzF5eozswE3QNXHORxprtJVB4180D5vSA0vmoRwofP7rooKffbYffkNmHV07hZ1Bvlem%2FvrHY6trqgZB7GL2RWL62E25UeRwIf8fxS45mZJTZyycR6AibgzmHSoDPvg6feSMhsSXaL%2B6NO3nkGk02d3iplelNGJBrCzp6F9RBPFvTTw6%2BMUsMbiQ%3D%3D\",\n  \"apurl\": \"http://ad.wx.com:12638/cgi-bin/exposure?viewid=AQMLjhK9%2BxvCL%2BbfVMG9545FYYZcjMHqO%2FH7kAcJXbOfJ3pI2lso5azF56NZsMbO9EO%2FpZavBO%2BR8alH3Ye8B%2BEbTJKOh7mYbYABZqI2z6CcOwXWVy2AXqo4vfRMXWJ50wY6kr9agFKX5HRWT84ry9jk0CtTy2msHQwO%2FnHjote3vTlUIaPU%2ByRtqbmU6XAa6tyFG5s6deOZgFBa%2Fd73mN1ed4kEmpTHPpxwM6ZyQu2oHU1ihOJkwHdwxdIiU2OAsfeusHQow2ZpIt9jMkFsXRbbeeRfl8ix3mE8pJwvHfVTTV7xl9VIN1nneiShpC59VJB9gXMk1hsGJ0D3zBvijgsvsP9la6CtLH82OqzCqCsWol6fkmiF7HnCYy7s%2FTx6Xvl%2F4rYCRASZMb1ze1N4vzX3ZgTrNtbWAZ2nYNgkajUfv0mrRNTmzMOEaGQBuyG%2BWRscyP%2FmRnjn322UguHb6doAKhC6aEBEmNzjCqwvfIhUB5Ic2thetrxWZeSZu9J3qJJoApv%2FTtUqyovAprpO5bpYDU2Wey%2FRDyzMUyDrgmKeyoCVUVBdxsotWfmee9D2v2V%2BzsfZT8nRP4T463aq5b9bU%2Bh%2Bs7AS2ZN0O0Mnx3pQJQmyHvEmtqbskbm33SaVbQ4HF8ZQYSema%2BNIPr4q0EdkYtzZumXyO0nhO5n09cLLlIzGtg7UcL%2B5GKRFvc9iUzTvvLTtYnIP6Y3kSj2cCu4684DljuUda1BHKdYx5cVH1g3gwb8AlKr9I7ds9Y%2FHf%2BMlxf2122JrKcenN%2FVKvhmzKDMBOhr%2FBsxdqLfmJqkoiYR%2BWKtO%2FrMNFz46GJbblhtf0tLs5%2FRyehTM6wtrClHEzVKafG0z7V17TSntDNkeoNtlgIPD%2BNEo94frMIPXXL1meuAkigvIjV6v4KYuHHOO6iHw83Ba%2BaHVKrzoMA7zz8Svjl8t9lJISj9v1fL9hzHGUwAXIsT%2FG380XdaI%2FU2qFN05tJrc3xWt8jL7Zesqm4SOYTeT6OVWLdNWpOGEkjQYN1E6%2FKy1AnKvEJf7l2PqGC7XyQGJhw8B5PEsy7kzF5eozswE3QNXHORxprtJVB4180D5vSA0vmoRwofP7rooKffbYffkNmHV07hZ1Bvlem%2FvrHY6trqgZB7GL2RWL62E25UeRwIf8fxS45mZJTZyycR6AibgzmHSoDPvg6feSMhsSXaL%2B6NO3nkGk02d3iplelNGJBrCzp6F9RBPFvTTw6%2BMUsMbiQ%3D%3D\",\n  \"traceid\": \"wx0zfmndr7d35pjq00\",\n  \"group_id\": \"wx0zfmndr7d35pjq00_wx0zfmndr7d35pjq01_wx0zfmndr7d35pjq02\",\n  \"ticket\": \"\",\n  \"aid\": \"278576846\",\n  \"pathType\": \"ad\",\n  \"pt\": 9,\n  \"image_url\": \"[{&quot;short_video&quot;:{&quot;materialId&quot;:104596342,&quot;thumb_height&quot;:540,&quot;thumb_md5&quot;:&quot;52975caa35b7191ece431504e8a20d6c&quot;,&quot;thumb_size&quot;:40225,&quot;thumb_url&quot;:&quot;http://wxsnsdythumb.wxs.qq.com/109/20250/snsvideodownload?m=52975caa35b7191ece431504e8a20d6c&amp;filekey=30340201010420301e02016d04025348041052975caa35b7191ece431504e8a20d6c0203009d21040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303730313133343934343030303339326237313336666664393361303761343530393030303030303664&amp;bizid=1023&quot;,&quot;thumb_width&quot;:960,&quot;video_duration&quot;:15,&quot;video_duration_ms&quot;:15070,&quot;video_info&quot;:{&quot;AudioCodec&quot;:&quot;AAC&quot;,&quot;AudioProfile&quot;:&quot;LC&quot;,&quot;AudioSampleRate&quot;:44100,&quot;BitRate&quot;:1231820,&quot;Duration&quot;:15070,&quot;FileSize&quot;:2508599,&quot;Format&quot;:&quot;MOV,MP4,M4A,3GP,3G2,MJ2&quot;,&quot;Height&quot;:540,&quot;Profile&quot;:&quot;HIGH&quot;,&quot;VideoCodec&quot;:&quot;H264&quot;,&quot;Width&quot;:960,&quot;channels&quot;:2,&quot;scan_type&quot;:&quot;Progressive&quot;},&quot;video_md5&quot;:&quot;f77f07f637eabebaedc7b74e874d00ff&quot;,&quot;video_size&quot;:2508599,&quot;video_url&quot;:&quot;http://wxsnsdy.wxs.qq.com/105/20210/snsdyvideodownload?m=f77f07f637eabebaedc7b74e874d00ff&amp;filekey=30340201010420301e020169040253480410f77f07f637eabebaedc7b74e874d00ff0203264737040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303730313133343934343030303433636235313336666664393361303761343530393030303030303639&amp;bizid=1023&quot;,&quot;raw_thumb_url&quot;:&quot;http://wxsnsdythumb.wxs.qq.com/109/20250/snsvideodownload?m=52975caa35b7191ece431504e8a20d6c&amp;filekey=30340201010420301e02016d04025348041052975caa35b7191ece431504e8a20d6c0203009d21040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303730313133343934343030303339326237313336666664393361303761343530393030303030303664&amp;bizid=1023&quot;}}]\",\n  \"ad_desc\": \"\",\n  \"biz_appid\": \"wx032b61d035e02538\",\n  \"biz_info\": {\n    \"user_name\": \"gh_c5a5a55e74a5\",\n    \"nick_name\": \"BVLGARI宝格丽\",\n    \"head_img\": \"http://wx.qlogo.cn/mmhead/Q3auHgzwzM5hgUXh7XsHRGLHRribgcXlRGXKB4phZorcicBGVeDWCYQQ/0\",\n    \"biz_uin\": 3074666211,\n    \"signature\": \"于1884年在罗马建立的高端珠宝品牌BVLGARI宝格丽，始终代表着精美奢华的意大利风格。\"\n  },\n  \"pos_type\": 0,\n  \"watermark_type\": 0,\n  \"logo\": \"\",\n  \"is_cpm\": 1,\n  \"video_info\": {\n    \"displayWidth\": 960,\n    \"displayHeight\": 540,\n    \"thumbUrl\": \"http://wxsnsdythumb.wxs.qq.com/109/20250/snsvideodownload?m=52975caa35b7191ece431504e8a20d6c&amp;filekey=30340201010420301e02016d04025348041052975caa35b7191ece431504e8a20d6c0203009d21040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303730313133343934343030303339326237313336666664393361303761343530393030303030303664&amp;bizid=1023\",\n    \"videoUrl\": \"http://wxsnsdy.wxs.qq.com/105/20210/snsdyvideodownload?m=f77f07f637eabebaedc7b74e874d00ff&amp;filekey=30340201010420301e020169040253480410f77f07f637eabebaedc7b74e874d00ff0203264737040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303730313133343934343030303433636235313336666664393361303761343530393030303030303639&amp;bizid=1023\"\n  },\n  \"weapp_info\": {\n    \"original_id\": \"gh_e70774015690\",\n    \"appid\": \"wx56b4770737a7dddf\",\n    \"nick_name\": \"BVLGARI宝格丽精品店\",\n    \"head_img\": \"http://wx.qlogo.cn/mmhead/Q3auHgzwzM5pN0eR1LRZJzPxALx3mRPYSmiaPbibPE5fQKS8xTy6ichbQ/0\"\n  },\n  \"dest_type\": 6,\n  \"material_width\": 690,\n  \"material_height\": 388,\n  \"ad_width\": 0,\n  \"ad_height\": 0,\n  \"use_new_protocol\": 2,\n  \"product_type\": 29,\n  \"material_type\": 0,\n  \"crt_exp_tid\": 0,\n  \"crt_exp_info\": \"\",\n  \"flow_exp_info\": \"[{&quot;exp_para&quot;:[{&quot;name&quot;:94574,&quot;value&quot;:&quot;fz&quot;}]}]\",\n  \"watermark_text\": \"活动推广\",\n  \"crt_size\": \"538\",\n  \"button_action\": \"{&quot;button_text&quot;:&quot;查看详情&quot;,&quot;jump_type&quot;:6,&quot;jump_url&quot;:&quot;pages\\\\/Home\\\\/StartVideo?type=1&amp;channel=Display&amp;utm_campaign=Bzero1Rock2020&amp;utm_medium=Elegantbanner&amp;page=SeriesPlp&amp;id=24&amp;utm_source=Tencent&amp;utm_content=Krisvideo&amp;weixinadkey=5418655bc3dd454e4ed84dad6962668068661cb2009130ec86f3626ef4700e9b7a06ee64eb5d93f14e87b54ce39699c9&amp;gdt_vid=wx0zfmndr7d35pjq00&amp;weixinadinfo=278576846.wx0zfmndr7d35pjq00.75.1&quot;,&quot;text_type&quot;:0}\",\n  \"shop_image\": [],\n  \"material_id_list\": [],\n  \"uxinfo\": \"278576846|wx0zfmndr7d35pjq00||0|1594264005|0|0|72058780271891663||AgKNIqBiWhQxioBrueuTRKG/ZDGPF4ER7Im3GhiUj6HO7oRLhI/wSZTh3mxc7jqPZug=|278576919\",\n  \"ext_info\": \"{&quot;wx_app_type&quot;:2,&quot;gh_id&quot;:&quot;gh_e70774015690&quot;}\",\n  \"ad_token\": \"e3e33b5e35db528bb081c41893ca14b2807a454eab3949815e663c37a38de2d3779f0258b01c0503fbde6feda83a487b\",\n  \"crt_info\": \"[{&quot;short_video&quot;:{&quot;materialId&quot;:104596342,&quot;thumb_height&quot;:540,&quot;thumb_md5&quot;:&quot;52975caa35b7191ece431504e8a20d6c&quot;,&quot;thumb_size&quot;:40225,&quot;thumb_url&quot;:&quot;http://wxsnsdythumb.wxs.qq.com/109/20250/snsvideodownload?m=52975caa35b7191ece431504e8a20d6c&amp;filekey=30340201010420301e02016d04025348041052975caa35b7191ece431504e8a20d6c0203009d21040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303730313133343934343030303339326237313336666664393361303761343530393030303030303664&amp;bizid=1023&quot;,&quot;thumb_width&quot;:960,&quot;video_duration&quot;:15,&quot;video_duration_ms&quot;:15070,&quot;video_info&quot;:{&quot;AudioCodec&quot;:&quot;AAC&quot;,&quot;AudioProfile&quot;:&quot;LC&quot;,&quot;AudioSampleRate&quot;:44100,&quot;BitRate&quot;:1231820,&quot;Duration&quot;:15070,&quot;FileSize&quot;:2508599,&quot;Format&quot;:&quot;MOV,MP4,M4A,3GP,3G2,MJ2&quot;,&quot;Height&quot;:540,&quot;Profile&quot;:&quot;HIGH&quot;,&quot;VideoCodec&quot;:&quot;H264&quot;,&quot;Width&quot;:960,&quot;channels&quot;:2,&quot;scan_type&quot;:&quot;Progressive&quot;},&quot;video_md5&quot;:&quot;f77f07f637eabebaedc7b74e874d00ff&quot;,&quot;video_size&quot;:2508599,&quot;video_url&quot;:&quot;http://wxsnsdy.wxs.qq.com/105/20210/snsdyvideodownload?m=f77f07f637eabebaedc7b74e874d00ff&amp;filekey=30340201010420301e020169040253480410f77f07f637eabebaedc7b74e874d00ff0203264737040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303730313133343934343030303433636235313336666664393361303761343530393030303030303639&amp;bizid=1023&quot;,&quot;raw_thumb_url&quot;:&quot;http://wxsnsdythumb.wxs.qq.com/109/20250/snsvideodownload?m=52975caa35b7191ece431504e8a20d6c&amp;filekey=30340201010420301e02016d04025348041052975caa35b7191ece431504e8a20d6c0203009d21040d00000004627466730000000131&amp;hy=SH&amp;storeid=32303230303730313133343934343030303339326237313336666664393361303761343530393030303030303664&amp;bizid=1023&quot;}}]\",\n  \"reranking_ext_info\": \"{tid:278576919}\",\n  \"ext_back_comm\": \"{&quot;pctr&quot;:0.0134623190388}\"\n}";

    /* renamed from: a */
    public static final C19627t f55586a = new C19627t();

    /* renamed from: b */
    public static final C47970h0 f55587b = new C47970h0(600000);

    /* renamed from: c */
    public static final HashMap<String, Long> f55588c = new HashMap<>();

    /* renamed from: d */
    public static final HashSet<String> f55589d = new HashSet<>();

    /* renamed from: e */
    public static int f55590e = -1;

    /* renamed from: f */
    public static int f55591f = -1;

    /* renamed from: g */
    public static int f55592g = -1;

    /* renamed from: h */
    public static String f55593h;

    /* renamed from: i */
    public static String f55594i;

    /* renamed from: j */
    public static String f55595j;

    /* renamed from: k */
    public static String f55596k;

    /* renamed from: l */
    public static final C13601g f55597l = C36568h.m40985a(C6720g.f24134d);

    /* renamed from: m */
    public static final C13601g f55598m = C36568h.m40985a(C6717a.f24131d);

    /* renamed from: n */
    public static final C13601g f55599n = C36568h.m40985a(C6725l.f24139d);

    /* renamed from: o */
    public static final C13601g f55600o = C36568h.m40985a(C6719f.f24133d);

    /* renamed from: p */
    public static final C13601g f55601p = C36568h.m40985a(C6718c.f24132d);

    /* renamed from: q */
    public static final C13601g f55602q = C36568h.m40985a(C6724k.f24138d);

    /* renamed from: r */
    public static final C13601g f55603r = C36568h.m40985a(C19628b.f55612d);

    /* renamed from: s */
    public static final boolean f55604s = true;

    /* renamed from: t */
    public static final boolean f55605t = true;

    /* renamed from: u */
    public static final boolean f55606u = true;

    /* renamed from: v */
    public static final C13601g f55607v = C36568h.m40985a(C6722i.f24136d);

    /* renamed from: w */
    public static final C13601g f55608w = C36568h.m40985a(C6721h.f24135d);

    /* renamed from: x */
    public static final C13601g f55609x = C36568h.m40985a(C6723j.f24137d);

    /* renamed from: y */
    public static final boolean f55610y = true;

    /* renamed from: z */
    public static final C13601g f55611z = C36568h.m40985a(C19629d.f55613d);

    /* renamed from: com.tencent.mm.storage.t$a */
    public static final class C6717a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C6717a f24131d = new C6717a();

        public C6717a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("biz_timeline_ad");
        }
    }

    /* renamed from: com.tencent.mm.storage.t$c */
    public static final class C6718c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C6718c f24132d = new C6718c();

        public C6718c() {
            super(0);
        }

        public Object invoke() {
            if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
                return Boolean.FALSE;
            }
            int decodeInt = C19627t.f55586a.mo25837k().decodeInt("BizTimeLineAdOpen", -1);
            if (decodeInt == 0) {
                return Boolean.FALSE;
            }
            boolean z = true;
            if (decodeInt == 1) {
                return Boolean.TRUE;
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_ad_v2, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizCardLogic", "ad open " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.storage.t$f */
    public static final class C6719f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C6719f f24133d = new C6719f();

        public C6719f() {
            super(0);
        }

        public Object invoke() {
            Integer valueOf = Integer.valueOf(C19627t.f55586a.mo25837k().decodeInt("BizAdInsertPos", -1));
            int intValue = valueOf.intValue();
            Log.m105918d("MicroMsg.BizCardLogic", "localInsertPos " + intValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.storage.t$g */
    public static final class C6720g extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C6720g f24134d = new C6720g();

        public C6720g() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: com.tencent.mm.storage.t$h */
    public static final class C6721h extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C6721h f24135d = new C6721h();

        public C6721h() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_recycle_logic_context, 0) == 1) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizCardLogic", "openRecycleLogicContext open " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.storage.t$i */
    public static final class C6722i extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C6722i f24136d = new C6722i();

        public C6722i() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_recycle_preloaded_ad, 0) == 1) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizCardLogic", "RecyclePreLoadedAd open " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.storage.t$j */
    public static final class C6723j extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C6723j f24137d = new C6723j();

        public C6723j() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_recycle_render_vm, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizCardLogic", "openRecycleRenderVM open " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.storage.t$k */
    public static final class C6724k extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C6724k f24138d = new C6724k();

        public C6724k() {
            super(0);
        }

        public Object invoke() {
            C19627t tVar = C19627t.f55586a;
            if (((C22240c0) C86312j.m106911c(C22240c0.class)).mo35410vH()) {
                return Boolean.FALSE;
            }
            if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
                return Boolean.FALSE;
            }
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_canvas_rec_card_v2, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizCardLogic", "recOpen open " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.storage.t$l */
    public static final class C6725l extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C6725l f24139d = new C6725l();

        public C6725l() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C19627t.f55586a.mo25837k().decodeInt("BizTimeLineAdTestMode", 0));
        }
    }

    /* renamed from: com.tencent.mm.storage.t$b */
    public static final class C19628b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19628b f55612d = new C19628b();

        public C19628b() {
            super(0);
        }

        public Object invoke() {
            if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
                return Boolean.FALSE;
            }
            C28547d dVar = (C28547d) C86709a0.m107533q(C28547d.class);
            boolean z = false;
            if (dVar != null && dVar.mo56052aI()) {
                Log.m105924i("MicroMsg.BizCardLogic", "disable prefetchOpen by memory degrade");
                return Boolean.FALSE;
            }
            int decodeInt = C19627t.f55586a.mo25837k().decodeInt("BizTimeLineAdPrefetcherOpen", -1);
            if (decodeInt == 0) {
                return Boolean.FALSE;
            }
            if (decodeInt == 1) {
                return Boolean.TRUE;
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_canvas_prefetcher_v2, 1) == 1) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizCardLogic", "prefetchOpen open " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.storage.t$d */
    public static final class C19629d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C19629d f55613d = new C19629d();

        public C19629d() {
            super(0);
        }

        public Object invoke() {
            if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
                return Boolean.FALSE;
            }
            C28547d dVar = (C28547d) C86709a0.m107533q(C28547d.class);
            boolean z = false;
            if (dVar != null && dVar.mo56052aI()) {
                Log.m105924i("MicroMsg.BizCardLogic", "disable canvasPreloadOpen by memory degrade");
                return Boolean.FALSE;
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_canvas_preload_2, 1) == 1) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.BizCardLogic", "canvasPreloadOpen " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.storage.t$e */
    public static final class C19630e implements l0$$e {

        /* renamed from: d */
        public static final C19630e f55614d = new C19630e();

        /* renamed from: a */
        public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            int optInt;
            int i3 = i;
            int i4 = i2;
            if (i3 == 0 && i4 == 0) {
                C117407d.INSTANCE.mo182089r(1454, 2, 1);
                C47465a aVar = cVar.f127056b.f127083a;
                ig4 ig4 = aVar instanceof ig4 ? (ig4) aVar : null;
                if (ig4 == null) {
                    return 0;
                }
                Log.m105918d("MicroMsg.BizCardLogic", "doBizCardCgi callback " + ig4.f135333g);
                Log.m105924i("MicroMsg.BizCardLogic", "doBizCardCgi callback errType=" + i3 + ", errCode=" + i4 + " interval=" + Integer.valueOf(ig4.f135332f));
                C19627t tVar = C19627t.f55586a;
                int i5 = ig4.f135332f;
                if (i5 <= 259200 && i5 > 60) {
                    long j = ((long) i5) * 1000;
                    C19627t.f55575C = j;
                    tVar.mo25832f().encode("biz_card_refresh_interval", j);
                }
                String str2 = ig4.f135334h;
                if (str2 != null) {
                    try {
                        Log.m105924i("MicroMsg.BizCardLogic", "handleExtInfo extInfo " + str2);
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("ResortRefreshIntervalSec") && (optInt = jSONObject.optInt("ResortRefreshIntervalSec", 0)) > 0 && optInt <= 259200) {
                            C19627t.f55576D = ((long) optInt) * 1000;
                            tVar.mo25832f().encode("biz_card_resort_Refresh_IntervalSec", C19627t.f55576D);
                        }
                        int optInt2 = jSONObject.optInt("MaxAdCount", 1);
                        C19627t.f55592g = jSONObject.optInt("AdInsertPos", 3);
                        tVar.mo25826H(optInt2);
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.BizCardLogic", "handleExtInfo ex " + e.getMessage());
                    }
                }
                if ((ig4.f135331e & 1) == 0) {
                    C19627t.f55586a.mo25822D(ig4.f135333g);
                    C117407d.INSTANCE.mo182089r(1454, 6, 1);
                } else {
                    C117407d.INSTANCE.mo182089r(1454, 5, 1);
                }
                return 0;
            }
            Log.m105920e("MicroMsg.BizCardLogic", "doBizCardCgi callback errType=" + i3 + ", errCode=" + i4);
            C117407d.INSTANCE.mo182089r(1454, 1, 1);
            if (i4 == 1004) {
                C117407d.INSTANCE.mo182089r(1454, 7, 1);
            }
            return 0;
        }
    }

    /* renamed from: A */
    public final String mo25819A(String str) {
        C87412m.m108594g(str, "<this>");
        return "__rec_card_" + str;
    }

    /* renamed from: B */
    public final void mo25820B(String str) {
        if (!C19636w0.f55627d) {
            if (!(str == null || C112551y.m153811k(str)) && ((Boolean) ((C36570n) f55607v).getValue()).booleanValue()) {
                ((C45696d) C86709a0.m107533q(C45696d.class)).mo70951AL(mo25827a(str));
                C117407d.INSTANCE.mo182089r(1454, 132, 1);
            }
        }
    }

    /* renamed from: C */
    public final void mo25821C() {
        Log.m105924i("MicroMsg.BizCardLogic", "exposePreload reset crash flag");
        C9533e.f29713a.mo10210c().encode("biz_canvas_card_expose_preload_crash_times", 0);
    }

    /* renamed from: D */
    public final void mo25822D(String str) {
        String str2 = str;
        if (!C86709a0.m107522a()) {
            Log.m105924i("MicroMsg.BizCardLogic", "saveAdData acc not ready");
        }
        boolean z = false;
        if (str2 == null || C112551y.m153811k(str)) {
            Log.m105924i("MicroMsg.BizCardLogic", "saveAdData data is null");
            C117407d.INSTANCE.mo182089r(1454, 3, 1);
            return;
        }
        C117407d.INSTANCE.mo182089r(1454, 4, 1);
        JSONObject d = mo25830d(str);
        if (d == null) {
            Log.m105924i("MicroMsg.BizCardLogic", "saveAdData adData is null");
            C117407d.INSTANCE.mo182089r(1454, 91, 1);
            return;
        }
        C117407d.INSTANCE.mo182089r(1454, 92, 1);
        if (f55605t) {
            ((C20484c0) C86312j.m106911c(C20484c0.class)).zb0();
        }
        String optString = d.optString("aid");
        String optString2 = d.optString("traceid");
        f55593h = optString2;
        f55594i = optString2;
        Log.m105924i("MicroMsg.BizCardLogic", "saveAdData aid=" + optString + " traceId=" + f55593h);
        String str3 = f55593h;
        if (str3 == null || C112551y.m153811k(str3)) {
            z = true;
        }
        if (!z) {
            mo25849w(d);
            mo25832f().encode(mo25825G("biz_ad_card_data"), str2);
            return;
        }
        C117407d.INSTANCE.mo182089r(1454, 100, 1);
    }

    /* renamed from: E */
    public final boolean mo25823E(int i) {
        int o = mo25841o();
        if (i > o) {
            Log.m105924i("MicroMsg.BizCardLogic", "setQuota value=" + i + ", svrAdCount=" + o);
            return false;
        }
        f55590e = i;
        mo25832f().encode("biz_card_max_client_ad_count", i);
        Log.m105924i("MicroMsg.BizCardLogic", "setQuota value=" + i);
        return true;
    }

    /* renamed from: F */
    public final boolean mo25824F() {
        return mo25842p() >= 1 || mo25834h();
    }

    /* renamed from: G */
    public final String mo25825G(String str) {
        return str + '-' + C86709a0.m107523b().mo121111i();
    }

    /* renamed from: H */
    public final void mo25826H(int i) {
        if (mo25836j() < 0) {
            f55591f = i;
            mo25832f().encode("biz_card_max_ad_count", f55591f);
        }
        int i2 = f55592g;
        boolean z = false;
        if (2 <= i2 && i2 < 11) {
            z = true;
        }
        if (z) {
            mo25832f().encode("biz_card_ad_insert_pos", f55592g);
        }
        Log.m105924i("MicroMsg.BizCardLogic", "handleExtInfo extInfo " + f55591f + ' ' + f55592g);
    }

    /* renamed from: a */
    public final String mo25827a(String str) {
        C87412m.m108594g(str, "<this>");
        return "__ad_card_" + str;
    }

    /* renamed from: b */
    public final void mo25828b(String str, String str2) {
        ((C45696d) C86709a0.m107533q(C45696d.class)).mo70968P2("wxa06c02b5c00ff39b", (String) null, str, str2);
    }

    /* renamed from: c */
    public final void mo25829c(int i) {
        long j;
        int i2 = i;
        if (mo25833g()) {
            if (mo25842p() == 1) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(new JSONObject(f55586a.mo25837k().getInt("BizTimeLineAdMockType", 0) == 0 ? f55585M : f55584L));
                C13598b0 b0Var = C13598b0.f38549a;
                jSONObject.put("advertisement_info", jSONArray);
                jSONObject.put("advertisement_num", 1);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "adData.toString()");
                mo25822D(jSONObject2);
                mo25832f().encode("biz_card_last_time", System.currentTimeMillis());
            } else if (!mo25839m()) {
                long j2 = mo25832f().getLong("biz_card_last_time", 0);
                long currentTimeMillis = System.currentTimeMillis();
                long abs = Math.abs(currentTimeMillis - j2);
                String str = "biz_card_last_time";
                if (i2 == 1) {
                    long j3 = f55576D;
                    if (j3 > 1000) {
                        j = j3;
                    } else {
                        j = mo25832f().getLong("biz_card_resort_Refresh_IntervalSec", 3600000);
                        f55576D = j;
                    }
                } else {
                    long j4 = f55575C;
                    if (j4 > 1000) {
                        j = j4;
                    } else {
                        j = mo25832f().getLong("biz_card_refresh_interval", 3600000);
                        f55575C = j;
                    }
                }
                if (3 == i2 || ((mo25824F() || abs >= j) && (!mo25824F() || abs >= 10000))) {
                    mo25832f().encode(str, System.currentTimeMillis());
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    bVar.f127066a = new hg4();
                    bVar.f127067b = new ig4();
                    bVar.f127068c = "/cgi-bin/mmbiz-bin/recommend/timelinecard";
                    bVar.f127069d = 2781;
                    C47350c a = bVar.mo72403a();
                    C47465a aVar = a.f127055a.f127080a;
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.TimeLineCardReq");
                    hg4 hg4 = (hg4) aVar;
                    hg4.f183479d = System.currentTimeMillis();
                    hg4.f183480e = 1;
                    hg4.f183481f = "";
                    hg4.f183482g = mo25843q(i);
                    Log.m105924i("MicroMsg.BizCardLogic", "doBizCardCgi testMode=" + mo25842p() + ", adPreviewMode=" + mo25834h() + " from=" + i2 + " interval=" + j + " lastTime=" + j2 + " currentMills=" + currentTimeMillis);
                    C117407d.INSTANCE.mo182089r(1454, 0, 1);
                    C89144l0.m111429e(a, C19630e.f55614d, false);
                    return;
                }
                Log.m105918d("MicroMsg.BizCardLogic", "doBizCardCgi delta < interval, return from=" + i2);
            } else if (mo25824F() || Math.abs(System.currentTimeMillis() - f55573A) >= 300000) {
                f55573A = System.currentTimeMillis();
                Log.m105924i("MicroMsg.BizCardLogic", "doBizCardCgi testMode=" + mo25842p() + ", adPreviewMode=" + mo25834h() + ", from=" + i2);
                String str2 = 2 == i2 ? "mainCellExpose" : "resortEnd";
                mo25828b(str2, "from:" + i2);
            } else {
                Log.m105918d("MicroMsg.BizCardLogic", "doBizCardCgi delta < interval, return from=" + i2);
            }
        }
    }

    /* renamed from: d */
    public final JSONObject mo25830d(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            JSONArray optJSONArray = new JSONObject(str).optJSONArray("advertisement_info");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                return optJSONArray.optJSONObject(0);
            }
        } catch (Exception e) {
            Log.m105929w("MicroMsg.BizCardLogic", "getAdData ex %s", e.getMessage());
        }
        return null;
    }

    /* renamed from: e */
    public final int mo25831e() {
        C13601g gVar = f55600o;
        if (((Number) ((C36570n) gVar).getValue()).intValue() > 0) {
            Log.m105924i("MicroMsg.BizCardLogic", "getAdInsertPos localInsertPos = " + ((Number) ((C36570n) gVar).getValue()).intValue());
            return ((Number) ((C36570n) gVar).getValue()).intValue();
        }
        int i = f55592g;
        boolean z = false;
        if (2 <= i && i < 11) {
            return i;
        }
        int decodeInt = mo25832f().decodeInt("biz_card_ad_insert_pos", 3);
        f55592g = decodeInt;
        if (2 <= decodeInt && decodeInt < 11) {
            z = true;
        }
        if (!z) {
            f55592g = 3;
        }
        return f55592g;
    }

    /* renamed from: f */
    public final MultiProcessMMKV mo25832f() {
        return (MultiProcessMMKV) ((C36570n) f55598m).getValue();
    }

    /* renamed from: g */
    public final boolean mo25833g() {
        return !((C52570c0) C86709a0.m107533q(C52570c0.class)).mo58182e() && ((Boolean) ((C36570n) f55601p).getValue()).booleanValue() && !((C22240c0) C86312j.m106911c(C22240c0.class)).mo35410vH();
    }

    /* renamed from: h */
    public final boolean mo25834h() {
        if (mo25837k().decodeInt("BizTimeLineAdPreviewMode", 0) != 1) {
            return false;
        }
        long decodeLong = mo25837k().decodeLong("BizTimeLineAdPreviewModeTime", 0);
        return decodeLong > 0 && System.currentTimeMillis() - decodeLong < 86400000;
    }

    /* renamed from: i */
    public final boolean mo25835i() {
        return ((Boolean) ((C36570n) f55611z).getValue()).booleanValue();
    }

    /* renamed from: j */
    public final int mo25836j() {
        int decodeInt;
        C9533e eVar = C9533e.f29713a;
        if (!((Boolean) ((C36570n) C9533e.f29720h).getValue()).booleanValue() || (decodeInt = mo25837k().decodeInt("BizTimeLineHardcodeAdQuota", -1)) <= 0) {
            return -1;
        }
        Log.m105924i("MicroMsg.BizCardLogic", "getServerMaxAdCount use hardCodeAdCount=" + decodeInt);
        return decodeInt;
    }

    /* renamed from: k */
    public final MultiProcessMMKV mo25837k() {
        return (MultiProcessMMKV) ((C36570n) f55597l).getValue();
    }

    /* renamed from: l */
    public final long mo25838l(long j, int i) {
        if (i <= 0) {
            i = mo25831e();
        }
        C19625p0 Jx0 = C48009v0.Jx0();
        int i2 = i - 2;
        if (i2 < 0) {
            i2 = 0;
        }
        Jx0.getClass();
        C19623o0 o0Var = null;
        Cursor rawQuery = Jx0.f55550d.rawQuery("SELECT * FROM BizTimeLineInfo order by orderFlag DESC limit 1 offset " + i2, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            o0Var = new C19623o0();
            o0Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        if (o0Var == null) {
            Log.m105928w("MicroMsg.BizCardLogic", "getOrderFlag lastTimeLineInfo is null");
            return 0;
        }
        long j2 = i == 1 ? o0Var.field_orderFlag + 1 : o0Var.field_orderFlag - 1;
        if (j2 == j) {
            return j2;
        }
        while (C48009v0.Jx0().mo25789SE(j2, "orderFlag") != null) {
            Log.m105928w("MicroMsg.BizCardLogic", "insertAd field_orderFlag conflict orderFlag=" + j2);
            j2 += -1;
        }
        return j2;
    }

    /* renamed from: m */
    public final boolean mo25839m() {
        return ((Boolean) ((C36570n) f55603r).getValue()).booleanValue() && mo25833g();
    }

    /* renamed from: n */
    public final boolean mo25840n() {
        return ((Boolean) ((C36570n) f55602q).getValue()).booleanValue();
    }

    /* renamed from: o */
    public final int mo25841o() {
        int i = f55591f;
        boolean z = false;
        if (1 <= i && i < 11) {
            return i;
        }
        int j = mo25836j();
        if (j <= 0) {
            j = mo25832f().decodeInt("biz_card_max_ad_count", 1);
        }
        f55591f = j;
        if (1 <= j && j < 11) {
            z = true;
        }
        if (!z) {
            f55591f = 1;
        }
        return f55591f;
    }

    /* renamed from: p */
    public final int mo25842p() {
        return ((Number) ((C36570n) f55599n).getValue()).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0138 A[Catch:{ Exception -> 0x0338 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013c A[Catch:{ Exception -> 0x0338 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo25843q(int r37) {
        /*
            r36 = this;
            java.lang.Class<ex0.d> r0 = ex0.C45696d.class
            java.lang.String r1 = "index"
            com.tencent.mm.storage.p0 r2 = rb0.C48009v0.Jx0()
            r3 = 5
            java.util.List r2 = r2.mo25798bF(r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x033c }
            r6 = 0
        L_0x001c:
            boolean r7 = r2.hasNext()     // Catch:{ Exception -> 0x033c }
            if (r7 == 0) goto L_0x02dd
            java.lang.Object r7 = r2.next()     // Catch:{ Exception -> 0x033c }
            int r10 = r6 + 1
            if (r6 < 0) goto L_0x02d6
            com.tencent.mm.storage.o0 r7 = (com.tencent.p014mm.storage.C19623o0) r7     // Catch:{ Exception -> 0x033c }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x033c }
            r12.<init>()     // Catch:{ Exception -> 0x033c }
            r12.put(r1, r6)     // Catch:{ Exception -> 0x033c }
            boolean r6 = r7.mo25754B2()     // Catch:{ Exception -> 0x033c }
            java.lang.String r13 = "title"
            java.lang.String r14 = "bizuin"
            java.lang.String r15 = "decode(uri.getQueryParam…\"__biz\"), Base64.NO_WRAP)"
            java.lang.String r11 = "__biz"
            java.lang.String r8 = "is_fold"
            java.lang.String r9 = "msg"
            java.lang.String r5 = "type"
            r16 = r2
            java.lang.String r2 = "user_action"
            r17 = r10
            java.lang.String r10 = "msg_time"
            r18 = r0
            java.lang.String r0 = "mid"
            r19 = r3
            java.lang.String r3 = "idx"
            r20 = r4
            if (r6 == 0) goto L_0x0178
            java.lang.String r6 = "is_recommand"
            r4 = 0
            r12.put(r6, r4)     // Catch:{ Exception -> 0x0338 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x0338 }
            r4.<init>()     // Catch:{ Exception -> 0x0338 }
            java.lang.Class<gw0.b> r6 = gw0.C76073b.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x0338 }
            gw0.b r6 = (gw0.C76073b) r6     // Catch:{ Exception -> 0x0338 }
            if (r6 == 0) goto L_0x0081
            r22 = r4
            r21 = r5
            long r4 = r7.field_msgId     // Catch:{ Exception -> 0x0338 }
            r23 = r9
            java.lang.String r9 = r7.field_content     // Catch:{ Exception -> 0x0338 }
            s90.f r4 = r6.mo94597JZ(r4, r9)     // Catch:{ Exception -> 0x0338 }
            goto L_0x0088
        L_0x0081:
            r22 = r4
            r21 = r5
            r23 = r9
            r4 = 0
        L_0x0088:
            if (r4 == 0) goto L_0x0169
            java.util.LinkedList<s90.j> r4 = r4.f226295i     // Catch:{ Exception -> 0x0338 }
            if (r4 == 0) goto L_0x0169
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0338 }
            r5 = 0
        L_0x0093:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x0338 }
            if (r6 == 0) goto L_0x0162
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x0338 }
            int r9 = r5 + 1
            if (r5 < 0) goto L_0x015d
            s90.j r6 = (s90.C77630j) r6     // Catch:{ Exception -> 0x0338 }
            r24 = r4
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0338 }
            r4.<init>()     // Catch:{ Exception -> 0x0338 }
            r25 = r9
            java.lang.String r9 = r6.f226326e     // Catch:{ Exception -> 0x0338 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x0338 }
            if (r9 != 0) goto L_0x0101
            java.lang.String r9 = r6.f226326e     // Catch:{ Exception -> 0x0338 }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x0338 }
            r26 = r12
            java.lang.String r12 = r9.getQueryParameter(r3)     // Catch:{ Exception -> 0x0338 }
            r27 = r2
            r2 = 0
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r2)     // Catch:{ Exception -> 0x0338 }
            java.lang.String r2 = r9.getQueryParameter(r0)     // Catch:{ Exception -> 0x0338 }
            r30 = r1
            r28 = r7
            r29 = r8
            r7 = 0
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r7)     // Catch:{ Exception -> 0x0338 }
            java.lang.String r7 = r9.getQueryParameter(r11)     // Catch:{ Exception -> 0x0338 }
            r8 = 2
            byte[] r7 = android.util.Base64.decode(r7, r8)     // Catch:{ Exception -> 0x0338 }
            gy3.C87412m.m108593f(r7, r15)     // Catch:{ Exception -> 0x0338 }
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x0338 }
            java.nio.charset.Charset r9 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x0338 }
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x0338 }
            r31 = r10
            r9 = 0
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r9)     // Catch:{ Exception -> 0x0338 }
            r4.put(r14, r7)     // Catch:{ Exception -> 0x0338 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0338 }
            r4.put(r3, r12)     // Catch:{ Exception -> 0x0338 }
            java.lang.String r1 = r6.f226325d     // Catch:{ Exception -> 0x0338 }
            r4.put(r13, r1)     // Catch:{ Exception -> 0x0338 }
            goto L_0x010d
        L_0x0101:
            r30 = r1
            r27 = r2
            r28 = r7
            r29 = r8
            r31 = r10
            r26 = r12
        L_0x010d:
            r1 = r30
            r4.put(r1, r5)     // Catch:{ Exception -> 0x0338 }
            long r6 = r6.f226329h     // Catch:{ Exception -> 0x0338 }
            r2 = r31
            r4.put(r2, r6)     // Catch:{ Exception -> 0x0338 }
            r6 = 2
            if (r5 >= r6) goto L_0x0122
            r7 = r28
            r6 = r29
        L_0x0120:
            r5 = 0
            goto L_0x012b
        L_0x0122:
            r7 = r28
            boolean r5 = r7.field_isExpand     // Catch:{ Exception -> 0x0338 }
            r6 = r29
            if (r5 != 0) goto L_0x0120
            r5 = 1
        L_0x012b:
            r4.put(r6, r5)     // Catch:{ Exception -> 0x0338 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0338 }
            r5.<init>()     // Catch:{ Exception -> 0x0338 }
            int r8 = r7.field_isRead     // Catch:{ Exception -> 0x0338 }
            r9 = 1
            if (r8 != r9) goto L_0x013c
            r9 = r21
            r8 = 1
            goto L_0x013f
        L_0x013c:
            r9 = r21
            r8 = 0
        L_0x013f:
            r5.put(r9, r8)     // Catch:{ Exception -> 0x0338 }
            rx3.b0 r8 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0338 }
            r8 = r27
            r4.put(r8, r5)     // Catch:{ Exception -> 0x0338 }
            r5 = r22
            r5.put(r4)     // Catch:{ Exception -> 0x0338 }
            r10 = r2
            r22 = r5
            r2 = r8
            r21 = r9
            r4 = r24
            r5 = r25
            r12 = r26
            r8 = r6
            goto L_0x0093
        L_0x015d:
            sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x0338 }
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x0338 }
        L_0x0162:
            r26 = r12
            r5 = r22
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0338 }
            goto L_0x016d
        L_0x0169:
            r26 = r12
            r5 = r22
        L_0x016d:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0338 }
            r10 = r23
            r4 = r26
            r4.put(r10, r5)     // Catch:{ Exception -> 0x0338 }
            goto L_0x02c3
        L_0x0178:
            r6 = r8
            r4 = r12
            r8 = r2
            r2 = r10
            r10 = r9
            r9 = r5
            boolean r5 = r7.mo25758F2()     // Catch:{ Exception -> 0x0338 }
            if (r5 == 0) goto L_0x02c3
            java.lang.String r5 = "is_recommend"
            r12 = 1
            r4.put(r5, r12)     // Catch:{ Exception -> 0x0338 }
            te3.re4 r5 = r7.mo25774x2()     // Catch:{ Exception -> 0x0338 }
            java.lang.String r12 = "style"
            if (r5 == 0) goto L_0x0198
            r23 = r10
            int r10 = r5.f64521j     // Catch:{ Exception -> 0x0338 }
            goto L_0x019b
        L_0x0198:
            r23 = r10
            r10 = 0
        L_0x019b:
            r4.put(r12, r10)     // Catch:{ Exception -> 0x0338 }
            if (r5 == 0) goto L_0x01d3
            int r10 = r5.f64521j     // Catch:{ Exception -> 0x0338 }
            r12 = 1001(0x3e9, float:1.403E-42)
            if (r10 != r12) goto L_0x01d3
            java.lang.String r0 = "ext_info"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0338 }
            r3.<init>()     // Catch:{ Exception -> 0x0338 }
            java.lang.String r6 = "extra_data"
            java.lang.String r5 = r5.f64527s     // Catch:{ Exception -> 0x0338 }
            r3.put(r6, r5)     // Catch:{ Exception -> 0x0338 }
            long r5 = r7.field_createTime     // Catch:{ Exception -> 0x0338 }
            r3.put(r2, r5)     // Catch:{ Exception -> 0x0338 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0338 }
            r2.<init>()     // Catch:{ Exception -> 0x0338 }
            int r5 = r7.field_isRead     // Catch:{ Exception -> 0x0338 }
            r6 = 1
            if (r5 != r6) goto L_0x01c5
            r5 = 1
            goto L_0x01c6
        L_0x01c5:
            r5 = 0
        L_0x01c6:
            r2.put(r9, r5)     // Catch:{ Exception -> 0x0338 }
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0338 }
            r3.put(r8, r2)     // Catch:{ Exception -> 0x0338 }
            r4.put(r0, r3)     // Catch:{ Exception -> 0x0338 }
            goto L_0x02c3
        L_0x01d3:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x0338 }
            r5.<init>()     // Catch:{ Exception -> 0x0338 }
            java.util.LinkedList r10 = com.tencent.p014mm.storage.C19613h1.m21033f(r7)     // Catch:{ Exception -> 0x0338 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x0338 }
            r12 = 0
        L_0x01e1:
            boolean r21 = r10.hasNext()     // Catch:{ Exception -> 0x0338 }
            if (r21 == 0) goto L_0x02b5
            java.lang.Object r21 = r10.next()     // Catch:{ Exception -> 0x0338 }
            int r22 = r12 + 1
            if (r12 < 0) goto L_0x02b0
            r24 = r10
            r10 = r21
            te3.dh r10 = (te3.C22493dh) r10     // Catch:{ Exception -> 0x0338 }
            r26 = r4
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0338 }
            r4.<init>()     // Catch:{ Exception -> 0x0338 }
            r21 = r5
            java.lang.String r5 = r10.f63755i     // Catch:{ Exception -> 0x0338 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x0338 }
            if (r5 != 0) goto L_0x0256
            java.lang.String r5 = r10.f63755i     // Catch:{ Exception -> 0x0338 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0338 }
            r27 = r8
            java.lang.String r8 = r5.getQueryParameter(r3)     // Catch:{ Exception -> 0x0338 }
            r25 = r9
            r9 = 0
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r9)     // Catch:{ Exception -> 0x0338 }
            java.lang.String r9 = r5.getQueryParameter(r0)     // Catch:{ Exception -> 0x0338 }
            r30 = r1
            r31 = r2
            r29 = r6
            r28 = r7
            r6 = 0
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r6)     // Catch:{ Exception -> 0x0338 }
            java.lang.String r5 = r5.getQueryParameter(r11)     // Catch:{ Exception -> 0x0338 }
            r6 = 2
            byte[] r5 = android.util.Base64.decode(r5, r6)     // Catch:{ Exception -> 0x0338 }
            gy3.C87412m.m108593f(r5, r15)     // Catch:{ Exception -> 0x0338 }
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x0338 }
            java.nio.charset.Charset r9 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x0338 }
            r7.<init>(r5, r9)     // Catch:{ Exception -> 0x0338 }
            r9 = r11
            r32 = r12
            r5 = 0
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r5)     // Catch:{ Exception -> 0x0338 }
            r4.put(r14, r11)     // Catch:{ Exception -> 0x0338 }
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0338 }
            r4.put(r3, r8)     // Catch:{ Exception -> 0x0338 }
            java.lang.String r1 = r10.f63751e     // Catch:{ Exception -> 0x0338 }
            r4.put(r13, r1)     // Catch:{ Exception -> 0x0338 }
            goto L_0x0265
        L_0x0256:
            r30 = r1
            r31 = r2
            r29 = r6
            r28 = r7
            r27 = r8
            r25 = r9
            r9 = r11
            r32 = r12
        L_0x0265:
            r2 = r30
            r1 = r32
            r4.put(r2, r1)     // Catch:{ Exception -> 0x0338 }
            r7 = r28
            long r5 = r7.field_createTime     // Catch:{ Exception -> 0x0338 }
            r1 = r31
            r4.put(r1, r5)     // Catch:{ Exception -> 0x0338 }
            r5 = r29
            r6 = 0
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0338 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0338 }
            r6.<init>()     // Catch:{ Exception -> 0x0338 }
            int r8 = r7.field_isRead     // Catch:{ Exception -> 0x0338 }
            r10 = 1
            r11 = r25
            if (r8 != r10) goto L_0x0289
            r8 = 1
            goto L_0x028a
        L_0x0289:
            r8 = 0
        L_0x028a:
            r6.put(r11, r8)     // Catch:{ Exception -> 0x0338 }
            rx3.b0 r8 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0338 }
            r8 = r27
            r4.put(r8, r6)     // Catch:{ Exception -> 0x0338 }
            r6 = r21
            r6.put(r4)     // Catch:{ Exception -> 0x0338 }
            r12 = r22
            r10 = r24
            r4 = r26
            r33 = r2
            r2 = r1
            r1 = r33
            r34 = r6
            r6 = r5
            r5 = r34
            r35 = r11
            r11 = r9
            r9 = r35
            goto L_0x01e1
        L_0x02b0:
            sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x0338 }
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x0338 }
        L_0x02b5:
            r2 = r1
            r26 = r4
            r6 = r5
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0338 }
            r1 = r23
            r0 = r26
            r0.put(r1, r6)     // Catch:{ Exception -> 0x0338 }
            goto L_0x02c5
        L_0x02c3:
            r2 = r1
            r0 = r4
        L_0x02c5:
            r1 = r20
            r1.put(r0)     // Catch:{ Exception -> 0x0338 }
            r4 = r1
            r1 = r2
            r2 = r16
            r6 = r17
            r0 = r18
            r3 = r19
            goto L_0x001c
        L_0x02d6:
            r19 = r3
            sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x0338 }
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x0338 }
        L_0x02dd:
            r18 = r0
            r19 = r3
            r1 = r4
            java.lang.String r0 = "timeline_context"
            r2 = r19
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r0 = "timeline_request_type"
            r1 = r37
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0336 }
            com.tencent.mm.storage.t r0 = f55586a     // Catch:{ Exception -> 0x0336 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo25832f()     // Catch:{ Exception -> 0x0336 }
            java.lang.String r1 = "BizLastExposeAdTime"
            r3 = 0
            long r0 = r0.decodeLong(r1, r3)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r3 = "last_expose_time"
            r2.put(r3, r0)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r0 = "ext_slot_custom_comm"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0336 }
            r1.<init>()     // Catch:{ Exception -> 0x0336 }
            java.lang.String r3 = "tl_base_pkg_version"
            k40.a r4 = f40.C86709a0.m107533q(r18)     // Catch:{ Exception -> 0x0336 }
            ex0.d r4 = (ex0.C45696d) r4     // Catch:{ Exception -> 0x0336 }
            int r4 = r4.fk0()     // Catch:{ Exception -> 0x0336 }
            r1.put(r3, r4)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r3 = "tl_biz_pkg_version"
            k40.a r4 = f40.C86709a0.m107533q(r18)     // Catch:{ Exception -> 0x0336 }
            ex0.d r4 = (ex0.C45696d) r4     // Catch:{ Exception -> 0x0336 }
            int r4 = r4.mo70977U2()     // Catch:{ Exception -> 0x0336 }
            r1.put(r3, r4)     // Catch:{ Exception -> 0x0336 }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0336 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0336 }
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0336 }
            goto L_0x0348
        L_0x0336:
            r0 = move-exception
            goto L_0x033e
        L_0x0338:
            r0 = move-exception
            r2 = r19
            goto L_0x033e
        L_0x033c:
            r0 = move-exception
            r2 = r3
        L_0x033e:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "MicroMsg.BizCardLogic"
            java.lang.String r4 = "getTimeLineContext"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r1)
        L_0x0348:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "getBizTimeLineInfoStorag…text.toString()\n        }"
            gy3.C87412m.m108593f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19627t.mo25843q(int):java.lang.String");
    }

    /* renamed from: r */
    public final void mo25844r() {
        if (!f55583K) {
            f55581I = mo25832f().decodeFloat("minAdExposureRatio", f55581I);
            f55582J = mo25832f().decodeLong("minAdExposureTme", f55582J);
            f55583K = true;
            Log.m105924i("MicroMsg.BizCardLogic", "initAdExposeParams exposureRatio=" + f55581I + "， exposureTme=" + f55582J);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25845s(int r31, boolean r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            com.tencent.mm.storage.p0$$g r3 = com.tencent.p014mm.storage.p0$$g.DELETE
            boolean r4 = r30.mo25833g()
            r5 = 0
            if (r4 != 0) goto L_0x0010
            return r5
        L_0x0010:
            boolean r4 = f55574B
            java.lang.String r6 = "MicroMsg.BizCardLogic"
            if (r4 == 0) goto L_0x001e
            if (r2 != 0) goto L_0x001e
            java.lang.String r1 = "insertAd return for not replaceAd"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            return r5
        L_0x001e:
            boolean r4 = com.tencent.p014mm.storage.C19636w0.m21170l()
            java.lang.String r7 = "MicroMsg.BizTimeLineInfoStorage"
            java.lang.String r8 = "BizTimeLineInfo"
            r9 = 637534257(0x26000031, float:4.440918E-16)
            r10 = 2
            r11 = 3
            r12 = 1
            if (r4 != 0) goto L_0x0081
            boolean r4 = r30.mo25839m()
            if (r4 == 0) goto L_0x0079
            com.tencent.mm.storage.p0 r4 = rb0.C48009v0.Jx0()
            r4.getClass()
            long r13 = eb0.C75604z3.m90844p()
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r13 - r15
            java.lang.Object[] r15 = new java.lang.Object[r11]
            r15[r5] = r8
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)
            r15[r12] = r16
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r15[r10] = r13
            java.lang.String r13 = "DELETE FROM %s WHERE type = %d and createTime < %d"
            java.lang.String r13 = java.lang.String.format(r13, r15)
            zh3.f r14 = r4.f55550d
            boolean r14 = r14.execSQL(r8, r13)
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r15[r5] = r14
            r15[r12] = r13
            java.lang.String r13 = "deleteExposedAdMsgByType ret:%b, sql=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r13, r15)
            com.tencent.mm.storage.p0$$f r13 = new com.tencent.mm.storage.p0$$f
            r13.<init>()
            r13.f55562a = r3
            r4.mo25805jo(r13)
            goto L_0x008a
        L_0x0079:
            com.tencent.mm.storage.p0 r4 = rb0.C48009v0.Jx0()
            r4.mo25787Ow(r9, r12)
            goto L_0x008a
        L_0x0081:
            if (r2 != 0) goto L_0x008a
            boolean r4 = r30.mo25824F()
            if (r4 != 0) goto L_0x008a
            return r5
        L_0x008a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "insertAd replaceAd="
            r4.append(r13)
            r4.append(r2)
            java.lang.String r13 = ", insertType:'"
            r4.append(r13)
            int r13 = f55580H
            r4.append(r13)
            java.lang.String r13 = "', insertPos="
            r4.append(r13)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            q73.b0 r4 = q73.C22077b0.f62466a
            r13 = 29
            r4.mo35172a(r13)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r13 = r30.mo25832f()
            java.lang.String r14 = "biz_ad_card_data"
            java.lang.String r15 = r0.mo25825G(r14)
            java.lang.String r13 = r13.decodeString(r15)
            com.tencent.mm.storage.p0 r15 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.o0 r15 = r15.mo25783DN(r9)
            if (r15 == 0) goto L_0x00da
            int r9 = r15.field_isRead
            if (r9 != 0) goto L_0x00da
            java.lang.String r9 = r15.mo25765o2()
            if (r9 == 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r15 = 0
        L_0x00db:
            if (r15 == 0) goto L_0x011c
            org.json.JSONObject r9 = r15.mo25766p2()
            boolean r9 = r0.mo25846t(r9)
            if (r9 != 0) goto L_0x011c
            com.tencent.mm.storage.p0 r9 = rb0.C48009v0.Jx0()
            long r10 = r15.field_msgId
            r9.mo25785Lo(r10)
            java.lang.String r9 = r15.mo25775y2()
            r0.mo25820B(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "insertAd delete expire ad aid="
            r9.append(r10)
            java.lang.String r10 = r15.mo25764n2()
            r9.append(r10)
            java.lang.String r10 = ", tranceId="
            r9.append(r10)
            java.lang.String r10 = r15.mo25775y2()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            r15 = 0
        L_0x011c:
            org.json.JSONObject r9 = r0.mo25830d(r13)
            java.lang.String r10 = f55594i
            if (r10 == 0) goto L_0x012d
            boolean r10 = z04.C112551y.m153811k(r10)
            if (r10 == 0) goto L_0x012b
            goto L_0x012d
        L_0x012b:
            r10 = 0
            goto L_0x012e
        L_0x012d:
            r10 = 1
        L_0x012e:
            if (r10 == 0) goto L_0x013d
            if (r9 == 0) goto L_0x013a
            java.lang.String r10 = "traceid"
            java.lang.String r10 = r9.optString(r10)
            goto L_0x013b
        L_0x013a:
            r10 = 0
        L_0x013b:
            f55594i = r10
        L_0x013d:
            java.lang.String r10 = " traceId: "
            java.lang.String r11 = " aid: "
            java.lang.String r12 = " orderFlag:"
            java.lang.String r5 = ", msgId:"
            r20 = r7
            r21 = r8
            java.lang.String r8 = "', insertAction:'"
            java.lang.String r7 = "', insertType:'"
            java.lang.String r1 = "adInsert"
            r22 = r3
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0210
            boolean r9 = r0.mo25846t(r9)
            if (r9 != 0) goto L_0x0210
            java.lang.String r9 = "insertAd ad data invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r9)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r9 != 0) goto L_0x0176
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = r30.mo25832f()
            java.lang.String r13 = r0.mo25825G(r14)
            r9.encode((java.lang.String) r13, (java.lang.String) r3)
            r13 = 102(0x66, double:5.04E-322)
            r4.mo35172a(r13)
        L_0x0176:
            r13 = 30
            r4.mo35172a(r13)
            if (r15 == 0) goto L_0x020e
            com.tencent.mm.storage.t r3 = f55586a
            long r13 = r15.field_orderFlag
            r9 = 0
            long r13 = r3.mo25838l(r13, r9)
            r23 = r10
            long r9 = r15.field_orderFlag
            int r16 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x020c
            r9 = 0
            int r16 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r16 > 0) goto L_0x0195
            goto L_0x020c
        L_0x0195:
            r15.field_orderFlag = r13
            r9 = 36
            r4.mo35172a(r9)
            r3.mo25850x(r15)
            com.tencent.mm.storage.p0 r4 = rb0.C48009v0.Jx0()
            r9 = 1
            boolean r4 = r4.P50(r15, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "err_code:0,err_msg:'move ad position', traceid:'"
            r9.append(r10)
            java.lang.String r10 = f55594i
            r9.append(r10)
            r9.append(r7)
            int r7 = f55580H
            r9.append(r7)
            r9.append(r8)
            r9.append(r2)
            r2 = 39
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            r3.mo25828b(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "insertAd updateById result: "
            r1.append(r2)
            r1.append(r4)
            r1.append(r5)
            long r2 = r15.field_msgId
            r1.append(r2)
            r1.append(r12)
            long r2 = r15.field_orderFlag
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = r15.mo25764n2()
            r1.append(r2)
            r9 = r23
            r1.append(r9)
            java.lang.String r2 = r15.mo25775y2()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            goto L_0x020e
        L_0x020c:
            r1 = 0
            return r1
        L_0x020e:
            r1 = 0
            return r1
        L_0x0210:
            r9 = r10
            com.tencent.mm.storage.p0 r10 = rb0.C48009v0.Jx0()
            int r10 = r10.mo25786NQ()
            boolean r23 = r30.mo25824F()
            if (r23 != 0) goto L_0x0263
            r23 = r9
            r9 = 3
            if (r10 > r9) goto L_0x0265
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "insertAd return for: msgCount = "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "err_code:1,err_msg:'msg size invalid', traceid:'"
            r3.append(r4)
            java.lang.String r4 = f55594i
            r3.append(r4)
            r3.append(r7)
            int r4 = f55580H
            r3.append(r4)
            r3.append(r8)
            r3.append(r2)
            r2 = 39
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.mo25828b(r1, r2)
            r9 = 0
            return r9
        L_0x0263:
            r23 = r9
        L_0x0265:
            r9 = 0
            com.tencent.mm.storage.p0 r10 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.o0 r10 = r10.mo25809mL()
            if (r10 != 0) goto L_0x0276
            java.lang.String r1 = "insertAd lastTimeLineInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            return r9
        L_0x0276:
            r24 = r10
            r9 = 31
            r4.mo35172a(r9)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r25 = r11
            r10 = 3
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r10 = 0
            r11[r10] = r3
            r10 = 1
            r11[r10] = r3
            r10 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r17 = 2
            r11[r17] = r10
            r10 = 20636(0x509c, float:2.8917E-41)
            r9.mo160131h(r10, r11)
            com.tencent.mm.storage.p0 r11 = rb0.C48009v0.Jx0()
            long r26 = r11.mo25791TO()
            com.tencent.mm.storage.o0 r11 = new com.tencent.mm.storage.o0
            r11.<init>()
            r11.field_content = r13
            r13 = 637534257(0x26000031, float:4.440918E-16)
            r11.field_type = r13
            r28 = r11
            if (r15 == 0) goto L_0x02cd
            r10 = 37
            r4.mo35172a(r10)
            com.tencent.mm.storage.p0 r10 = rb0.C48009v0.Jx0()
            r11 = 0
            r10.mo25787Ow(r13, r11)
            com.tencent.mm.storage.t r10 = f55586a
            java.lang.String r11 = r15.mo25775y2()
            r10.mo25820B(r11)
            java.lang.String r10 = "insertAd delete un expose ad"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r10)
            r10 = 1
            goto L_0x02ce
        L_0x02cd:
            r10 = 0
        L_0x02ce:
            boolean r11 = r30.mo25824F()
            if (r11 == 0) goto L_0x0338
            int r11 = r30.mo25842p()
            r13 = 10
            if (r11 != r13) goto L_0x02dd
            goto L_0x0338
        L_0x02dd:
            java.lang.String r11 = "insertAd delete all ad msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            com.tencent.mm.storage.p0 r11 = rb0.C48009v0.Jx0()
            r11.getClass()
            r13 = 3
            java.lang.Object[] r15 = new java.lang.Object[r13]
            r13 = 0
            r15[r13] = r21
            java.lang.String r19 = "type"
            r18 = 1
            r15[r18] = r19
            r16 = 637534257(0x26000031, float:4.440918E-16)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r16)
            r13 = 2
            r15[r13] = r19
            java.lang.String r13 = "DELETE FROM %s WHERE %s = %d"
            java.lang.String r13 = java.lang.String.format(r13, r15)
            zh3.f r15 = r11.f55550d
            r29 = r10
            r10 = r21
            boolean r10 = r15.execSQL(r10, r13)
            r13 = 2
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            r16 = 0
            r15[r16] = r13
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r15[r18] = r10
            java.lang.String r10 = "deleteAllMsgByType type:%d ret:%b"
            r13 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r10, r15)
            com.tencent.mm.storage.p0$$f r10 = new com.tencent.mm.storage.p0$$f
            r10.<init>()
            r13 = r22
            r10.f55562a = r13
            r11.mo25805jo(r10)
            r16 = r12
            goto L_0x0426
        L_0x0338:
            r29 = r10
            com.tencent.mm.storage.q r10 = rb0.C48009v0.vx0()
            r13 = r12
            long r11 = r10.mo57691qq()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r16 = r13
            java.lang.String r13 = "SELECT count(*) FROM BizAdInfo where exposeTime > "
            r15.append(r13)
            r15.append(r11)
            java.lang.String r13 = r15.toString()
            zh3.f r10 = r10.f82736d
            r15 = 0
            android.database.Cursor r10 = r10.rawQuery(r13, r15)
            boolean r13 = r10.moveToFirst()
            if (r13 == 0) goto L_0x0369
            r13 = 0
            int r15 = r10.getInt(r13)
            goto L_0x036a
        L_0x0369:
            r15 = 0
        L_0x036a:
            r10.close()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "getAdCardCount count="
            r10.append(r13)
            r10.append(r15)
            java.lang.String r13 = ", beginTime="
            r10.append(r13)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.BizAdInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r10)
            int r10 = f55590e
            r11 = 1
            if (r11 > r10) goto L_0x0396
            r11 = 11
            if (r10 >= r11) goto L_0x0396
            r11 = 1
            goto L_0x0397
        L_0x0396:
            r11 = 0
        L_0x0397:
            if (r11 == 0) goto L_0x039a
            goto L_0x03af
        L_0x039a:
            int r10 = r30.mo25841o()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = r30.mo25832f()
            r12 = 10
            java.lang.String r13 = "biz_card_max_client_ad_count"
            int r11 = r11.decodeInt(r13, r12)
            if (r10 <= r11) goto L_0x03ad
            r10 = r11
        L_0x03ad:
            f55590e = r10
        L_0x03af:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "insertAd maxAdCount="
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            if (r15 < r10) goto L_0x0426
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "insertAd too much ad count="
            r3.append(r5)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            r5 = 32
            r4.mo35172a(r5)
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r28.mo25764n2()
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = r28.mo25775y2()
            r6 = 1
            r4[r6] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 2
            r4[r5] = r3
            r3 = 20636(0x509c, float:2.8917E-41)
            r9.mo160131h(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "err_code:3,err_msg:'ad count limit', traceid:'"
            r3.append(r4)
            java.lang.String r4 = f55594i
            r3.append(r4)
            r3.append(r7)
            int r4 = f55580H
            r3.append(r4)
            r3.append(r8)
            r3.append(r2)
            r2 = 39
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.mo25828b(r1, r2)
            r1 = 0
            return r1
        L_0x0426:
            com.tencent.mm.storage.p0 r10 = rb0.C48009v0.Jx0()
            r11 = 32
            long r11 = r26 << r11
            r10.getClass()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "SELECT * FROM BizTimeLineInfo where type=637534257 and orderFlag > "
            r13.append(r15)
            r13.append(r11)
            java.lang.String r11 = " limit 1 "
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            zh3.f r10 = r10.f55550d
            r12 = 0
            r13 = 2
            android.database.Cursor r10 = r10.rawQuery(r11, r12, r13)
            boolean r11 = r10.moveToFirst()
            if (r11 == 0) goto L_0x045e
            com.tencent.mm.storage.o0 r15 = new com.tencent.mm.storage.o0
            r15.<init>()
            r15.convertFrom(r10)
            goto L_0x045f
        L_0x045e:
            r15 = 0
        L_0x045f:
            r10.close()
            if (r15 == 0) goto L_0x04be
            r10 = 1
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.Long r5 = java.lang.Long.valueOf(r26)
            r11 = 0
            r3[r11] = r5
            java.lang.String r5 = "insertAd groupId %d already has a adCard"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r3)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = r28.mo25764n2()
            r3[r11] = r5
            java.lang.String r5 = r28.mo25775y2()
            r3[r10] = r5
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3[r5] = r6
            r5 = 20636(0x509c, float:2.8917E-41)
            r9.mo160131h(r5, r3)
            r5 = 33
            r4.mo35172a(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "err_code:4,err_msg:'ad conflict', traceid:'"
            r3.append(r4)
            java.lang.String r4 = f55594i
            r3.append(r4)
            r3.append(r7)
            int r4 = f55580H
            r3.append(r4)
            r3.append(r8)
            r3.append(r2)
            r2 = 39
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.mo25828b(r1, r2)
            r10 = 0
            return r10
        L_0x04be:
            r10 = 0
            com.tencent.mm.storage.p0 r11 = rb0.C48009v0.Jx0()
            long r11 = r11.mo25782CZ()
            r13 = r28
            r13.field_msgId = r11
            r11 = 0
            r13.field_msgSvrId = r11
            r13.field_talker = r3
            r13.field_talkerId = r10
            r10 = 1
            r13.field_hasShow = r10
            long r10 = eb0.C75604z3.m90844p()
            r13.field_createTime = r10
            boolean r10 = r24.mo25753A2()
            if (r10 == 0) goto L_0x04e7
            r10 = r24
            long r10 = r10.f356048H
            goto L_0x04eb
        L_0x04e7:
            r10 = r24
            long r10 = r10.field_createTime
        L_0x04eb:
            r13.f356048H = r10
            r10 = 1
            r13.f356057o = r10
            r13.mo183585l2(r10)
            r10 = 3
            r13.field_status = r10
            r12 = r1
            r15 = r7
            r20 = r8
            r10 = 0
            r1 = r31
            long r7 = r0.mo25838l(r10, r1)
            r13.field_orderFlag = r7
            int r1 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x050a
            r1 = 0
            return r1
        L_0x050a:
            r1 = 0
            f55596k = r1
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r30.mo25832f()
            java.lang.String r7 = r0.mo25825G(r14)
            r1.encode((java.lang.String) r7, (java.lang.String) r3)
            r0.mo25850x(r13)
            com.tencent.mm.storage.p0 r1 = rb0.C48009v0.Jx0()
            r3 = 1
            boolean r1 = r1.v10(r13, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "insertAd result: "
            r3.append(r7)
            r3.append(r1)
            r3.append(r5)
            long r7 = r13.field_msgId
            r3.append(r7)
            r5 = r16
            r3.append(r5)
            long r7 = r13.field_orderFlag
            r3.append(r7)
            r5 = r25
            r3.append(r5)
            java.lang.String r5 = r13.mo25764n2()
            r3.append(r5)
            r5 = r23
            r3.append(r5)
            java.lang.String r5 = r13.mo25775y2()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = r13.mo25764n2()
            r7 = 0
            r3[r7] = r5
            java.lang.String r5 = r13.mo25775y2()
            r8 = 1
            r3[r8] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r7 = 2
            r3[r7] = r5
            r5 = 20636(0x509c, float:2.8917E-41)
            r9.mo160131h(r5, r3)
            r9 = 35
            r4.mo35172a(r9)
            if (r2 == 0) goto L_0x0592
            int r3 = f55580H
            if (r3 != r8) goto L_0x058d
            r7 = 170(0xaa, double:8.4E-322)
            goto L_0x058f
        L_0x058d:
            r7 = 179(0xb3, double:8.84E-322)
        L_0x058f:
            r4.mo35172a(r7)
        L_0x0592:
            if (r29 != 0) goto L_0x0599
            r7 = 38
            r4.mo35172a(r7)
        L_0x0599:
            if (r1 == 0) goto L_0x05d3
            com.tencent.mm.storage.q r1 = rb0.C48009v0.vx0()
            java.lang.String r3 = r13.mo25775y2()
            r1.mo57690jo(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "err_code:0,err_msg:'ok', traceid:'"
            r1.append(r3)
            java.lang.String r3 = f55594i
            r1.append(r3)
            r3 = r15
            r1.append(r3)
            int r3 = f55580H
            r1.append(r3)
            r3 = r20
            r1.append(r3)
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo25828b(r12, r1)
            goto L_0x05d8
        L_0x05d3:
            java.lang.String r1 = "insert fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
        L_0x05d8:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19627t.mo25845s(int, boolean):boolean");
    }

    /* renamed from: t */
    public final boolean mo25846t(JSONObject jSONObject) {
        boolean z = false;
        if (jSONObject == null) {
            return false;
        }
        long p = C75604z3.m90844p() / ((long) 1000);
        long optLong = jSONObject.optLong("ad_expire_time", p);
        if (p <= optLong) {
            z = true;
        }
        if (!z) {
            C117407d.INSTANCE.mo182089r(1454, 103, 1);
            Log.m105924i("MicroMsg.BizCardLogic", "isAdDataValid ad expire aid=" + jSONObject.optString("aid") + " adExpireTime=" + optLong);
        }
        return z;
    }

    /* renamed from: u */
    public final void mo25847u(Map<String, String> map, String str) {
        if (!(str == null || C112551y.m153811k(str))) {
            if (map == null || map.isEmpty()) {
                int E = C112550d0.m153769E(str, "<sysmsg", 0, false, 6, (Object) null);
                if (E != -1) {
                    String substring = str.substring(E);
                    C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                    map = XmlParser.parseXml(substring, "sysmsg", (String) null);
                    if (map == null) {
                        Log.m105921e("MicroMsg.BizCardLogic", "XmlParser values is null, msgContent %s", str);
                        return;
                    }
                } else {
                    return;
                }
            }
            String str2 = map.get(".sysmsg.BizAdNotify.previewMode");
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            int i = Util.getInt(str2, -1);
            String str4 = map.get(".sysmsg.BizAdNotify.adCmd");
            if (str4 != null) {
                str3 = str4;
            }
            if (i != -1) {
                C117407d.INSTANCE.mo182089r(1454, 140, 1);
                mo25837k().encode("BizTimeLineAdPreviewMode", i);
                mo25837k().encode("BizTimeLineAdCmd", str3);
                if (i == 1) {
                    mo25837k().encode("BizTimeLineAdPreviewModeTime", System.currentTimeMillis());
                }
            } else {
                C117407d.INSTANCE.mo182089r(1454, 141, 1);
            }
            if (mo25839m()) {
                Log.m105924i("MicroMsg.BizCardLogic", "onAdNotify, adPreviewMode=" + i + ", adCmd=" + str3);
                mo25828b("onAdNotify", "previewMode:" + i + ", adCmd:'" + str3 + '\'');
            }
        }
    }

    /* renamed from: v */
    public final void mo25848v() {
        mo25829c(2);
        if (f55577E || !mo25835i()) {
            Log.m105918d("MicroMsg.BizCardLogic", "exposePreload hasPreload=" + f55577E + ", canvasPreloadOpen=" + mo25835i());
            return;
        }
        boolean z = true;
        f55577E = true;
        C117407d.INSTANCE.mo182089r(1454, 14, 1);
        C9533e eVar = C9533e.f29713a;
        int decodeInt = eVar.mo10210c().decodeInt("biz_canvas_card_expose_preload_crash_times", 0);
        if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !WeChatEnvironment.hasDebugger()) {
            z = false;
        }
        long j = 0;
        if (eVar.mo10208a(decodeInt, z ? 0 : 600000, "biz_canvas_card_expose_preload_last_time", 11)) {
            C119179t tVar = C119157j.f356862d;
            C19634w wVar = new C19634w(decodeInt);
            if (System.currentTimeMillis() - C55579f.f158250d <= 20000 && !BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED) {
                j = 10000;
            }
            ((C119157j) tVar).mo183878i(wVar, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        return;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo25849w(org.json.JSONObject r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.String r0 = "adData"
            gy3.C87412m.m108594g(r14, r0)     // Catch:{ all -> 0x00aa }
            boolean r0 = r13.mo25833g()     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r13)
            return
        L_0x000e:
            java.lang.String r0 = "aid"
            java.lang.String r0 = r14.optString(r0)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "adData.optString(\"aid\")"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "traceid"
            java.lang.String r1 = r14.optString(r1)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = "adData.optString(\"traceid\")"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = "path_type"
            java.lang.String r3 = "ad"
            java.lang.String r5 = r14.optString(r2, r3)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = "adData.optString(\"path_type\", \"ad\")"
            gy3.C87412m.m108593f(r5, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = "MicroMsg.BizCardLogic"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096 }
            r3.<init>()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r4 = "preloadAdCard aid="
            r3.append(r4)     // Catch:{ Exception -> 0x0096 }
            r3.append(r0)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r0 = ", traceId="
            r3.append(r0)     // Catch:{ Exception -> 0x0096 }
            r3.append(r1)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r0 = ", pathType="
            r3.append(r0)     // Catch:{ Exception -> 0x0096 }
            r3.append(r5)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0096 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x0096 }
            boolean r0 = z04.C112551y.m153811k(r1)     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x0094
            boolean r0 = z04.C112551y.m153811k(r5)     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x0094
            r9 = 8
            kj2.d r6 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x00aa }
            r7 = 1454(0x5ae, double:7.184E-321)
            r11 = 1
            r6.mo182089r(r7, r9, r11)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = f55594i     // Catch:{ all -> 0x00aa }
            boolean r0 = gy3.C87412m.m108589b(r1, r0)     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = f55596k     // Catch:{ all -> 0x00aa }
            r13.mo25820B(r0)     // Catch:{ all -> 0x00aa }
        L_0x007c:
            f55596k = r1     // Catch:{ all -> 0x00aa }
            java.lang.Class<ex0.d> r0 = ex0.C45696d.class
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ all -> 0x00aa }
            r4 = r0
            ex0.d r4 = (ex0.C45696d) r4     // Catch:{ all -> 0x00aa }
            java.lang.String r6 = r13.mo25827a(r1)     // Catch:{ all -> 0x00aa }
            java.lang.String r7 = r14.toString()     // Catch:{ all -> 0x00aa }
            r8 = 0
            r4.mo71005oD(r5, r6, r7, r8)     // Catch:{ all -> 0x00aa }
        L_0x0094:
            monitor-exit(r13)
            return
        L_0x0096:
            r14 = move-exception
            java.lang.String r0 = "MicroMsg.BizCardLogic"
            java.lang.String r1 = "preloadAdCard ex %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00aa }
            r3 = 0
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x00aa }
            r2[r3] = r14     // Catch:{ all -> 0x00aa }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r2)     // Catch:{ all -> 0x00aa }
            monitor-exit(r13)
            return
        L_0x00aa:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19627t.mo25849w(org.json.JSONObject):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        return false;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo25850x(com.tencent.p014mm.storage.C19623o0 r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            monitor-enter(r17)
            java.lang.String r2 = "info"
            gy3.C87412m.m108594g(r0, r2)     // Catch:{ all -> 0x007d }
            boolean r2 = r18.mo25753A2()     // Catch:{ all -> 0x007d }
            r3 = 0
            if (r2 == 0) goto L_0x006b
            boolean r2 = r17.mo25833g()     // Catch:{ all -> 0x007d }
            if (r2 == 0) goto L_0x0069
            java.lang.String r2 = r18.mo25765o2()     // Catch:{ all -> 0x007d }
            if (r2 != 0) goto L_0x001e
            goto L_0x0069
        L_0x001e:
            long r8 = r0.field_msgId     // Catch:{ all -> 0x007d }
            java.lang.String r2 = "MicroMsg.BizCardLogic"
            java.lang.String r4 = "preload ad card"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r4)     // Catch:{ all -> 0x007d }
            r13 = 8
            kj2.d r10 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x007d }
            r11 = 1454(0x5ae, double:7.184E-321)
            r15 = 1
            r10.mo182089r(r11, r13, r15)     // Catch:{ all -> 0x007d }
            java.lang.Class<ex0.d> r2 = ex0.C45696d.class
            k40.a r2 = f40.C86709a0.m107533q(r2)     // Catch:{ all -> 0x007d }
            r4 = r2
            ex0.d r4 = (ex0.C45696d) r4     // Catch:{ all -> 0x007d }
            java.lang.String r2 = r18.mo25770t2()     // Catch:{ all -> 0x007d }
            r10 = 1
            if (r2 == 0) goto L_0x0048
            boolean r2 = z04.C112551y.m153811k(r2)     // Catch:{ all -> 0x007d }
            if (r2 == 0) goto L_0x0049
        L_0x0048:
            r3 = 1
        L_0x0049:
            if (r3 == 0) goto L_0x004e
            java.lang.String r2 = "ad"
            goto L_0x0052
        L_0x004e:
            java.lang.String r2 = r18.mo25770t2()     // Catch:{ all -> 0x007d }
        L_0x0052:
            r5 = r2
            java.lang.String r2 = r18.mo25775y2()     // Catch:{ all -> 0x007d }
            java.lang.String r3 = "info.traceId"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ all -> 0x007d }
            java.lang.String r6 = r1.mo25827a(r2)     // Catch:{ all -> 0x007d }
            java.lang.String r7 = r18.mo25765o2()     // Catch:{ all -> 0x007d }
            r4.mo71005oD(r5, r6, r7, r8)     // Catch:{ all -> 0x007d }
            monitor-exit(r17)
            return r10
        L_0x0069:
            monitor-exit(r17)
            return r3
        L_0x006b:
            boolean r2 = r18.mo25758F2()     // Catch:{ all -> 0x007d }
            if (r2 == 0) goto L_0x007b
            te3.re4 r2 = r18.mo25774x2()     // Catch:{ all -> 0x007d }
            boolean r0 = r1.mo25851y(r2, r0)     // Catch:{ all -> 0x007d }
            monitor-exit(r17)
            return r0
        L_0x007b:
            monitor-exit(r17)
            return r3
        L_0x007d:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19627t.mo25850x(com.tencent.mm.storage.o0):boolean");
    }

    /* renamed from: y */
    public final synchronized boolean mo25851y(re4 re4, C19623o0 o0Var) {
        re4 re42 = re4;
        C19623o0 o0Var2 = o0Var;
        synchronized (this) {
            if (re42 != null) {
                if (re42.f64521j == 1001 && re42.f64525q != null) {
                    long j = o0Var2 != null ? o0Var2.field_msgId : 0;
                    Log.m105918d("MicroMsg.BizCardLogic", "preload rec card");
                    C117407d.INSTANCE.mo182089r(1454, 9, 1);
                    C45696d dVar = (C45696d) C86709a0.m107533q(C45696d.class);
                    C22503jo3 jo32 = re42.f64525q;
                    String str = jo32.f64081s;
                    if (str == null) {
                        str = "re";
                    }
                    String str2 = jo32.f64075j;
                    C87412m.m108593f(str2, "wrapper.exptInfo.cardId");
                    dVar.mo71005oD(str, mo25819A(str2), re42.f64525q.f64076n, j);
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[DONT_GENERATE] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo25852z(com.tencent.p014mm.storage.C19623o0 r18) {
        /*
            r17 = this;
            r0 = r18
            monitor-enter(r17)
            java.lang.String r1 = "info"
            gy3.C87412m.m108594g(r0, r1)     // Catch:{ all -> 0x005f }
            te3.lo3 r1 = r0.f55539x1     // Catch:{ all -> 0x005f }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001d
            ky3.c r4 = com.tencent.p014mm.storage.C19613h1.f55490a     // Catch:{ all -> 0x005f }
            int r1 = r1.f64173f     // Catch:{ all -> 0x005f }
            r4 = 2003(0x7d3, float:2.807E-42)
            if (r1 != r4) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 != r3) goto L_0x001d
            r1 = 1
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r1 == 0) goto L_0x005d
            long r8 = r0.field_msgId     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "MicroMsg.BizCardLogic"
            java.lang.String r2 = "preload rec feed"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)     // Catch:{ all -> 0x005f }
            r13 = 9
            kj2.d r10 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x005f }
            r11 = 1454(0x5ae, double:7.184E-321)
            r15 = 1
            r10.mo182089r(r11, r13, r15)     // Catch:{ all -> 0x005f }
            java.lang.Class<ex0.d> r1 = ex0.C45696d.class
            k40.a r1 = f40.C86709a0.m107533q(r1)     // Catch:{ all -> 0x005f }
            r4 = r1
            ex0.d r4 = (ex0.C45696d) r4     // Catch:{ all -> 0x005f }
            java.lang.String r5 = "rec-feed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r2 = "__rec_feed_"
            r1.append(r2)     // Catch:{ all -> 0x005f }
            te3.lo3 r2 = r0.f55539x1     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r2.f64175h     // Catch:{ all -> 0x005f }
            r1.append(r2)     // Catch:{ all -> 0x005f }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x005f }
            java.lang.String r7 = r18.mo25772v2()     // Catch:{ all -> 0x005f }
            r4.mo71005oD(r5, r6, r7, r8)     // Catch:{ all -> 0x005f }
            monitor-exit(r17)
            return r3
        L_0x005d:
            monitor-exit(r17)
            return r2
        L_0x005f:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19627t.mo25852z(com.tencent.mm.storage.o0):boolean");
    }
}
