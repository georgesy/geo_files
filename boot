const play = require('puppeteer');


const test = async () =>{
    // // launch headless Chromium browser
    
    browser = await play.launch({ headless : false, });
   
    const page = await browser.newPage();
    
    await page.setViewport({ width: 1440, height: 1380 });

    await page.goto("https://essayshark.com/auth_required_writer.html?url=%2Fwriter%2Forders%2F", { waitUntil: 'domcontentloaded' });

    await page.type(".bb-loginField input[name=login]","Cmutungi17@yahoo.com");
    pass = await page.$$("input[type='password']");
    await pass[0].type("Log@nj@b@li2020");    
    
    await page.$eval('.bb-authFields button[class=bb-button]', (el) => el.click());
    await page.waitForNavigation();

    const cookies = await page.cookies();   
    var prev = 0; 
    let timer = setTimeout(async function gow () {
        // await page.reload({ waitUntil: ["networkidle0", "domcontentloaded"] });    
        await page.waitForSelector('.normal_order');             
        var current = await page.$eval('.normal_order td a', (el) => el.textContent);  
        
        try {
            while(current !=prev){
                console.log(Math.floor(Date.now() / 1000)); 
                console.log(prev+" - "+current);
                const selector = '.service-10 a';                
                const link = await page.$eval(selector, (el) => el.href);
                prev = current;                
                // var browserr =[];            
                
                    const links = await page.$$eval(selector, am => am.filter(e => e.href).map(e => e.href));     
                    browserr = await play.launch({ headless : false,});                    
                    page2 = await browserr.newPage();
                    await page2.setCookie(...cookies);                  
                  
                    // await page2.evaluateOnNewDocument(() => {
                    //     window.w3tVar = function (k) {
                    //         var w3tVars = {};
                    //         w3tVars.order_id = 239842001;
                    //         w3tVars.order_pages_qty = 1;
                    //         w3tVars.order_price_type = 'bidding';
                    //         w3tVars.order_paper_lang = 'en';
                    //         w3tVars.order_ping_interval_sec = 10;
                    //         w3tVars.min_bid_amount = 6;
                    //         w3tVars.min_bid_amount_str = '6';
                    //         w3tVars.max_bid_amount = 9999;
                    //         w3tVars.max_bid_amount_str = '9999';
                    //         w3tVars.place_bid_conditions_json = {"read_time_remain":0,"files_download_remain":0};
                    //         w3tVars.order_details_read_msg_required = false;
                    //         w3tVars.all_bid_id = 0;
                    //         w3tVars.actual_bid_id = 0;
                    //         w3tVars.cl_lang = 'en';
                    //         w3tVars.conf_online_status_msg_online = '<span class="ustatus_label ustatus_online" data-sort="30" style="color:#3ea600">Online<\/span>';
                    //         w3tVars.conf_online_status_msg_away = '<span class="ustatus_label ustatus_away" data-sort="20" style="color:#eea200">Away<\/span>';
                    //         w3tVars.conf_online_status_msg_offline = '<span class="ustatus_label ustatus_offline" data-sort="10" style="color:#e52e00">Offline<\/span>';
                    //         w3tVars.conf_user_online_status_away_mins = 5;
                    //         w3tVars.conf_new_message_sound_vol = 0.5;
                    //         w3tVars.pushstream_enabled = true;
                    //         w3tVars.pushstream_host = 'box1.essayshark.com';
                    //         w3tVars.pushstream_protocol = 'https';
                    //         w3tVars.pushstream_subscriber = '\/live\/sub';
                    //         w3tVars.pushstream_subscriber_websocket = '\/live\/ws';
                    //         w3tVars.site_path = '\/writer\/orders\/';
                    //         w3tVars.site_page = '239711163';
                    //         w3tVars.my_location_backoffice = true;
                    //         w3tVars.my_location_page = 'order_view';
                    //         w3tVars.my_location_order = 239711163;
                    //         w3tVars.my_location_order_status = 20;
                    //         w3tVars.my_location_bid = 0;
                    //         w3tVars.my_location_bids_qty = 0;
                    //         w3tVars.user_role = 'writer';
                    //         w3tVars.user_id = 4866;
                    //         w3tVars.user_login = '7053f8b5366c36467d3b28d505b181a5';
                    //         w3tVars.user_email = 'cmutungi17@yahoo.com';
                    //         w3tVars.user_hid = '17932cca86ab63c02ffbda89e4e2acbc';
                    //         w3tVars.pcm_ec_name = 'lnkptpc';
                    //         w3tVars.auth_extension_name = 'extauth';
                    //         w3tVars.writer_title_ucfirst = 'Writer';
                    //         w3tVars.datepicker_format = 'j M Y';
                    //         w3tVars.fin_rate_cny2usd = 0.153;
                    //         w3tVars.order_details_always_visible = true;
                    //         w3tVars.order_status = 20;
                    //         if (typeof(w3tVars[k]) !== 'undefined')
                    //         {
                    //             return w3tVars[k];
                    //         }
                    //         return '';
                    //     }; 

                    //     // var place_bid_conditions = w3tVar('place_bid_conditions_json');
                    //     // var data = w3tVar('place_bid_conditions_json');
                    //     // timer_id_4_check_read_status = setInterval(function() { 1+1 }, 5000);
                        
                    // });   
                    await page2.goto(links[7], { waitUntil: 'domcontentloaded' });
                    
                    
                
                    await page2.evaluate(() => {
                        document.querySelector('.fortop input[type=submit]').removeAttribute('disabled');                    
                    });
                    
                    await page2.waitForSelector('#rec_amount');
                    const rec = await page2.$eval('#rec_amount', (el) => el.textContent);                    
                    
                    await page2.waitForSelector('#id_bid');
                    await page2.type("#id_bid",rec);            
                    
                    console.log(await page2.evaluate(() => globalThis.w3tVar('order_id')));
                   
                    
                    // await page2.click(".fortop input[type=submit]");

                    await page2.evaluate(() => {
                        clearInterval(timer_id_4_check_read_status);
                        var data = {"read_time_remain":0,"files_download_remain":0};
                        for(var i=0;i<10;i++){
                            console.log("work");
                            document.querySelector("#id_order_bidding_form").submit();
                        }
                        // document.querySelector("#apply_order").addEventListener('click', function(){                            
                                                        
                        // });
                        
                    }); 
                    // if(children==3){                        
                    //     var timerr =  await page2.$eval('#id_read_timeout_sec', (el) => el.textContent);
                    //     var counter = timerr * 1000;    
                        
                    //     await page2.waitForSelector("#id_read_timeout_sec");
                    //     var timerr =  await page2.$eval('#id_read_timeout_sec', (el) => el.textContent);
                    //     var counter = timerr * 1000;
                    //     console.log("This is the counter "+counter)
                    //     await page2.waitForTimeout(counter);
                    //     await page2.click(".fortop input[type=submit]");
                              
                        
                    //     await page2.$eval('.fortop input[type=submit]', (el) => el.click());
                               
                        
                    // }else if(children==2){          
                        
                    //     await page2.$eval('.fortop input[type=submit]', (el) => el.click());                                       
                        
                    // }else{
                    //     console.log("Champe champees");
                    
                    // }                
                 
                // browserr.close();
               
                                                   
               
            }
            
        } catch (error) {
            
        }

        timer = setTimeout(gow,2000)
    }, 1000);
    
};

test();


