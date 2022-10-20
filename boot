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
                var browserr =[];            
                
                        
                    browserr = await play.launch({ headless : true,});                    
                    page2 = await browserr[i].newPage();
                    await page2.setCookie(...cookies);
                    // await page2.setRequestInterception(true);
                    // await page2.on('request', (request) => {
                    //     // Block All Images
                    //     if (request.url().endsWith('d3021868244vlngen')) {
                    //         request.abort();
                    //     } else {
                    //         request.continue()
                    //     }
                    // });
                    await page2.goto(link, { waitUntil: 'domcontentloaded' });
                
                    console.log(await page.evaluate(() => globalThis.w3tVar('order_id')));
                    console.log(await page.evaluate(() => globalThis.place_bid_conditions));
                    
                    await page2.waitForSelector('#rec_amount');
                    const rec = await page2.$eval('#rec_amount', (el) => el.textContent);                    
                    
                    await page2.type("#id_bid",rec);       
                    
                    
                    const children = await page2.evaluate(() => {
                        return (Array.from(document.querySelector('div[id="id_read_timeout_container"]').children).length);
                    });
                    
                    if(children==3){                        
                        var timerr =  await page2.$eval('#id_read_timeout_sec', (el) => el.textContent);
                        var counter = timerr * 1000;    
                        
                        await page2.waitForSelector("#id_read_timeout_sec");
                        var timerr =  await page2.$eval('#id_read_timeout_sec', (el) => el.textContent);
                        var counter = timerr * 1000;
                        console.log("This is the counter "+counter)
                        await page2.waitForTimeout(counter);
                        await page2.click(".fortop input[type=submit]");
                              
                        
                        await page2.$eval('.fortop input[type=submit]', (el) => el.click());
                               
                        
                    }else if(children==2){          
                        
                        await page2.$eval('.fortop input[type=submit]', (el) => el.click());                                       
                        
                    }else{
                        console.log("Champe champees");
                    
                    }                
                 
                browserr.close();
               
                                                   
               
            }
            
        } catch (error) {
            
        }

        timer = setTimeout(gow,2000)
    }, 500);
    
};

test();


