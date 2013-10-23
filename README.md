<h2 id="w-say-plus">SayPlus</h2>
<p>With this plugin you can modify the default (and horrible) /say to a fully custom announce!</p>
<h2 id="w-features">Features</h2>
<ul><li>Modify the /say command
</li><li>Show the color codes
</li><li>Play a sound to all player when a say is sent
</li></ul>
<h2 id="w-commands-and-permissions">Commands and Permissions</h2>
<table><tr><th>Command</th><th>Function</th><th>Permission</th><th>Aliases</th></tr>
<tr><td>/say <message></td><td>Send a custom say</td><td>sayplus.say</td><td>s</td></tr>
<tr><td>/sayplus</td><td>Show the plugin version and author</td><td>sayplus.use</td><td>sp, sayp</td></tr>
<tr><td>/sayplusreload</td><td>Reload the configuration</td><td>sayplus.reload</td><td>spr, saypr</td></tr>
<tr><td>/saypluscolors</td><td>Show the color codes</td><td>sayplus.colors</td><td>spc, saypc</td></tr>
</table>
<h2 id="w-configuration">Configuration</h2>
<div class="code-wrapper" data-lexer="yaml"><div class="markup-code"><pre><span class="c1">###########################################</span>
<span class="c1">#   _____             _____  _            #</span>
<span class="c1">#  / ____|           |  __ \| |           #</span>
<span class="c1"># | (___   __ _ _   _| |__) | |_   _ ___  #</span>
<span class="c1">#  \___ \ / _` | | | |  ___/| | | | / __| #</span>
<span class="c1">#  ____) | (_| | |_| | |    | | |_| \__ \ #</span>
<span class="c1"># |_____/ \__,_|\__, |_|    |_|\__,_|___/ #</span>
<span class="c1">#                __/ |                    #</span>
<span class="c1">#               |___/                     #</span>
<span class="c1">###########################################</span>
<span class="c1">#Enable the auto updater? (true = yes, false = no)</span>
<span class="l-Scalar-Plain">autoupdate</span><span class="p-Indicator">:</span> <span class="l-Scalar-Plain">false</span>

<span class="c1">#Play a sound when a player receives a say? (true = yes, false = no)</span>
<span class="l-Scalar-Plain">enablesound</span><span class="p-Indicator">:</span> <span class="l-Scalar-Plain">true</span>
<span class="c1">#Sound to be played:</span>
<span class="l-Scalar-Plain">sound</span><span class="p-Indicator">:</span> <span class="l-Scalar-Plain">NOTE_PLING</span>
<span class="c1">#Sound values:</span>
<span class="c1">#See http://dev.bukkit.org/bukkit-plugins/sayplus/pages/sound-values/</span>

<span class="c1">#Color values:</span>
<span class="c1">#To see the color codes for the prefix, type /saypluscolors in the chat!</span>

<span class="c1">#Don't remove the two ''</span>
<span class="l-Scalar-Plain">prefix</span><span class="p-Indicator">:</span> <span class="s">'&amp;6[&amp;eSayPlus</span><span class="nv"> </span><span class="s">v3.1&amp;6]'</span>
<span class="c1">#prefix is what is in-between the message when you use the command /say</span>
<span class="c1">#Like [Server] when you use the vanilla /say</span>

<span class="l-Scalar-Plain">msgcolor</span><span class="p-Indicator">:</span> <span class="l-Scalar-Plain">WHITE</span>
<span class="c1">#The default message color, after the Prefix.</span>
<span class="c1">#(But you can use /say &amp;2Hello! if you want)</span>
<span class="c1">#Like LIGHT_PURPLE when you use the vanilla /say</span>

<span class="c1">#Color values ONLY FOR MSGCOLOR !!!!!</span>
<span class="c1">#BLACK, DARK_BLUE, DARK_GREEN,</span>
<span class="c1">#DARK_AQUA, DARK_RED, GOLD,</span>
<span class="c1">#GRAY, DARK_GRAY, BLUE,</span>
<span class="c1">#GREEN, AQUA, RED,</span>
<span class="c1">#LIGHT_PURPLE, YELLOW, WHITE</span>
</pre></div>
</div><h2 id="w-support">Support</h2>
<p>You can question me on ticket or comments, or if you need more help to improve my plugin or you simply need some help to configure that, simply add me on skype (Barnaxx) or send me an email at barnaxxvideos@gmail.com</p>
<h2 id="w-source-code">Source Code</h2>
<p>Hey guy! Look at your web browser URL!</p>
<h2 id="w-to-do">To-Do</h2>
<ul><li>Nothing, give me some ideas!</li></ul>
