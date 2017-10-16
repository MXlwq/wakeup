package cn.mobiledevelop.wakeup.application;


import android.app.Application;

import com.umeng.analytics.MobclickAgent;

import cn.mobiledevelop.wakeup.BuildConfig;

/**
 * Created by MXlwq on 2017/10/16.
 */

public class WakeUpApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        initUmeng();
        initBugly();
    }

    private void initBugly() {
        
    }

    private void initUmeng() {
        MobclickAgent.startWithConfigure(new MobclickAgent.UMAnalyticsConfig(this, BuildConfig.UM_APPKEY_VALUE, BuildConfig.MARKET_CHANNEL));
    }
}
