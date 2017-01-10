# ButterKnifeDemo
###ButterKnife(黄油刀的基本使用)
#####配置：
1.project-level的build.gradle配置如下:  

    buildscript {
         repositories {
           jcenter()
            mavenCentral()
    		}
    dependencies {
        classpath 'com.android.tools.build:gradle:2.2.1'
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
      }
    }
   
2.module-level的build.gradle配置如下:  

	dependencies {
	    compile 'com.jakewharton:butterknife:8.4.0'
	    apt 'com.jakewharton:butterknife-compiler:8.4.0'
	}
#####1.activity使用ButterKnife说明：

  1>查找控件:@BindView(R.id.xx)  
  2>使用res资源:   
  @BindString(R.string.xx)  
  @BindDimen(R.dimen.xx)  
  @BindColor(R.color.xx)  
  3>解析注解：ButterKnife.Bind(Activity activity);  
#####2.fragment使用ButterKnife说明：
  1>查找控件:@BindView(R.id.xx)  
  2>使用res资源  
  @BindString(R.string.xx)  
  @BindDimen(R.dimen.xx)  
  @BindColor(R.color.xx)  
  3>解析注解：ButterKnife.Bind(Object target,View view);  
#####3.adapter使用ButterKnife说明：  
 1>查找控件:@BindView(R.id.xx)  
  2>使用res资源  
  @BindString(R.string.xx)  
  @BindDimen(R.dimen.xx)  
  @BindColor(R.color.xx)  
  3>解析注解：ButterKnife.Bind(Object target,View view);此对象target一般是viewholder对象  

#####以上所有控件的点击事件如下：

    //View点击事件
	@Onclick(R.id.xx)
	public void 方法名(View view){
	}
    //ListView或者GridView列表点击事件
	@OnItemClick(R.id.xx)
	public void 方法名(AdapterView<?> adapterView,View view, int pos,long id){
	}
    //ListView或者GridView列表长点击事件
	@OnItemLongClick(R.id.xx)
	public boolean 方法名(AdapterView<?> adapterView,View view, int pos,long id){
	return false;
	}

 
